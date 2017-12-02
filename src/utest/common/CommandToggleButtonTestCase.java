package utest.common;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.awt.AWT;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.junit.Before;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

import utest.svg.transcoded.Edit_cut;
import utest.svg.transcoded.Edit_paste;

public class CommandToggleButtonTestCase extends FestSwingJUnitTestCase {
    JFrame buttonFrame;
    int count;
    JCommandToggleButton button;

    @Override
    @Before
    public void onSetUp() {
        final ResizableIcon icon = Edit_paste.of(32, 32);

        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttonFrame = new JFrame();
                buttonFrame.setLayout(new FlowLayout());
                button = new JCommandToggleButton("test", icon);
                button.setDisplayState(CommandButtonDisplayState.BIG);
                buttonFrame.add(button);
                buttonFrame.setSize(300, 200);
                buttonFrame.setLocationRelativeTo(null);
                buttonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                buttonFrame.setVisible(true);

                count = 0;
                button.addActionListener((ActionEvent e) -> count++);
            }
        });

        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                Point locOnScreen = buttonFrame.getLocationOnScreen();
                locOnScreen.move(10, 20);
                robot().moveMouse(locOnScreen);
            }
        });
    }

    @Test
    public void sanityCheck() {
        String buttonText = GuiActionRunner.execute(new GuiQuery<String>() {
            @Override
            protected String executeInEDT() throws Throwable {
                return button.getText();
            }
        });
        Assertions.assertThat(buttonText).isEqualTo("test");
    }

    @Test
    public void activateButtonWithMouse() {
        robot().click(button);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isTrue();
    }

    @Test
    public void activateButtonWithSpace() {
        robot().moveMouse(button);
        robot().pressAndReleaseKeys(KeyEvent.VK_SPACE);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isTrue();
    }

    @Test
    public void activateButtonWithAPI() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.doActionClick();
            }
        });
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void selectButtonWithAPI() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // action listeners are triggered on press and not on
        // selection
        Assertions.assertThat(count).isEqualTo(0);
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isTrue();
    }

    @Test
    public void fireActionOnPress() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setFireActionOnPress(false);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isFireActionOnPress();
            }
        })).isFalse();

        // press mouse over the button
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isFalse();

        // release mouse
        robot().releaseMouseButtons();
        robot().waitForIdle();
        // action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(1);
        // toggle button should now be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isTrue();

        // mark the button to fire the action listeners on mouse press
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setFireActionOnPress(true);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isFireActionOnPress();
            }
        })).isTrue();

        // press mouse over the button
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();
        // action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(2);
        // toggle button should not be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isFalse();

        // release mouse
        robot().releaseMouseButtons();
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(2);
        // toggle button should still be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void pressButtonAndDisableBeforeRelease() {
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();

        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setEnabled(false);
            }
        });

        robot().releaseMouseButtons();
        robot().waitForIdle();

        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);
        // toggle button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void pressButtonAndMoveAwayBeforeRelease() {
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();

        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();

        robot().releaseMouseButtons();
        robot().waitForIdle();

        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);
        // toggle button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void changeText() {
        String buttonText = GuiActionRunner.execute(new GuiQuery<String>() {
            @Override
            protected String executeInEDT() throws Throwable {
                return button.getText();
            }
        });
        Assertions.assertThat(buttonText).isEqualTo("test");

        final String newText = "New text";
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setText(newText);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<String>() {
            @Override
            protected String executeInEDT() throws Throwable {
                return button.getText();
            }
        })).isEqualTo(newText);

        // test that the button is still clickable
        robot().click(button);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void changeIcon() {
        Dimension iconDimension = GuiActionRunner.execute(new GuiQuery<Dimension>() {
            @Override
            protected Dimension executeInEDT() throws Throwable {
                Icon icon = button.getIcon();
                return new Dimension(icon.getIconWidth(), icon.getIconHeight());
            }
        });

        final ResizableIcon cutIcon = Edit_cut.of(16, 16);
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setIcon(cutIcon);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Dimension>() {
            @Override
            protected Dimension executeInEDT() throws Throwable {
                Icon icon = button.getIcon();
                return new Dimension(icon.getIconWidth(), icon.getIconHeight());
            }
        })).isEqualTo(iconDimension);

        // test that the button is still clickable
        robot().click(button);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }
}
