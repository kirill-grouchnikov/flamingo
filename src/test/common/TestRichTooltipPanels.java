package test.common;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.internal.ui.common.JRichTooltipPanel;

import test.ribbon.help_browser;
import test.svg.transcoded.address_book_new;

public class TestRichTooltipPanels extends JFrame {
	public TestRichTooltipPanels() {
		RichTooltip rt = new RichTooltip();
		rt.setTitle("Main title that can go over multiple lines of text even exceeding the bigger");
		rt.addDescriptionSection(
				"Simple description that can go over multiple lines of text even exceeding the bigger");
		rt.addDescriptionSection(
				"Second paragraph that can be multiline as well to test this feature");
		rt.setMainImage(new address_book_new(), new Dimension(32, 32));
		rt.setFooterIcon(new help_browser());
		rt.addFooterSection(
				"Multiline footer description to provide a little bit more information on this subject");

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
