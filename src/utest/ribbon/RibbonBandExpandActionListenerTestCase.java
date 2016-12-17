package utest.ribbon;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy;
import org.pushingpixels.flamingo.internal.ui.ribbon.BasicRibbonBandUI;

import test.svg.transcoded.edit_copy;
import test.svg.transcoded.edit_cut;
import test.svg.transcoded.edit_paste;

public class RibbonBandExpandActionListenerTestCase extends
		FestSwingJUnitTestCase {
	JRibbonFrame ribbonFrame;

	JRibbonBand ribbonBand1;

	JRibbonBand ribbonBand2;

	int count1;

	int count2;

	private class ExpandActionListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count1++;
		}
	}

	private class ExpandActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count2++;
		}
	}

	private static JRibbonBand getSampleRibbonBand(
			ActionListener expandActionListener) {
		JRibbonBand clipboardBand = new JRibbonBand("Clipboard",
				new edit_paste(), expandActionListener);

		JCommandButton mainButton = new JCommandButton("Paste",
				new edit_paste());
		mainButton
				.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
		clipboardBand.addCommandButton(mainButton, RibbonElementPriority.TOP);

		JCommandButton cutButton = new JCommandButton("Cut", new edit_cut());
		cutButton
				.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
		clipboardBand.addCommandButton(cutButton, RibbonElementPriority.MEDIUM);

		JCommandButton copyButton = new JCommandButton("Copy", new edit_copy());
		copyButton
				.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
		clipboardBand
				.addCommandButton(copyButton, RibbonElementPriority.MEDIUM);

		JCommandButton formatButton = new JCommandButton("Format",
				new edit_paste());
		formatButton
				.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
		clipboardBand.addCommandButton(formatButton,
				RibbonElementPriority.MEDIUM);

		List<RibbonBandResizePolicy> resizePolicies = new ArrayList<RibbonBandResizePolicy>();
		resizePolicies.add(new CoreRibbonResizePolicies.Mirror(clipboardBand
				.getControlPanel()));
		resizePolicies.add(new CoreRibbonResizePolicies.Mid2Low(clipboardBand
				.getControlPanel()));
		resizePolicies.add(new IconRibbonBandResizePolicy(clipboardBand
				.getControlPanel()));
		clipboardBand.setResizePolicies(resizePolicies);

		return clipboardBand;
	}

	@Override
	protected void onSetUp() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				count1 = 0;
				count2 = 0;

				ribbonFrame = new JRibbonFrame();

				ribbonBand1 = getSampleRibbonBand(null);
				ribbonBand2 = getSampleRibbonBand(new ExpandActionListener1());
				ribbonFrame.getRibbon().addTask(
						new RibbonTask("Task", ribbonBand1, ribbonBand2));

				Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment()
						.getMaximumWindowBounds();
				ribbonFrame.setPreferredSize(new Dimension(r.width,
						r.height / 2));
				ribbonFrame.pack();
				ribbonFrame.setLocation(r.x, r.y);
				ribbonFrame.setVisible(true);
				ribbonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
	}

	@Test
	public void testDefaultActionListeners() {
		AbstractCommandButton expandButton1 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand1.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton1).isNull();

		AbstractCommandButton expandButton2 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand2.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton2).isNotNull();

		robot().click(expandButton2);
		robot().waitForIdle();

		Assertions.assertThat(count1).isEqualTo(1);
		Assertions.assertThat(count2).isZero();
	}

	@Test
	public void testSwitchFromNoListener() {
		AbstractCommandButton expandButton1 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand1.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton1).isNull();
		Assertions.assertThat(count1).isZero();
		Assertions.assertThat(count2).isZero();

		// set a non-null expand action listener on the first ribbon band
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				ribbonBand1
						.setExpandActionListener(new ExpandActionListener1());
			}
		});
		robot().waitForIdle();

		expandButton1 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand1.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton1).isNotNull();

		robot().click(expandButton1);
		robot().waitForIdle();

		Assertions.assertThat(count1).isEqualTo(1);
		Assertions.assertThat(count2).isZero();
	}

	@Test
	public void testSwitchToNoListener() {
		AbstractCommandButton expandButton2 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand2.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton2).isNotNull();
		Assertions.assertThat(count1).isZero();
		Assertions.assertThat(count2).isZero();

		// set a null expand action listener on the second ribbon band
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				ribbonBand2.setExpandActionListener(null);
			}
		});
		robot().waitForIdle();

		expandButton2 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand2.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton2).isNull();
	}

	@Test
	public void testSwitchToAnotherListener() {
		AbstractCommandButton expandButton2 = GuiActionRunner
				.execute(new GuiQuery<AbstractCommandButton>() {
					@Override
					protected AbstractCommandButton executeInEDT()
							throws Throwable {
						return ((BasicRibbonBandUI) ribbonBand2.getUI())
								.getExpandButton();
					}
				});
		robot().waitForIdle();

		Assertions.assertThat(expandButton2).isNotNull();
		Assertions.assertThat(count1).isZero();
		Assertions.assertThat(count2).isZero();

		robot().click(expandButton2);
		robot().waitForIdle();

		Assertions.assertThat(count1).isEqualTo(1);
		Assertions.assertThat(count2).isZero();

		// set another expand action listener on the second ribbon band
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				ribbonBand2
						.setExpandActionListener(new ExpandActionListener2());
			}
		});
		robot().waitForIdle();

		robot().click(expandButton2);
		robot().waitForIdle();

		Assertions.assertThat(count1).isEqualTo(1);
		Assertions.assertThat(count2).isEqualTo(1);
	}

}
