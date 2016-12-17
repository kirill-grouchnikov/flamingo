package utest.ribbon;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy;

public class RibbonBandLayoutTestCase extends FestSwingJUnitTestCase {
	private JCommandToggleButton findButton;
	private JCommandToggleButton replaceButton;
	private JCommandToggleButton findReplaceButton;
	private JCommandToggleButton selectAllButton;

	@Override
	protected void onSetUp() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				JRibbonFrame frame = new JRibbonFrame();

				JRibbonBand findBand = new JRibbonBand("Find",
						new EmptyResizableIcon(32));
				findBand.setCollapsedStateKeyTip("ZY");

				findButton = new JCommandToggleButton("Find",
						new EmptyResizableIcon(32));
				findButton.getActionModel().setSelected(true);
				findBand
						.addCommandButton(findButton, RibbonElementPriority.TOP);

				replaceButton = new JCommandToggleButton("Replace",
						new EmptyResizableIcon(32));
				replaceButton.getActionModel().setSelected(true);
				findBand.addCommandButton(replaceButton,
						RibbonElementPriority.MEDIUM);

				findReplaceButton = new JCommandToggleButton("Find replace",
						new EmptyResizableIcon(32));
				findReplaceButton.getActionModel().setSelected(true);
				findBand.addCommandButton(findReplaceButton,
						RibbonElementPriority.MEDIUM);

				selectAllButton = new JCommandToggleButton("Select all",
						new EmptyResizableIcon(32));
				selectAllButton.getActionModel().setSelected(true);
				findBand.addCommandButton(selectAllButton,
						RibbonElementPriority.MEDIUM);

				List<RibbonBandResizePolicy> resizePolicies = new ArrayList<RibbonBandResizePolicy>();
				resizePolicies.add(new CoreRibbonResizePolicies.Mirror(findBand
						.getControlPanel()));
				resizePolicies.add(new IconRibbonBandResizePolicy(findBand
						.getControlPanel()));
				findBand.setResizePolicies(resizePolicies);

				frame.getRibbon().addTask(new RibbonTask("Find", findBand));

				frame.setSize(600, 300);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

	@Test
	public void testLayout() {
		// get all bounds
		Dimension parentDimension = GuiActionRunner
				.execute(new GuiQuery<Dimension>() {
					@Override
					protected Dimension executeInEDT() throws Throwable {
						return findButton.getParent().getSize();
					}
				});
		Rectangle findRect = GuiActionRunner.execute(new GuiQuery<Rectangle>() {
			@Override
			protected Rectangle executeInEDT() throws Throwable {
				return findButton.getBounds();
			}
		});
		Rectangle replaceRect = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return replaceButton.getBounds();
					}
				});
		Rectangle findReplaceRect = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return findReplaceButton.getBounds();
					}
				});
		Rectangle selectAllRect = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return selectAllButton.getBounds();
					}
				});

		// horizontal insets in parent
		Assertions.assertThat(findRect.x).isEqualTo(
				parentDimension.width - findReplaceRect.x
						- findReplaceRect.width);

		// vertical white space between buttons
		Assertions.assertThat(
				findReplaceRect.y - replaceRect.y - replaceRect.height)
				.isEqualTo(
						selectAllRect.y - findReplaceRect.y
								- findReplaceRect.height);
		// alignment of top edges
		Assertions.assertThat(findRect.y).isEqualTo(replaceRect.y);
		// alignment of bottom edges
		Assertions.assertThat(findRect.y + findRect.height).isEqualTo(
				selectAllRect.y + selectAllRect.height);
	}
}