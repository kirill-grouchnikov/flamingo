package test.common;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Window;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip.StripOrientation;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

import test.common.LocaleSwitcher.LocaleCallback;
import test.svg.transcoded.format_justify_center;
import test.svg.transcoded.format_justify_left;
import test.svg.transcoded.format_justify_right;
import test.svg.transcoded.format_text_bold;
import test.svg.transcoded.format_text_italic;
import test.svg.transcoded.format_text_strikethrough;
import test.svg.transcoded.format_text_underline;

public class TestButtonStripVertical extends JFrame {
	protected Locale currLocale;

	private JPanel buttonPanel;

	public TestButtonStripVertical() {
		super("Tests for vertical buttons strips");

		buttonPanel = getButtonPanel();
		this.add(buttonPanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JComboBox localeSwitcher = LocaleSwitcher
				.getLocaleSwitcher(new LocaleCallback() {
					@Override
					public void onLocaleSelected(Locale selected) {
						currLocale = selected;
						remove(buttonPanel);
						buttonPanel = getButtonPanel();
						add(buttonPanel, BorderLayout.CENTER);
						Window window = SwingUtilities
								.getWindowAncestor(buttonPanel);
						window.applyComponentOrientation(ComponentOrientation
								.getOrientation(currLocale));
						SwingUtilities.updateComponentTreeUI(window);
					}
				});
		controlPanel.add(localeSwitcher);
		this.add(controlPanel, BorderLayout.SOUTH);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	protected JPanel getButtonPanel() {
		FormLayout lm = new FormLayout(
				"center:pref, 4dlu, center:pref, 4dlu, center:pref, 4dlu, center:pref, 4dlu, center:pref, 4dlu, center:pref",
				"");
		DefaultFormBuilder builder = new DefaultFormBuilder(lm);
		builder.setDefaultDialogBorder();

		builder.append("h1.0-v0.5");
		builder.append("h1.0-v0.75");
		builder.append("h1.0-v1.0");
		builder.append("h0.5-v0.75");
		builder.append("h0.75-v0.75");
		builder.append("h1.0-v0.75");

		builder.append(getStrip1(1.0, 0.5), getStrip1(1.0, 0.75), getStrip1(
				1.0, 1.0));
		builder.append(getStrip1(0.5, 0.75), getStrip1(0.75, 0.75), getStrip1(
				1.0, 0.75));

		builder.append(getStrip2(1.0, 0.5), getStrip2(1.0, 0.75), getStrip2(
				1.0, 1.0));
		builder.append(getStrip2(0.5, 0.75), getStrip2(0.75, 0.75), getStrip2(
				1.0, 0.75));
		return builder.getPanel();
	}

	private JCommandButtonStrip getStrip1(double hgapScaleFactor,
			double vgapScaleFactor) {
		JCommandButtonStrip buttonStrip = new JCommandButtonStrip(
				StripOrientation.VERTICAL);
		buttonStrip.setHGapScaleFactor(hgapScaleFactor);
		buttonStrip.setVGapScaleFactor(vgapScaleFactor);
		buttonStrip.add(new JCommandButton("", new format_justify_left()));
		buttonStrip.add(new JCommandButton("", new format_justify_center()));
		buttonStrip.add(new JCommandButton("", new format_justify_right()));
		return buttonStrip;
	}

	private JCommandButtonStrip getStrip2(double hgapScaleFactor,
			double vgapScaleFactor) {
		JCommandButtonStrip buttonStrip2 = new JCommandButtonStrip(
				StripOrientation.VERTICAL);
		buttonStrip2.setHGapScaleFactor(hgapScaleFactor);
		buttonStrip2.setVGapScaleFactor(vgapScaleFactor);
		buttonStrip2.add(new JCommandButton("", new format_text_bold()));
		buttonStrip2.add(new JCommandButton("", new format_text_italic()));
		buttonStrip2.add(new JCommandButton("", new format_text_underline()));
		buttonStrip2
				.add(new JCommandButton("", new format_text_strikethrough()));
		return buttonStrip2;
	}

	public static void main(String[] args) throws Exception {
		UIManager
				.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TestButtonStripVertical().setVisible(true);
			}
		});
	}
}
