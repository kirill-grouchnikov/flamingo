package test.svg;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.svg.SvgBatikResizableIcon;

public class SVGZBatikTestApplication extends JFrame {

	/**
	 * Main method for testing.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		SVGZBatikTestApplication app = new SVGZBatikTestApplication();
		app.setSize(400, 400);
		app.setLocationRelativeTo(null);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}

	JFrame frame;

	SvgIconPanel panel;

	public SVGZBatikTestApplication() {
		this.setLayout(new BorderLayout());
		JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton size16 = new JButton("size16");
		size16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// panel.iconButton.getIcon().setDimension(new Dimension(16,
				// 16));
				panel.iconButton.updateCustomDimension(16);
				panel.doLayout();
				panel.iconButton.doLayout();
				panel.repaint();
			}
		});
		JButton size32 = new JButton("size32");
		size32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.iconButton.updateCustomDimension(32);
				panel.doLayout();
				panel.iconButton.doLayout();
				panel.repaint();
			}
		});
		JButton size256 = new JButton("size256");
		size256.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// panel.iconButton.getIcon()
				// .setDimension(new Dimension(128, 128));
				panel.iconButton.updateCustomDimension(256);
				panel.doLayout();
				panel.iconButton.doLayout();
				panel.repaint();
			}
		});
		buttons.add(size16);
		buttons.add(size32);
		buttons.add(size256);

		this.add(buttons, BorderLayout.SOUTH);
		this.add(panel = new SvgIconPanel(), BorderLayout.CENTER);
	}

	private static class SvgIconPanel extends JPanel {
		// SvgBatikResizableIcon icon;
		JCommandButton iconButton;

		public SvgIconPanel() {
			this.setLayout(new SvgIconPanelLayout());
			try {
				FileInputStream fis = new FileInputStream(
						"C:/JTools/icons/oxygen/categories/applications-accessories.svgz");
				SvgBatikResizableIcon icon = SvgBatikResizableIcon.getSvgzIcon(
						fis, new Dimension(32, 32));
				iconButton = new JCommandButton("just icon", icon);
				iconButton.setDisplayState(CommandButtonDisplayState.BIG);
				add(iconButton);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		private class SvgIconPanelLayout implements LayoutManager {
			public void addLayoutComponent(String name, Component comp) {
			}

			public void removeLayoutComponent(Component comp) {
			}

			public void layoutContainer(Container parent) {
				if (iconButton != null)
					iconButton.setBounds(0, 0,
							iconButton.getPreferredSize().width, iconButton
									.getPreferredSize().height);
			}

			public Dimension minimumLayoutSize(Container parent) {
				return this.preferredLayoutSize(parent);
			}

			public Dimension preferredLayoutSize(Container parent) {
				if (iconButton != null)
					return iconButton.getPreferredSize();
				else
					return new Dimension(0, 0);
			}
		}
	}
}