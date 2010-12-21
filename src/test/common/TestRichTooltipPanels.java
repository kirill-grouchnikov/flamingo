package test.common;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;

public class TestRichTooltipPanels extends JFrame {
	public TestRichTooltipPanels() {
		RichTooltip rt = new RichTooltip();
		rt
				.setTitle("Main title that can go over multiple lines of text even exceeding the bigger");
		rt
				.addDescriptionSection("Simple description that can go over multiple lines of text even exceeding the bigger");
		rt
				.addDescriptionSection("Second paragraph that can be multiline as well to test this feature");
		try {
			rt.setMainImage(ImageIO.read(TestRichTooltipPanels.class
					.getResource("/test/resource/address-book-new.png")));
			rt.setFooterImage(ImageIO.read(TestRichTooltipPanels.class
					.getResource("/test/resource/help-browser.png")));
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		rt
				.addFooterSection("Multiline footer description to provide a little bit more information on this subject");

		JRichTooltipPanel panel = new JRichTooltipPanel(rt);
		this.add(panel);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TestRichTooltipPanels().setVisible(true);
			}
		});
	}

}
