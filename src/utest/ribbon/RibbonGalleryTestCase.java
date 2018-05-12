package utest.ribbon;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.pushingpixels.flamingo.api.common.FlamingoCommand;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.FlamingoCommand.FlamingoCommandBuilder;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonGallery;

import junit.framework.TestCase;

/**
 * Testing the internal {@link JRibbonGallery} class. Each test case operates on the same ribbon
 * gallery that initially has four groups of ten buttons each.
 * 
 * @author Kirill Grouchnikov
 */
public class RibbonGalleryTestCase extends TestCase {
    FlamingoCommand[][] commands;

    JRibbonGallery gallery;

    JRibbonFrame ribbonFrame;

    JRibbonBand ribbonBand;

    final static String GALLERY_NAME = "Gallery";

    @Override
    protected void setUp() throws Exception {
        this.commands = new FlamingoCommand[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                final String id = "[" + i + ":" + j + "]";
                this.commands[i][j] = new FlamingoCommandBuilder().setTitle("Button " + id)
                        .setIcon(new EmptyResizableIcon(32))
                        .setAction((ActionEvent e) -> System.out.println("Selected " + id))
                        .setToggle().build();
            }
        }

        this.ribbonFrame = new JRibbonFrame();

        this.ribbonBand = new JRibbonBand("Band", new EmptyResizableIcon(32));

        Map<RibbonElementPriority, Integer> visibleButtonCounts = new HashMap<RibbonElementPriority, Integer>();
        visibleButtonCounts.put(RibbonElementPriority.LOW, 1);
        visibleButtonCounts.put(RibbonElementPriority.MEDIUM, 6);
        visibleButtonCounts.put(RibbonElementPriority.TOP, 10);

        List<StringValuePair<List<FlamingoCommand>>> galleryCommands = new ArrayList<StringValuePair<List<FlamingoCommand>>>();
        for (int i = 0; i < 4; i++) {
            List<FlamingoCommand> galleryCommandsList = new ArrayList<FlamingoCommand>();
            for (int j = 0; j < 10; j++) {
                galleryCommandsList.add(this.commands[i][j]);
            }
            galleryCommands.add(
                    new StringValuePair<List<FlamingoCommand>>("Group " + i, galleryCommandsList));
        }

        this.ribbonBand.addRibbonGallery(GALLERY_NAME, galleryCommands, visibleButtonCounts, 6, 4,
                RibbonElementPriority.TOP);
        this.ribbonFrame.getRibbon().addTask(new RibbonTask("Task 0", this.ribbonBand));

        this.gallery = this.ribbonBand.getControlPanel().getRibbonGallery(GALLERY_NAME);
    }

    public void testCreation() {
        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 40);
        for (int i = 0; i < this.gallery.getCommandGroupCount(); i++) {
            List<FlamingoCommand> commandGroup = this.gallery.getCommandGroup("Group " + i);
            assertEquals(commandGroup.size(), 10);
            for (int j = 0; j < 10; j++) {
                assertEquals(commandGroup.get(j), this.commands[i][j]);
            }
        }
    }

    public void testSelection() {
        for (int i = 0; i < this.gallery.getCommandCount(); i++) {
            assertFalse(this.gallery.getButtonAt(i).getActionModel().isSelected());
        }
        int[][] toTest = { { 0, 0 }, { 1, 5 }, { 2, 1 }, { 0, 8 }, { 3, 6 } };
        for (int sel = 0; sel < toTest.length; sel++) {
            int selRow = toTest[sel][0];
            int selCol = toTest[sel][1];
            this.ribbonBand.setSelectedRibbonGalleryCommand(GALLERY_NAME,
                    this.commands[selRow][selCol]);
            for (int i = 0; i < this.gallery.getCommandGroupCount(); i++) {
                List<FlamingoCommand> commandGroup = this.gallery.getCommandGroup("Group " + i);
                for (int j = 0; j < 10; j++) {
                    FlamingoCommand command = commandGroup.get(j);
                    JCommandToggleButton button = this.gallery.getButtonForCommand(command);
                    if ((i == selRow) && (j == selCol))
                        assertTrue(button.getActionModel().isSelected());
                    else
                        assertFalse(button.getActionModel().isSelected());
                }
            }
        }
    }

    public void testSelectionWithMouse() {
        final CountDownLatch latch = new CountDownLatch(1);
        final Throwable[] ts = new Throwable[1];
        for (int i = 0; i < this.gallery.getCommandCount(); i++) {
            assertFalse(this.gallery.getButtonAt(i).getActionModel().isSelected());
        }

        final int[] toTest = { 0, 1, 2, 3, 4, 5, 6 };
        final boolean[] tested = new boolean[toTest.length];

        SwingUtilities.invokeLater(() -> {
            Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .getMaximumWindowBounds();
            ribbonFrame.setPreferredSize(new Dimension(r.width, r.height / 2));
            ribbonFrame.pack();
            ribbonFrame.setLocation(r.x, r.y);
            ribbonFrame.setVisible(true);
            ribbonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Thread.currentThread()
                    .setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                        @Override
                        public void uncaughtException(Thread t, Throwable e) {
                            ts[0] = e;
                            e.printStackTrace();
                        }
                    });

            new Thread() {
                @Override
                public void run() {
                    try {
                        Robot robot = new Robot();

                        for (int sel = 0; sel < toTest.length; sel++) {
                            int selCol = toTest[sel];
                            final FlamingoCommand commandToClick = commands[0][selCol];
                            JCommandToggleButton buttonToClick = gallery
                                    .getButtonForCommand(commandToClick);
                            Point buttonLeftTop = buttonToClick.getLocationOnScreen();
                            int buttonWidth = buttonToClick.getWidth();
                            int buttonHeight = buttonToClick.getHeight();
                            robot.mouseMove(buttonLeftTop.x + buttonWidth / 2,
                                    buttonLeftTop.y + buttonHeight / 2);
                            robot.mousePress(InputEvent.BUTTON1_MASK);
                            robot.mouseRelease(InputEvent.BUTTON1_MASK);
                            Thread.sleep(1000);

                            final int fSel = sel;
                            SwingUtilities.invokeAndWait(new Runnable() {
                                public void run() {
                                    // System.out.println(toClick.getText()
                                    // + " selection is "
                                    // + toClick.getActionModel()
                                    // .isSelected());

                                    int selectedCount = 0;
                                    for (int i = 0; i < gallery.getCommandGroupCount(); i++) {
                                        List<FlamingoCommand> commandGroup = gallery
                                                .getCommandGroup("Group " + i);
                                        for (int j = 0; j < commandGroup.size(); j++) {
                                            FlamingoCommand command = commandGroup.get(j);
                                            JCommandToggleButton button = gallery
                                                    .getButtonForCommand(command);
                                            if (button.getActionModel().isSelected())
                                                selectedCount++;
                                        }
                                    }

                                    JCommandToggleButton buttonSel = gallery.getButtonForCommand(
                                            gallery.getCommandGroup("Group 0").get(fSel));
                                    tested[fSel] = (selectedCount == 1)
                                            && buttonSel.getActionModel().isSelected();
                                };
                            });
                        }
                    } catch (Throwable t) {
                        ts[0] = t;
                    }
                    new Thread() {
                        @Override
                        public void run() {
                            ribbonFrame.dispose();
                            latch.countDown();
                        }
                    }.start();
                }
            }.start();
        });
        try {
            assertTrue(latch.await(10, TimeUnit.SECONDS));
        } catch (Exception exc) {
        }
        assertNull(ts[0]);
        for (boolean test : tested)
            assertTrue(test);
    }

    public void testRemoval() {
        this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, this.commands[0][0]);
        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 39);
        for (int i = 0; i < this.gallery.getCommandGroupCount(); i++) {
            List<FlamingoCommand> commandGroup = this.gallery.getCommandGroup("Group " + i);
            if (i == 0) {
                assertEquals(commandGroup.size(), 9);
                for (int j = 0; j < 9; j++) {
                    assertEquals(commandGroup.get(j), this.commands[i][j + 1]);
                }
            } else {
                assertEquals(commandGroup.size(), 10);
                for (int j = 0; j < 10; j++) {
                    assertEquals(commandGroup.get(j), this.commands[i][j]);
                }
            }
        }
    }

    public void testRemoval2() {
        this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, this.commands[1][5]);
        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 39);
        for (int i = 0; i < this.gallery.getCommandGroupCount(); i++) {
            List<FlamingoCommand> commandGroup = this.gallery.getCommandGroup("Group " + i);
            if (i == 1) {
                assertEquals(commandGroup.size(), 9);
                for (int j = 0; j < 5; j++) {
                    assertEquals(commandGroup.get(j), this.commands[i][j]);
                }
                for (int j = 5; j < 9; j++) {
                    assertEquals(commandGroup.get(j), this.commands[i][j + 1]);
                }
            } else {
                assertEquals(commandGroup.size(), 10);
                for (int j = 0; j < 10; j++) {
                    assertEquals(commandGroup.get(j), this.commands[i][j]);
                }
            }
        }
    }

    public void testRemoval3() {
        this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, this.commands[2][9],
                this.commands[1][9]);
        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 38);
        for (int i = 0; i < this.gallery.getCommandGroupCount(); i++) {
            List<FlamingoCommand> ribbonGroup = this.gallery.getCommandGroup("Group " + i);
            if ((i == 2) || (i == 1)) {
                assertEquals(ribbonGroup.size(), 9);
                for (int j = 0; j < 9; j++) {
                    assertEquals(ribbonGroup.get(j), this.commands[i][j]);
                }
            } else {
                assertEquals(ribbonGroup.size(), 10);
                for (int j = 0; j < 10; j++) {
                    assertEquals(ribbonGroup.get(j), this.commands[i][j]);
                }
            }
        }
    }

    public void testRemovalAll() {
        int removed = 0;
        for (int i = 0; i < 4; i++) {
            List<Integer> indexes = new ArrayList<Integer>();
            for (int j = 0; j < 10; j++) {
                indexes.add(j);
            }
            Collections.shuffle(indexes);
            for (int toRemove : indexes) {
                this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, commands[i][toRemove]);
                removed++;
                assertEquals(this.gallery.getCommandCount(), 40 - removed);
            }
        }
        assertEquals(this.gallery.getCommandCount(), 0);
    }

    public void testRemovalAll2() {
        int removed = 0;
        for (int i = 0; i < 4; i++) {
            List<Integer> indexes = new ArrayList<Integer>();
            for (int j = 0; j < 5; j++) {
                indexes.add(j);
            }
            Collections.shuffle(indexes);
            for (int toRemove : indexes) {
                this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, commands[i][toRemove],
                        commands[i][9 - toRemove]);
                removed += 2;
                assertEquals(this.gallery.getCommandCount(), 40 - removed);
            }
        }
        assertEquals(this.gallery.getCommandCount(), 0);
    }

    public void testRemovalAll3() {
        int removed = 0;
        for (int i = 0; i < 2; i++) {
            List<Integer> indexes = new ArrayList<Integer>();
            for (int j = 0; j < 5; j++) {
                indexes.add(j);
            }
            Collections.shuffle(indexes);
            for (int toRemove : indexes) {
                this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, commands[i][toRemove],
                        commands[i][9 - toRemove], commands[i + 2][toRemove],
                        commands[i + 2][9 - toRemove]);
                removed += 4;
                assertEquals(this.gallery.getCommandCount(), 40 - removed);
            }
        }
        assertEquals(this.gallery.getCommandCount(), 0);
    }

    public void testRemovalAndSelection() {
        for (int i = 0; i < this.gallery.getCommandCount(); i++) {
            assertFalse(this.gallery.getButtonAt(i).getActionModel().isSelected());
        }

        int[][] toTest = { { 0, 2 }, { 1, 6 }, { 2, 8 }, { 0, 3 }, { 3, 1 } };
        for (int sel = 0; sel < toTest.length; sel++) {
            int selRow = toTest[sel][0];
            int selCol = toTest[sel][1];
            this.ribbonBand.setSelectedRibbonGalleryCommand(GALLERY_NAME,
                    this.commands[selRow][selCol]);
            this.ribbonBand.removeRibbonGalleryCommands(GALLERY_NAME, this.commands[selRow][selCol]);
            for (int i = 0; i < this.gallery.getCommandGroupCount(); i++) {
                List<FlamingoCommand> commandGroup = this.gallery.getCommandGroup("Group " + i);
                for (int j = 0; j < commandGroup.size(); j++) {
                    FlamingoCommand command = commandGroup.get(j);
                    JCommandToggleButton button = this.gallery.getButtonForCommand(command);
                    assertFalse(button.getActionModel().isSelected());
                }
            }
        }
    }

    public void testAddition() {
        FlamingoCommand newCommand = new FlamingoCommandBuilder().setTitle("New")
                .setIcon(new EmptyResizableIcon(32))
                .setAction((ActionEvent e) -> System.out.println("New"))
                .setToggle().build();
        this.ribbonBand.addRibbonGalleryCommands(GALLERY_NAME, "Group 0", newCommand);

        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 41);
        assertEquals(this.gallery.getCommandGroup("Group 0").size(), 11);
        assertEquals(this.gallery.getCommandGroup("Group 1").size(), 10);
        assertEquals(this.gallery.getCommandGroup("Group 2").size(), 10);
        assertEquals(this.gallery.getCommandGroup("Group 3").size(), 10);

        FlamingoCommand newCommand2 = new FlamingoCommandBuilder().setTitle("New 2")
                .setIcon(new EmptyResizableIcon(32))
                .setAction((ActionEvent e) -> System.out.println("New 2"))
                .setToggle().build();
        this.ribbonBand.addRibbonGalleryCommands(GALLERY_NAME, "Group non-existent", newCommand2);

        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 41);
        assertEquals(this.gallery.getCommandGroup("Group 0").size(), 11);
        assertEquals(this.gallery.getCommandGroup("Group 1").size(), 10);
        assertEquals(this.gallery.getCommandGroup("Group 2").size(), 10);
        assertEquals(this.gallery.getCommandGroup("Group 3").size(), 10);
        assertTrue(this.gallery.getCommandGroup("Group 0").contains(newCommand));

        FlamingoCommand newCommand3 = new FlamingoCommandBuilder().setTitle("New 3")
                .setIcon(new EmptyResizableIcon(32))
                .setAction((ActionEvent e) -> System.out.println("New 3"))
                .setToggle().build();
        FlamingoCommand newCommand4 = new FlamingoCommandBuilder().setTitle("New 4")
                .setIcon(new EmptyResizableIcon(32))
                .setAction((ActionEvent e) -> System.out.println("New 4"))
                .setToggle().build();
        this.ribbonBand.addRibbonGalleryCommands(GALLERY_NAME, "Group 2", newCommand3, newCommand4);

        assertEquals(this.gallery.getCommandGroupCount(), 4);
        assertEquals(this.gallery.getCommandCount(), 43);
        assertEquals(this.gallery.getCommandGroup("Group 0").size(), 11);
        assertEquals(this.gallery.getCommandGroup("Group 1").size(), 10);
        assertEquals(this.gallery.getCommandGroup("Group 2").size(), 12);
        assertEquals(this.gallery.getCommandGroup("Group 3").size(), 10);
        assertTrue(this.gallery.getCommandGroup("Group 0").contains(newCommand));
        assertTrue(this.gallery.getCommandGroup("Group 2").contains(newCommand3));
        assertTrue(this.gallery.getCommandGroup("Group 2").contains(newCommand4));
    }
}
