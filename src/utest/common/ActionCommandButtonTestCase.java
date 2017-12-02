package utest.common;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.awt.AWT;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.fest.swing.timing.Pause;
import org.junit.Before;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

import utest.svg.transcoded.Edit_cut;
import utest.svg.transcoded.Edit_paste;

public class ActionCommandButtonTestCase extends FestSwingJUnitTestCase {
    JFrame buttonFrame;
    int count;
    JCommandButton button;

    @Override
    @Before
    public void onSetUp() {
        final ResizableIcon icon = Edit_paste.of(32, 32);

        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttonFrame = new JFrame();
                buttonFrame.setLayout(new FlowLayout());

                button = new JCommandButton("test", icon);
                button.setDisplayState(CommandButtonDisplayState.BIG);
                buttonFrame.add(button);
                buttonFrame.setSize(300, 200);
                buttonFrame.setLocationRelativeTo(null);
                buttonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                buttonFrame.setVisible(true);

                count = 0;
                button.addActionListener((ActionEvent e) -> count++);
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
    public void sanityCheck() {
        String buttonText = GuiActionRunner.execute(new GuiQuery<String>() {
            @Override
            protected String executeInEDT() throws Throwable {
                return button.getText();
            }
        });
        Assertions.assertThat(buttonText).isEqualTo("test");
    }

    @Test
    public void activateButtonWithMouse() {
        robot().click(button);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void activateButtonWithSpace() {
        robot().moveMouse(button);
        robot().pressAndReleaseKeys(KeyEvent.VK_SPACE);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void activateButtonWithAPI() {
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
    public void fireActionOnPress() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setFireActionOnPress(false);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isFireActionOnPress();
            }
        })).isFalse();

        // press mouse over the button
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);

        // release mouse
        robot().releaseMouseButtons();
        robot().waitForIdle();
        // action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(1);

        // mark the button to fire the action listeners on mouse press
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setFireActionOnPress(true);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.getActionModel().isFireActionOnPress();
            }
        })).isTrue();

        // press mouse over the button
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();
        // action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(2);

        // release mouse
        robot().releaseMouseButtons();
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(2);
    }

    @Test
    public void fireActionOnRollover() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setFireActionOnRollover(false);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isFireActionOnRollover();
            }
        })).isFalse();

        // move the mouse over the button
        robot().moveMouse(button);
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);

        // move the mouse away from the button
        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);

        // mark the button to fire the action listeners on mouse rollover
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setFireActionOnRollover(true);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isFireActionOnRollover();
            }
        })).isTrue();

        // move the mouse over the button
        robot().moveMouse(button);
        robot().waitForIdle();
        // action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void autoRepeatWithMouseRelease() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setAutoRepeatAction(true);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isAutoRepeatAction();
            }
        })).isTrue();

        // press the mouse over the button
        robot().pressMouse(button, AWT.centerOf(button));

        // wait for one second
        Pause.pause(1000);

        // release the mouse
        robot().releaseMouseButtons();

        Assertions.assertThat(count).isGreaterThan(1);
    }

    @Test
    public void autoRepeatWithButtonDisabling() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setAutoRepeatAction(true);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isAutoRepeatAction();
            }
        })).isTrue();

        // press the mouse over the button
        robot().pressMouse(button, AWT.centerOf(button));

        // wait for one second
        Pause.pause(1000);

        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.getActionModel().setEnabled(false);
            }
        });
        int currCount = count;
        Assertions.assertThat(currCount).isGreaterThan(1);

        // wait for another second
        Pause.pause(1000);

        // no additional action listeners should have been invoked
        // after the button has been disabled
        Assertions.assertThat(count).isEqualTo(currCount);

        // release the mouse
        robot().releaseMouseButtons();
    }

    @Test
    public void autoRepeatWhenActionIsFiredByRollover() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setFireActionOnRollover(true);
                button.setAutoRepeatAction(true);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isAutoRepeatAction();
            }
        })).isTrue();
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isFireActionOnRollover();
            }
        })).isTrue();

        // move the mouse over the button
        robot().moveMouse(button, AWT.centerOf(button));
        robot().waitForIdle();

        // wait for one second
        Pause.pause(1000);

        // move the mouse away from the button
        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();

        Assertions.assertThat(count).isGreaterThan(1);
    }

    @Test
    public void fireActionOnRolloverWithUserPressingTheMouse() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setFireActionOnRollover(false);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isFireActionOnRollover();
            }
        })).isFalse();

        // move the mouse over the button
        robot().moveMouse(button);
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);

        // move the mouse away from the button
        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);

        // mark the button to fire the action listeners on mouse rollover
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setFireActionOnRollover(true);
            }
        });

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isFireActionOnRollover();
            }
        })).isTrue();

        // move the mouse over the button
        robot().moveMouse(button);
        robot().waitForIdle();
        // action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(1);

        // press the mouse
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(1);

        // release the mouse
        robot().releaseMouseButtons();
        robot().waitForIdle();
        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void autoRepeatWhenActionIsFiredByRolloverAndMouseIsMoving() {
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setFireActionOnRollover(true);
                button.setAutoRepeatAction(true);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isAutoRepeatAction();
            }
        })).isTrue();
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return button.isFireActionOnRollover();
            }
        })).isTrue();

        // move the mouse over the button
        robot().moveMouse(button, AWT.centerOf(button));
        robot().waitForIdle();

        // wait for one second
        Pause.pause(1000);

        // move the mouse away from the button
        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();

        int currCount = count;
        Assertions.assertThat(currCount).isGreaterThan(1);

        // wait for one second
        Pause.pause(1000);

        // move the mouse over the button
        robot().moveMouse(button, AWT.centerOf(button));
        robot().waitForIdle();

        // wait for one second
        Pause.pause(1000);

        // move the mouse away from the button
        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();

        Assertions.assertThat(count).isGreaterThan(currCount + 1);
    }

    @Test
    public void pressButtonAndDisableBeforeRelease() {
        robot().pressMouse(button, AWT.centerOf(button));
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
        robot().pressMouse(button, AWT.centerOf(button));
        robot().waitForIdle();

        robot().moveMouse(button, new Point(-10, 10));
        robot().waitForIdle();

        robot().releaseMouseButtons();
        robot().waitForIdle();

        // no action listener should have been invoked
        Assertions.assertThat(count).isEqualTo(0);
    }

    @Test
    public void changeText() {
        String buttonText = GuiActionRunner.execute(new GuiQuery<String>() {
            @Override
            protected String executeInEDT() throws Throwable {
                return button.getText();
            }
        });
        Assertions.assertThat(buttonText).isEqualTo("test");

        final String newText = "New text";
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setText(newText);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<String>() {
            @Override
            protected String executeInEDT() throws Throwable {
                return button.getText();
            }
        })).isEqualTo(newText);

        // test that the button is still clickable
        robot().click(button);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }

    @Test
    public void changeIcon() {
        Dimension iconDimension = GuiActionRunner.execute(new GuiQuery<Dimension>() {
            @Override
            protected Dimension executeInEDT() throws Throwable {
                Icon icon = button.getIcon();
                return new Dimension(icon.getIconWidth(), icon.getIconHeight());
            }
        });

        final ResizableIcon cutIcon = Edit_cut.of(16, 16);
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                button.setIcon(cutIcon);
            }
        });
        robot().waitForIdle();

        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Dimension>() {
            @Override
            protected Dimension executeInEDT() throws Throwable {
                Icon icon = button.getIcon();
                return new Dimension(icon.getIconWidth(), icon.getIconHeight());
            }
        })).isEqualTo(iconDimension);

        // test that the button is still clickable
        robot().click(button);
        robot().waitForIdle();
        Assertions.assertThat(count).isEqualTo(1);
    }
}
