package utest.ribbon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButtonPanel;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelManager;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.flamingo.internal.utils.RenderingUtils;

import junit.framework.TestCase;
import utest.svg.transcoded.Edit_copy;
import utest.svg.transcoded.Edit_cut;
import utest.svg.transcoded.Edit_paste;
import utest.svg.transcoded.Font_x_generic;

public class RibbonMinimizedTestCase extends TestCase {
    private JRibbonFrame ribbonFrame;

    private JRibbon ribbon;

    protected static class QuickStylesPanel extends JCommandButtonPanel {
        public QuickStylesPanel() {
            super(32);

            for (int groupIndex = 0; groupIndex < 4; groupIndex++) {
                String iconGroupName = "Styles " + groupIndex;
                this.addButtonGroup(iconGroupName, groupIndex);
                for (int i = 0; i < 15; i++) {
                    final int index = i;
                    ResizableIcon fontIcon = new Font_x_generic();
                    ResizableIcon finalIcon = new DecoratedResizableIcon(fontIcon,
                            new DecoratedResizableIcon.IconDecorator() {
                                @Override
                                public void paintIconDecoration(Component c, Graphics g, int x,
                                        int y, int width, int height) {
                                    Graphics2D g2d = (Graphics2D) g.create();
                                    g2d.setColor(Color.black);
                                    g2d.setFont(UIManager.getFont("Label.font"));
                                    RenderingUtils.installDesktopHints(g2d);
                                    g2d.drawString("" + index, x + 2, y + height - 2);
                                    g2d.dispose();
                                }
                            });
                    JCommandToggleButton jrb = new JCommandToggleButton(null, finalIcon);
                    jrb.setName("Group " + groupIndex + ", index " + i);
                    jrb.addActionListener(
                            (ActionEvent e) -> System.out.println("Invoked action on " + index));
                    jrb.setActionRichTooltip(
                            new RichTooltip("Index " + i, "Sample tooltip for " + i));
                    this.addButtonToLastGroup(jrb);
                }
            }
            this.setSingleSelectionMode(true);
        }
    }

    private JRibbonBand getClipboardBand() {
        JRibbonBand clipboardBand = new JRibbonBand("Clipboard", new Edit_paste());
        clipboardBand.setExpandButtonKeyTip("FO");

        JCommandButton mainButton = new JCommandButton("Paste", new Edit_paste());
        mainButton.addActionListener((ActionEvent e) -> System.out.println("Pasted!"));
        mainButton.setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu(
                commandButton.getComponentOrientation()));
        mainButton.setCommandButtonKind(
                JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        RichTooltip mainRichTooltip = new RichTooltip();
        mainRichTooltip.setTitle("Paste");
        mainRichTooltip.addDescriptionSection("Paste the contents of the Clipboard");
        mainButton.setActionRichTooltip(mainRichTooltip);
        mainButton.setPopupKeyTip("V");

        RichTooltip mainPopupRichTooltip = new RichTooltip();
        mainPopupRichTooltip.setTitle("Paste");
        mainPopupRichTooltip.addDescriptionSection(
                "Click here for more options such as pasting only the values or formatting");
        mainButton.setPopupRichTooltip(mainPopupRichTooltip);

        clipboardBand.addCommandButton(mainButton, RibbonElementPriority.TOP);

        JCommandButton cutButton = new JCommandButton("Cut", new Edit_cut());
        cutButton.setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu(
                commandButton.getComponentOrientation()));
        cutButton.setCommandButtonKind(
                JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        RichTooltip cutRichTooltip = new RichTooltip();
        cutRichTooltip.setTitle("Cut");
        cutRichTooltip.addDescriptionSection(
                "Cut the selection from the document and put it on the Clipboard");
        cutButton.setActionRichTooltip(cutRichTooltip);
        cutButton.setPopupKeyTip("X");

        clipboardBand.addCommandButton(cutButton, RibbonElementPriority.MEDIUM);

        JCommandButton copyButton = new JCommandButton("Copy", new Edit_copy());
        copyButton.setPopupCallback((JCommandButton commandButton) -> new SamplePopupMenu(
                commandButton.getComponentOrientation()));
        copyButton
                .setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        copyButton.setPopupKeyTip("C");

        clipboardBand.addCommandButton(copyButton, RibbonElementPriority.MEDIUM);

        JCommandButton formatButton = new JCommandButton("Format", new Edit_paste());
        formatButton.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu popupMenu = new JCommandPopupMenu(new QuickStylesPanel(), 5, 3);
            JCommandMenuButton saveSelectionButton = new JCommandMenuButton("Save Selection",
                    new EmptyResizableIcon(16));
            saveSelectionButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Save Selection activated"));
            saveSelectionButton.setActionKeyTip("SS");
            popupMenu.addMenuButton(saveSelectionButton);

            JCommandMenuButton clearSelectionButton = new JCommandMenuButton("Clear Selection",
                    new EmptyResizableIcon(16));
            clearSelectionButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Clear Selection activated"));
            clearSelectionButton.setActionKeyTip("SC");
            popupMenu.addMenuButton(clearSelectionButton);

            popupMenu.addMenuSeparator();
            JCommandMenuButton applyStylesButton = new JCommandMenuButton("Apply Styles",
                    new EmptyResizableIcon(16));
            applyStylesButton.addActionListener(
                    (ActionEvent e) -> System.out.println("Apply Styles activated"));
            applyStylesButton.setActionKeyTip("SA");
            popupMenu.addMenuButton(applyStylesButton);
            return popupMenu;
        });

        formatButton.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        // pasteButton.addPopupActionListener(new SamplePopupActionListener());
        formatButton.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        formatButton.setPopupKeyTip("FP");

        clipboardBand.addCommandButton(formatButton, RibbonElementPriority.MEDIUM);

        List<RibbonBandResizePolicy> resizePolicies = new ArrayList<RibbonBandResizePolicy>();
        resizePolicies.add(new CoreRibbonResizePolicies.Mirror(clipboardBand.getControlPanel()));
        resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(clipboardBand.getControlPanel()));
        resizePolicies.add(new IconRibbonBandResizePolicy(clipboardBand.getControlPanel()));
        clipboardBand.setResizePolicies(resizePolicies);

        return clipboardBand;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        this.ribbonFrame = new JRibbonFrame();
        this.ribbon = this.ribbonFrame.getRibbon();

        RibbonTask task = new RibbonTask("Task", getClipboardBand());

        this.ribbon.addTask(task);

        Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.ribbonFrame.setPreferredSize(new Dimension(r.width, r.height / 2));
        this.ribbonFrame.pack();
        this.ribbonFrame.setLocation(r.x, r.y);
        this.ribbonFrame.setVisible(true);
        this.ribbonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void testMinimizeWithAPI() throws Exception {
        assertFalse(this.ribbon.isMinimized());

        this.ribbon.setMinimized(true);
        assertTrue(this.ribbon.isMinimized());
    }

    public void testMinimizeWithKeyboard() throws Exception {
        assertFalse(this.ribbon.isMinimized());

        Robot robot = new Robot();
        // wait between events to allow the Ctrl+F1 to be handled by Swing
        // and get to the ribbon
        robot.setAutoDelay(300);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F1);
        robot.keyRelease(KeyEvent.VK_F1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        assertTrue(this.ribbon.isMinimized());
    }

    public void testMinimizeWithMouse() throws Exception {
        assertFalse(this.ribbon.isMinimized());

        JRibbonTaskToggleButton taskButton = getTaskButton(this.ribbon, "Task");
        assertNotNull(taskButton);

        Robot robot = new Robot();
        // set enough delay to emulate double mouse click
        robot.setAutoDelay(20);
        // move the mouse to the center of the task toggle button
        Point taskButtonLoc = taskButton.getLocationOnScreen();
        robot.mouseMove(taskButtonLoc.x + taskButton.getWidth() / 2,
                taskButtonLoc.y + taskButton.getHeight() / 2);
        // emulate double click
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        assertTrue(this.ribbon.isMinimized());
    }

    public void testMinimizeAndPopup() throws Exception {
        this.ribbon.setMinimized(true);

        JRibbonTaskToggleButton taskButton = getTaskButton(this.ribbon, "Task");
        assertNotNull(taskButton);

        Robot robot = new Robot();
        // move the mouse to the center of the task toggle button
        Point taskButtonLoc = taskButton.getLocationOnScreen();
        robot.mouseMove(taskButtonLoc.x + taskButton.getWidth() / 2,
                taskButtonLoc.y + taskButton.getHeight() / 2);

        // mouse press should show the ribbon in popup
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        assertTrue(this.ribbon.isMinimized());
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));

        // mouse release should not affect the state of the ribbon
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        assertTrue(this.ribbon.isMinimized());
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));

        Thread.sleep(100);

        // mouse press should hide the ribbon in popup
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        assertTrue(this.ribbon.isMinimized());
        assertFalse(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));

        // mouse release should not affect the state of the ribbon
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        assertTrue(this.ribbon.isMinimized());
        assertFalse(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));

    }

    private static JRibbonTaskToggleButton getTaskButton(Component c, String title) {
        if (c instanceof JRibbonTaskToggleButton) {
            if (title.equals(((JRibbonTaskToggleButton) c).getText()))
                return (JRibbonTaskToggleButton) c;
        }

        if (c instanceof Container) {
            Container cont = (Container) c;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                JRibbonTaskToggleButton result = getTaskButton(cont.getComponent(i), title);
                if (result != null)
                    return result;
            }
        }

        return null;
    }

    public void testCommandButtonPopupInMinimizedRibbon() throws Exception {
        this.ribbon.setMinimized(true);

        JRibbonTaskToggleButton taskButton = getTaskButton(this.ribbon, "Task");
        assertNotNull(taskButton);

        Robot robot = new Robot();
        // move the mouse to the center of the task toggle button
        Point taskButtonLoc = taskButton.getLocationOnScreen();
        robot.mouseMove(taskButtonLoc.x + taskButton.getWidth() / 2,
                taskButtonLoc.y + taskButton.getHeight() / 2);

        // mouse press should show the ribbon in popup
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        assertTrue(this.ribbon.isMinimized());
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));

        List<PopupPanelManager.PopupInfo> popups = PopupPanelManager.defaultManager()
                .getShownPath();
        assertTrue(popups.size() > 0);

        JPopupPanel currPopupPanel = popups.get(popups.size() - 1).getPopupPanel();
        JCommandButton cutButton = getCommandButton(currPopupPanel, "Cut");
        assertNotNull(cutButton);

        Point cutButtonLoc = cutButton.getLocationOnScreen();
        Rectangle cutPopupArea = cutButton.getUI().getLayoutInfo().popupClickArea;

        // bring the popup of the cut button
        robot.mouseMove(cutButtonLoc.x + cutPopupArea.x + cutPopupArea.width / 2,
                cutButtonLoc.y + cutPopupArea.y + cutPopupArea.height / 2);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // ribbon should be minimized
        assertTrue(this.ribbon.isMinimized());
        // and showing in popup
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));
        // and cut button should show its popup
        assertTrue(cutButton.getPopupModel().isPopupShowing());

        // click in the popup area once again
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // ribbon should be minimized
        assertTrue(this.ribbon.isMinimized());
        // and showing in popup
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));
        // and cut button should not show its popup
        assertFalse(cutButton.getPopupModel().isPopupShowing());
    }

    public void testCommandButtonPopupInMinimizedRibbon2() throws Exception {
        this.ribbon.setMinimized(true);

        JRibbonTaskToggleButton taskButton = getTaskButton(this.ribbon, "Task");
        assertNotNull(taskButton);

        Robot robot = new Robot();
        // move the mouse to the center of the task toggle button
        Point taskButtonLoc = taskButton.getLocationOnScreen();
        robot.mouseMove(taskButtonLoc.x + taskButton.getWidth() / 2,
                taskButtonLoc.y + taskButton.getHeight() / 2);

        // mouse press should show the ribbon in popup
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        assertTrue(this.ribbon.isMinimized());
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));

        List<PopupPanelManager.PopupInfo> popups = PopupPanelManager.defaultManager()
                .getShownPath();
        assertTrue(popups.size() > 0);

        JPopupPanel currPopupPanel = popups.get(popups.size() - 1).getPopupPanel();
        JCommandButton cutButton = getCommandButton(currPopupPanel, "Cut");
        assertNotNull(cutButton);
        JCommandButton pasteButton = getCommandButton(currPopupPanel, "Paste");
        assertNotNull(pasteButton);

        Point cutButtonLoc = cutButton.getLocationOnScreen();
        Rectangle cutPopupArea = cutButton.getUI().getLayoutInfo().popupClickArea;
        Point pasteButtonLoc = pasteButton.getLocationOnScreen();
        Rectangle pastePopupArea = pasteButton.getUI().getLayoutInfo().popupClickArea;

        robot.setAutoDelay(500);

        // bring the popup of the cut button
        robot.mouseMove(cutButtonLoc.x + cutPopupArea.x + cutPopupArea.width / 2,
                cutButtonLoc.y + cutPopupArea.y + cutPopupArea.height / 2);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // ribbon should be minimized
        assertTrue(this.ribbon.isMinimized());
        // and showing in popup
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));
        // and cut button should show its popup
        assertTrue(cutButton.getPopupModel().isPopupShowing());
        // and paste button should not show its popup
        assertFalse(pasteButton.getPopupModel().isPopupShowing());

        // click in the popup area of paste button
        Thread.sleep(100);
        robot.mouseMove(pasteButtonLoc.x + pastePopupArea.x + pastePopupArea.width / 2,
                pasteButtonLoc.y + pastePopupArea.y + pastePopupArea.height / 2);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // ribbon should be minimized
        assertTrue(this.ribbon.isMinimized());
        // and showing in popup
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));
        // and cut button should not show its popup
        assertFalse(cutButton.getPopupModel().isPopupShowing());
        // and paste button should show its popup
        assertTrue(pasteButton.getPopupModel().isPopupShowing());

        // click in the popup area once again
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // ribbon should be minimized
        assertTrue(this.ribbon.isMinimized());
        // and showing in popup
        assertTrue(FlamingoUtilities.isShowingMinimizedRibbonInPopup(this.ribbon));
        // and cut button should not show its popup
        assertFalse(cutButton.getPopupModel().isPopupShowing());
        // and paste button should not show its popup
        assertFalse(pasteButton.getPopupModel().isPopupShowing());
    }

    private static JCommandButton getCommandButton(Component c, String title) {
        if (c instanceof JCommandButton) {
            if (title.equals(((JCommandButton) c).getText()))
                return (JCommandButton) c;
        }

        if (c instanceof Container) {
            Container cont = (Container) c;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                JCommandButton result = getCommandButton(cont.getComponent(i), title);
                if (result != null)
                    return result;
            }
        }

        return null;

    }

}
