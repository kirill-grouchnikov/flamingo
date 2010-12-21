package test.ribbon;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

import javax.swing.*;

import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.StringValuePair;
import org.pushingpixels.flamingo.api.common.icon.DecoratedResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonGallery;

public class RibbonGalleryCheck extends JRibbonFrame {
	JCommandToggleButton[][] buttons;

	JRibbonGallery gallery;

	JRibbonBand ribbonBand;

	final static String GALLERY_NAME = "Gallery";

	private static class TopLeftDecoration implements
			DecoratedResizableIcon.IconDecorator {
		int number;

		public TopLeftDecoration(int number) {
			this.number = number;
		}

		@Override
		public void paintIconDecoration(Component c, Graphics g, int x, int y,
				int width, int height) {
			g.setColor(Color.blue.darker());
			g
					.drawString("" + number, x + 2, y
							+ g.getFontMetrics().getAscent());
		}
	}

	private static class BottomRightDecoration implements
			DecoratedResizableIcon.IconDecorator {
		int number;

		public BottomRightDecoration(int number) {
			this.number = number;
		}

		@Override
		public void paintIconDecoration(Component c, Graphics g, int x, int y,
				int width, int height) {
			g.setColor(Color.red.darker());
			g.drawString("" + number, x + width
					- g.getFontMetrics().stringWidth("" + number) - 2, y
					+ height - g.getFontMetrics().getDescent());
		}
	}

	public RibbonGalleryCheck() {
		super("Ribbon gallery check");

		this.buttons = new JCommandToggleButton[4][10];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				this.buttons[i][j] = new JCommandToggleButton("Button " + i
						+ ":" + j, new DecoratedResizableIcon(
						new DisabledResizableIcon(RibbonElementPriority.TOP,
								32, 32), new TopLeftDecoration(i),
						new BottomRightDecoration(j)));
			}
		}

		this.ribbonBand = new JRibbonBand("Band", new EmptyResizableIcon(32));

		Map<RibbonElementPriority, Integer> visibleButtonCounts = new HashMap<RibbonElementPriority, Integer>();
		visibleButtonCounts.put(RibbonElementPriority.LOW, 4);
		visibleButtonCounts.put(RibbonElementPriority.MEDIUM, 5);
		visibleButtonCounts.put(RibbonElementPriority.TOP, 6);

		List<StringValuePair<List<JCommandToggleButton>>> galleryButtons = new ArrayList<StringValuePair<List<JCommandToggleButton>>>();
		for (int i = 0; i < 4; i++) {
			List<JCommandToggleButton> galleryButtonsList = new ArrayList<JCommandToggleButton>();
			for (int j = 0; j < 10; j++) {
				galleryButtonsList.add(this.buttons[i][j]);
			}
			galleryButtons.add(new StringValuePair<List<JCommandToggleButton>>(
					"Group " + i, galleryButtonsList));
		}

		this.ribbonBand.addRibbonGallery(GALLERY_NAME, galleryButtons,
				visibleButtonCounts, 6, 4, RibbonElementPriority.TOP);

		this.gallery = this.ribbonBand.getControlPanel().getRibbonGallery(
				GALLERY_NAME);

		this.getRibbon().addTask(new RibbonTask("Task 1", this.ribbonBand));

		JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton addToGroup0 = new JButton("Add one to 0");
		addToGroup0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JCommandToggleButton toAdd = new JCommandToggleButton(
						"Button 0 new", new DecoratedResizableIcon(
								new DisabledResizableIcon(
										RibbonElementPriority.TOP, 32, 32),
								new TopLeftDecoration(0),
								new BottomRightDecoration(99)));
				ribbonBand.addRibbonGalleryButtons(GALLERY_NAME, "Group 0",
						toAdd);
			}
		});
		controlPanel.add(addToGroup0);

		JButton addToGroup2 = new JButton("Add two to 2");
		addToGroup2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JCommandToggleButton toAdd = new JCommandToggleButton(
						"Button 2 new", new DecoratedResizableIcon(
								new DisabledResizableIcon(
										RibbonElementPriority.TOP, 32, 32),
								new TopLeftDecoration(2),
								new BottomRightDecoration(99)));
				JCommandToggleButton toAdd2 = new JCommandToggleButton(
						"Button 2 new 2", new DecoratedResizableIcon(
								new DisabledResizableIcon(
										RibbonElementPriority.TOP, 32, 32),
								new TopLeftDecoration(2),
								new BottomRightDecoration(66)));
				ribbonBand.addRibbonGalleryButtons(GALLERY_NAME, "Group 2",
						toAdd, toAdd2);
			}
		});
		controlPanel.add(addToGroup2);

		this.add(controlPanel, BorderLayout.SOUTH);
	}

	/**
	 * Main method for testing.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RibbonGalleryCheck c = new RibbonGalleryCheck();
				Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment()
						.getMaximumWindowBounds();
				c.setPreferredSize(new Dimension(r.width, r.height / 2));
				c.pack();
				c.setLocation(r.x, r.y);
				c.setVisible(true);
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
	}

}
