package utest.common;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.awt.AWT;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.fest.swing.timing.Condition;
import org.fest.swing.timing.Pause;
import org.junit.Before;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.AsynchronousLoading;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandMenuButton;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.svg.SvgBatikResizableIcon;

public class SplitCommandButtonTestCase extends FestSwingJUnitTestCase {
	JFrame buttonFrame;
	JCommandButton button;
	StringBuffer stringBuffer;
	JCommandMenuButton[] menuButtons;
	final static int MENU_BUTTON_COUNT = 5;
	int count;

	@Override
	@Before
	public void onSetUp() {
		URL resource = SplitCommandButtonTestCase.class.getClassLoader()
				.getResource("utest/common/edit-paste.svg");
		Assertions.assertThat(resource).isNotNull();
		final ResizableIcon icon = SvgBatikResizableIcon.getSvgIcon(resource,
				new Dimension(32, 32));
		Pause.pause(new Condition("Waiting to load the SVG icon") {
			@Override
			public boolean test() {
				return !((AsynchronousLoading) icon).isLoading();
			}
		});

		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				stringBuffer = new StringBuffer();
				count = 0;

				buttonFrame = new JFrame();
				button = new JCommandButton("test", icon);
				button.setDisplayState(CommandButtonDisplayState.BIG);
				button
						.setCommandButtonKind(CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);

				button.setPopupCallback(new PopupPanelCallback() {
					@Override
					public JPopupPanel getPopupPanel(
							JCommandButton commandButton) {
						JCommandPopupMenu result = new JCommandPopupMenu();

						menuButtons = new JCommandMenuButton[MENU_BUTTON_COUNT];
						for (int i = 0; i < MENU_BUTTON_COUNT; i++) {
							final int index = i;
							menuButtons[i] = new JCommandMenuButton("popup "
									+ i, new EmptyResizableIcon(16));
							menuButtons[i]
									.addActionListener(new ActionListener() {
										@Override
										public void actionPerformed(
												ActionEvent e) {
											stringBuffer.append(index);
										}
									});
							result.addMenuButton(menuButtons[i]);
						}

						return result;
					}
				});

				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						count++;
					}
				});

				buttonFrame.setLayout(new FlowLayout());
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

	@Test
	public void activateActionWithMouse() {
		Rectangle actionClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().actionClickArea;
					};
				});
		// click the action area
		robot().click(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();
		// check that the action listener has been invoked
		Assertions.assertThat(count).isEqualTo(1);

		// check that the popup is not showing
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();
	}

	@Test
	public void activateActionWithSpace() {
		Rectangle actionClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().actionClickArea;
					};
				});
		Assertions.assertThat(actionClickArea).isNotNull();
		robot().moveMouse(button, AWT.centerOf(actionClickArea));
		robot().pressAndReleaseKeys(KeyEvent.VK_SPACE);
		robot().waitForIdle();
		// check that the action listener has been invoked
		Assertions.assertThat(count).isEqualTo(1);

		// check that the popup is not showing
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();
	}

	@Test
	public void activateActionWithAPI() {
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
	public void activatePopupWithMouse() {
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		Assertions.assertThat(popupClickArea).isNotNull();
		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// popup should be showing
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void activatePopupWithAPI() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.doPopupClick();
			}
		});
		robot().waitForIdle();
		// popup should be showing
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();
	}

	@Test
	public void dismissPopupByClickingOutsideTheButton() {
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// popup should be showing
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);

		// move the mouse away from the button
		robot().moveMouse(button, new Point(-10, 10));
		robot().waitForIdle();
		// popup should still be visible
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();

		// click away from the button
		robot().click(button, new Point(-10, 10));
		robot().waitForIdle();
		// popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void dismissPopupByClickingTheButton() {
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		Assertions.assertThat(popupClickArea).isNotNull();
		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// popup should be showing
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);

		// click the popup area one more time
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void clickTheFirstMenuButton() {
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		Assertions.assertThat(popupClickArea).isNotNull();
		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();

		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return menuButtons[0].isVisible();
			}
		})).isTrue();

		robot().click(menuButtons[0]);
		robot().waitForIdle();
		// popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// check that the menu button has been clicked
		Assertions.assertThat(stringBuffer.toString()).isEqualTo("0");
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void clickTheFirstAndSecondMenuButton() {
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		// click the popup area
		Assertions.assertThat(popupClickArea).isNotNull();
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();

		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return menuButtons[0].isVisible();
			}
		})).isTrue();

		robot().click(menuButtons[0]);
		robot().waitForIdle();
		// popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// check that the menu button has been clicked
		Assertions.assertThat(stringBuffer.toString()).isEqualTo("0");
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);

		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();

		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return menuButtons[1].isVisible();
			}
		})).isTrue();

		robot().click(menuButtons[1]);
		robot().waitForIdle();
		// popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// check that the menu button has been clicked
		Assertions.assertThat(stringBuffer.toString()).isEqualTo("01");
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void clickAllMenuButtons() {
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		Assertions.assertThat(popupClickArea).isNotNull();
		for (int i = 0; i < MENU_BUTTON_COUNT; i++) {
			// click the popup area
			robot().click(button, AWT.centerOf(popupClickArea));
			robot().waitForIdle();
			final int index = i;
			Assertions.assertThat(
					GuiActionRunner.execute(new GuiQuery<Boolean>() {
						@Override
						protected Boolean executeInEDT() throws Throwable {
							return menuButtons[index].isVisible();
						}
					})).isTrue();

			robot().click(menuButtons[i]);
			robot().waitForIdle();
			// popup should be hidden
			Assertions.assertThat(
					GuiActionRunner.execute(new GuiQuery<Boolean>() {
						@Override
						protected Boolean executeInEDT() throws Throwable {
							return button.getPopupModel().isPopupShowing();
						}
					})).isFalse();
		}

		String expected = "";
		for (int i = 0; i < MENU_BUTTON_COUNT; i++) {
			expected += i;
		}

		// check that the menu buttons have been clicked
		Assertions.assertThat(stringBuffer.toString()).isEqualTo(expected);
		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void checkPopupDisable() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.getPopupModel().setEnabled(false);
			}
		});
		robot().waitForIdle();

		// popup should be disabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isEnabled();
			}
		})).isFalse();

		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// now enable the popup
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.getPopupModel().setEnabled(true);
			}
		});
		robot().waitForIdle();

		// popup should be enabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isEnabled();
			}
		})).isTrue();

		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// popup should be shown
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();

		// and no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}

	@Test
	public void checkActionDisable() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.getActionModel().setEnabled(false);
			}
		});
		robot().waitForIdle();

		// action should be disabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getActionModel().isEnabled();
			}
		})).isFalse();

		Rectangle actionClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().actionClickArea;
					};
				});
		// click the action area
		robot().click(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();
		// no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
		// and popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// now enable the action
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.getActionModel().setEnabled(true);
			}
		});
		robot().waitForIdle();

		// action should be enabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getActionModel().isEnabled();
			}
		})).isTrue();

		// click the action area
		robot().click(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();
		// action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(1);
		// and popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();
	}

	@Test
	public void checkActionAndPopupDisable() {
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.getActionModel().setEnabled(false);
				button.getPopupModel().setEnabled(false);
			}
		});
		robot().waitForIdle();

		// action should be disabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getActionModel().isEnabled();
			}
		})).isFalse();
		// popup should be disabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isEnabled();
			}
		})).isFalse();

		Rectangle actionClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().actionClickArea;
					};
				});
		Rectangle popupClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().popupClickArea;
					};
				});
		// click the action area
		robot().click(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();
		// no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
		// and popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// click the popup area
		robot().click(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();
		// no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
		// and popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// now enable the action and popup
		GuiActionRunner.execute(new GuiTask() {
			@Override
			protected void executeInEDT() throws Throwable {
				button.getActionModel().setEnabled(true);
				button.getPopupModel().setEnabled(true);
			}
		});
		robot().waitForIdle();

		// action should be enabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getActionModel().isEnabled();
			}
		})).isTrue();
		// popup should be enabled
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isEnabled();
			}
		})).isTrue();

		// click the action area
		robot().click(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();
		// action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(1);
		// and popup should be hidden
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isFalse();

		// click the popup area
		robot().click(button, AWT.centerOf(popupClickArea));
		robot().waitForIdle();
		// no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(1);
		// and popup should be shown
		Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
			@Override
			protected Boolean executeInEDT() throws Throwable {
				return button.getPopupModel().isPopupShowing();
			}
		})).isTrue();
	}

	@Test
	public void pressButtonAndDisableBeforeRelease() {
		Rectangle actionClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().actionClickArea;
					};
				});
		Assertions.assertThat(actionClickArea).isNotNull();
		robot().pressMouse(button, AWT.centerOf(actionClickArea));
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
	}

	@Test
	public void pressButtonAndMoveAwayBeforeRelease() {
		Rectangle actionClickArea = GuiActionRunner
				.execute(new GuiQuery<Rectangle>() {
					@Override
					protected Rectangle executeInEDT() throws Throwable {
						return button.getUI().getLayoutInfo().actionClickArea;
					};
				});
		Assertions.assertThat(actionClickArea).isNotNull();
		robot().pressMouse(button, AWT.centerOf(actionClickArea));
		robot().waitForIdle();

		robot().moveMouse(button, new Point(-10, 10));
		robot().waitForIdle();

		robot().releaseMouseButtons();
		robot().waitForIdle();

		// no action listener should have been invoked
		Assertions.assertThat(count).isEqualTo(0);
	}
}
