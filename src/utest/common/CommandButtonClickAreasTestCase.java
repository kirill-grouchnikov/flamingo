package utest.common;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.junit.Before;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

import utest.svg.transcoded.Edit_paste;

/**
 * This class tests computation of action click and popup click areas of command
 * buttons under different core command button states and display kinds.
 * 
 * @author Kirill Grouchnikov
 */
public class CommandButtonClickAreasTestCase extends FestSwingJUnitTestCase {
	JFrame buttonFrame;
	JCommandButton button;

	@Override
	@Before
	public void onSetUp() {
		final ResizableIcon icon1 = new Edit_paste();

		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				buttonFrame = new JFrame();
				buttonFrame.setLayout(new FlowLayout());

				button = new JCommandButton("test1", icon1);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				buttonFrame.add(button);

				buttonFrame.setSize(300, 200);
				buttonFrame.setLocationRelativeTo(null);
				buttonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				buttonFrame.setVisible(true);
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

	private Dimension getButtonDimension() {
		return GuiActionRunner.execute(new GuiQuery<Dimension>() {
			@Override
			protected Dimension executeInEDT() throws Throwable {
				return button.getSize();
			};
		});
	}

	private Rectangle getButtonActionClickArea() {
		return GuiActionRunner.execute(new GuiQuery<Rectangle>() {
			@Override
			protected Rectangle executeInEDT() throws Throwable {
				return button.getUI().getLayoutInfo().actionClickArea;
			}
		});
	}

	private Rectangle getButtonPopupClickArea() {
		return GuiActionRunner.execute(new GuiQuery<Rectangle>() {
			@Override
			protected Rectangle executeInEDT() throws Throwable {
				return button.getUI().getLayoutInfo().popupClickArea;
			}
		});
	}

	@Test
	public void testAreasForActionOnlyBigButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.BIG);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionBigButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.BIG);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(
				popupClickArea.y);
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(
				dim.height - popupClickArea.y);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupBigButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.BIG);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(
				popupClickArea.y);
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(
				dim.height - popupClickArea.y);
	}

	@Test
	public void testAreasForPopupOnlyBigButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.BIG);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyBigButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionBigButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		// no action area for big split buttons with no icon
		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupBigButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		// no action area for big split buttons with no icon
		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyBigButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyBigButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionBigButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(
				popupClickArea.y);
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(
				dim.height - popupClickArea.y);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupBigButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(
				popupClickArea.y);
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(
				dim.height - popupClickArea.y);
	}

	@Test
	public void testAreasForPopupOnlyBigButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyMediumButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionMediumButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupMediumButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyMediumButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyMediumButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionMediumButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupMediumButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		// no action area for medium split button with no icon when
		// text belongs to popup area
		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyMediumButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyMediumButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionMediumButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupMediumButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyMediumButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.MEDIUM);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlySmallButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionSmallButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupSmallButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlySmallButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlySmallButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionSmallButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		// no action area for small split button with no icon
		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupSmallButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		// no action area for small split button with no icon
		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlySmallButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.SMALL);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyTileButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.TILE);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionTileButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.TILE);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupTileButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.TILE);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyTileButton() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.TILE);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyTileButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionTileButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupTileButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		// no action area for tile split button with no icon when
		// text belongs to popup area
		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyTileButtonWithNoIcon() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setIcon(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionOnlyTileButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.width * popupClickArea.height)
				.isEqualTo(0);
	}

	@Test
	public void testAreasForActionAndPopupMainActionTileButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForActionAndPopupMainPopupTileButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Rectangle popupClickArea = this.getButtonPopupClickArea();

		Assertions.assertThat(actionClickArea.x).isEqualTo(0);
		Assertions.assertThat(actionClickArea.y).isEqualTo(0);
		Assertions.assertThat(actionClickArea.width)
				.isEqualTo(popupClickArea.x);
		Assertions.assertThat(actionClickArea.height).isEqualTo(dim.height);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(
				dim.width - popupClickArea.x);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

	@Test
	public void testAreasForPopupOnlyTileButtonWithNoText() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
				button.setDisplayState(CommandButtonDisplayState.TILE);
				button.setText(null);
			}
		});

		robot().waitForIdle();

		Dimension dim = this.getButtonDimension();

		Rectangle actionClickArea = this.getButtonActionClickArea();
		Assertions.assertThat(actionClickArea.width * actionClickArea.height)
				.isEqualTo(0);

		Rectangle popupClickArea = this.getButtonPopupClickArea();
		Assertions.assertThat(popupClickArea.x).isEqualTo(0);
		Assertions.assertThat(popupClickArea.y).isEqualTo(0);
		Assertions.assertThat(popupClickArea.width).isEqualTo(dim.width);
		Assertions.assertThat(popupClickArea.height).isEqualTo(dim.height);
	}

}
