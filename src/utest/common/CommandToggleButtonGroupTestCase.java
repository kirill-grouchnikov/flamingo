package utest.common;

import java.awt.FlowLayout;
import java.awt.Point;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

import org.fest.assertions.Assertions;
import org.fest.swing.edt.GuiActionRunner;
import org.fest.swing.edt.GuiQuery;
import org.fest.swing.edt.GuiTask;
import org.fest.swing.junit.testcase.FestSwingJUnitTestCase;
import org.junit.Before;
import org.junit.Test;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.CommandToggleButtonGroup;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

import utest.svg.transcoded.Edit_copy;
import utest.svg.transcoded.Edit_cut;
import utest.svg.transcoded.Edit_paste;

public class CommandToggleButtonGroupTestCase extends FestSwingJUnitTestCase {
    JFrame buttonFrame;
    final static int COUNT = 3;
    JCommandToggleButton[] buttons;
    CommandToggleButtonGroup group;
    int propertyChangeCount;
    PropertyChangeListener propertyChangeListener;

    @Override
    @Before
    public void onSetUp() {
        final ResizableIcon[] icons = new ResizableIcon[COUNT];
        icons[0] = Edit_paste.of(32, 32);
        icons[1] = Edit_copy.of(32, 32);
        icons[2] = Edit_cut.of(32, 32);

        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttonFrame = new JFrame();
                buttonFrame.setLayout(new FlowLayout());

                propertyChangeCount = 0;

                group = new CommandToggleButtonGroup();
                buttons = new JCommandToggleButton[COUNT];
                for (int i = 0; i < COUNT; i++) {
                    buttons[i] = new JCommandToggleButton("test" + i, icons[i]);
                    buttons[i].setDisplayState(CommandButtonDisplayState.BIG);
                    group.add(buttons[i]);
                    buttonFrame.add(buttons[i]);
                }

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
    public void buttonActivationWithMouse() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        for (int i = 0; i < COUNT; i++) {
            final int indexToSelect = i;

            robot().click(buttons[indexToSelect]);
            robot().waitForIdle();

            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
                @Override
                protected JCommandToggleButton executeInEDT() throws Throwable {
                    return group.getSelected();
                }
            })).isEqualTo(buttons[i]);

            for (int j = 0; j < COUNT; j++) {
                final int index = j;
                Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                    @Override
                    protected Boolean executeInEDT() throws Throwable {
                        return buttons[index].getActionModel().isSelected();
                    }
                })).isEqualTo(indexToSelect == index);
            }
        }
    }

    @Test
    public void buttonActivationWithAPI() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        for (int i = 0; i < COUNT; i++) {
            final int indexToSelect = i;

            GuiActionRunner.execute(new GuiTask() {
                @Override
                protected void executeInEDT() throws Throwable {
                    buttons[indexToSelect].getActionModel().setSelected(true);
                }
            });
            robot().waitForIdle();

            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
                @Override
                protected JCommandToggleButton executeInEDT() throws Throwable {
                    return group.getSelected();
                }
            })).isEqualTo(buttons[i]);

            for (int j = 0; j < COUNT; j++) {
                final int index = j;
                Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                    @Override
                    protected Boolean executeInEDT() throws Throwable {
                        return buttons[index].getActionModel().isSelected();
                    }
                })).isEqualTo(indexToSelect == index);
            }
        }
    }

    @Test
    public void buttonActivationWithGroupAPI() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        for (int i = 0; i < COUNT; i++) {
            final int indexToSelect = i;

            GuiActionRunner.execute(new GuiTask() {
                @Override
                protected void executeInEDT() throws Throwable {
                    group.setSelected(buttons[indexToSelect], true);
                }
            });
            robot().waitForIdle();

            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
                @Override
                protected JCommandToggleButton executeInEDT() throws Throwable {
                    return group.getSelected();
                }
            })).isEqualTo(buttons[indexToSelect]);

            for (int j = 0; j < COUNT; j++) {
                final int index = j;
                Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                    @Override
                    protected Boolean executeInEDT() throws Throwable {
                        return buttons[index].getActionModel().isSelected();
                    }
                })).isEqualTo(indexToSelect == index);
            }
        }
    }

    @Test
    public void addUnselectedButtonWithNoPreviousSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // create a new button
        final ResizableIcon cutIcon = Edit_cut.of(16, 16);
        final JCommandToggleButton newButton = GuiActionRunner
                .execute(new GuiQuery<JCommandToggleButton>() {
                    @Override
                    protected JCommandToggleButton executeInEDT() throws Throwable {
                        JCommandToggleButton result = new JCommandToggleButton("new button",
                                cutIcon);
                        result.setDisplayState(CommandButtonDisplayState.BIG);
                        buttonFrame.add(result);
                        buttonFrame.invalidate();
                        buttonFrame.validate();
                        return result;
                    }
                });
        robot().waitForIdle();

        // add the button to the button group
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.add(newButton);
            }
        });

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the newly added button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                newButton.getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(newButton);

        // all other buttons should be unselected
        for (int j = 0; j < COUNT; j++) {
            final int index = j;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }
    }

    @Test
    public void addUnselectedButtonWithPreviousSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // create a new button
        final ResizableIcon cutIcon = Edit_cut.of(16, 16);
        final JCommandToggleButton newButton = GuiActionRunner
                .execute(new GuiQuery<JCommandToggleButton>() {
                    @Override
                    protected JCommandToggleButton executeInEDT() throws Throwable {
                        JCommandToggleButton result = new JCommandToggleButton("new button",
                                cutIcon);
                        result.setDisplayState(CommandButtonDisplayState.BIG);
                        buttonFrame.add(result);
                        buttonFrame.invalidate();
                        buttonFrame.validate();
                        return result;
                    }
                });
        robot().waitForIdle();

        // add the button to the button group
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.add(newButton);
            }
        });

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // select the newly added button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                newButton.getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(newButton);

        // all other buttons should be unselected
        for (int j = 0; j < COUNT; j++) {
            final int index = j;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }
    }

    @Test
    public void addSelectedButtonWithNoPreviousSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // create a new button
        final ResizableIcon cutIcon = Edit_cut.of(16, 16);
        final JCommandToggleButton newButton = GuiActionRunner
                .execute(new GuiQuery<JCommandToggleButton>() {
                    @Override
                    protected JCommandToggleButton executeInEDT() throws Throwable {
                        JCommandToggleButton result = new JCommandToggleButton("new button",
                                cutIcon);
                        result.getActionModel().setSelected(true);
                        result.setDisplayState(CommandButtonDisplayState.BIG);
                        buttonFrame.add(result);
                        buttonFrame.invalidate();
                        buttonFrame.validate();
                        return result;
                    }
                });
        robot().waitForIdle();

        // add the button to the button group
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.add(newButton);
            }
        });

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(newButton);

        // all other buttons should be unselected
        for (int j = 0; j < COUNT; j++) {
            final int index = j;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // all other buttons should be unselected
        for (int j = 1; j < COUNT; j++) {
            final int index = j;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return newButton.getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void addSelectedButtonWithPreviousSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // create a new button
        final ResizableIcon cutIcon = Edit_cut.of(16, 16);
        final JCommandToggleButton newButton = GuiActionRunner
                .execute(new GuiQuery<JCommandToggleButton>() {
                    @Override
                    protected JCommandToggleButton executeInEDT() throws Throwable {
                        JCommandToggleButton result = new JCommandToggleButton("new button",
                                cutIcon);
                        result.getActionModel().setSelected(true);
                        result.setDisplayState(CommandButtonDisplayState.BIG);
                        buttonFrame.add(result);
                        buttonFrame.invalidate();
                        buttonFrame.validate();
                        return result;
                    }
                });
        robot().waitForIdle();

        // add the button to the button group
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.add(newButton);
            }
        });

        // check that the group selection is still remains
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // all other buttons should be unselected
        for (int j = 1; j < COUNT; j++) {
            final int index = j;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return newButton.getActionModel().isSelected();
            }
        })).isFalse();

        // select the newly added button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                newButton.getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(newButton);
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return newButton.getActionModel().isSelected();
            }
        })).isTrue();

        // all other buttons should be unselected
        for (int j = 0; j < COUNT; j++) {
            final int index = j;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }
    }

    @Test
    public void removeSelectedButton() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // remove the selected button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.remove(buttons[0]);
            }
        });

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // the first button should still be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // and the rest of the buttons should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isFalse();
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();

        // select the second button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[1].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[1]);

        // the first button should still be selected - it's not in the group
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // the second button should be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isTrue();

        // and the third button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void removeUnselectedButtonFromGroupWithSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // remove the second (unselected) button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.remove(buttons[1]);
            }
        });

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // the first button should still be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // and the rest of the buttons should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isFalse();
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();

        // select the second button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[1].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // the first button should still be selected - since the
        // second button is not in the group
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // the second button should be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isTrue();

        // and the third button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void removeUnselectedButtonFromGroupWithNoSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // remove the second button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.remove(buttons[1]);
            }
        });

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // none of the buttons should be selected
        for (int i = 0; i < COUNT; i++) {
            final int index = i;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }

        // select the second and third button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[1].getActionModel().setSelected(true);
                buttons[2].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[2]);

        // the first button should not be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isFalse();

        // the second button should be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isTrue();

        // and the third button should be selected - since the second button
        // is not part of the group
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isTrue();
    }

    @Test
    public void clearSelection() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // clear the selection
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.clearSelection();
            }
        });
        robot().waitForIdle();

        // none of the buttons should be selected
        for (int i = 0; i < COUNT; i++) {
            final int index = i;
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[index].getActionModel().isSelected();
                }
            })).isFalse();
        }

        // select the second button and remove it.
        // also select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[1].getActionModel().setSelected(true);
                group.remove(buttons[1]);
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // the first button should be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // the second button should be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isTrue();

        // and the third button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();

        // clear the selection
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.clearSelection();
            }
        });
        robot().waitForIdle();

        // the first button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isFalse();

        // the second button should still be selected - it's not part
        // of the group
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isTrue();

        // and the third button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();
    }

    @Test
    public void clickSelectedButton() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // click the first button
        robot().click(buttons[0]);
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // click the first button once again
        robot().click(buttons[0]);
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(null);

        for (int i = 0; i <= 2; i++) {
            final int fi = i;
            // the button should be unselected
            Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
                @Override
                protected Boolean executeInEDT() throws Throwable {
                    return buttons[fi].getActionModel().isSelected();
                }
            })).isFalse();
        }
    }

    @Test
    public void clickSelectedButtonWhenClearingSelectionIsNotAllowed() {
        group.setAllowsClearingSelection(false);

        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // click the first button
        robot().click(buttons[0]);
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // click the first button once again
        robot().click(buttons[0]);
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // the first button should still be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // the second button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isFalse();

        // and the third button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();

    }

    @Test
    public void clearSelectionWhenClearingSelectionIsNotAllowed() {
        group.setAllowsClearingSelection(false);

        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // click the first button
        robot().click(buttons[0]);
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // clear the selection
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.clearSelection();
            }
        });
        robot().waitForIdle();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // the first button should still be selected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[0].getActionModel().isSelected();
            }
        })).isTrue();

        // the second button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[1].getActionModel().isSelected();
            }
        })).isFalse();

        // and the third button should be unselected
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<Boolean>() {
            @Override
            protected Boolean executeInEDT() throws Throwable {
                return buttons[2].getActionModel().isSelected();
            }
        })).isFalse();

    }

    @Test
    public void propertyChangeListener() {
        // no selection
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // no property change listeners have been notified
        Assertions.assertThat(propertyChangeCount).isZero();

        // register a property change listener
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                propertyChangeListener = (PropertyChangeEvent evt) -> {
                    if (CommandToggleButtonGroup.SELECTED_PROPERTY.equals(evt.getPropertyName())) {
                        propertyChangeCount++;
                    }
                };
                group.addPropertyChangeListener(propertyChangeListener);
            }
        });
        robot().waitForIdle();

        // no property change listeners have been notified
        Assertions.assertThat(propertyChangeCount).isZero();

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // select the second button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[1].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // property change listeners should have been notified
        Assertions.assertThat(propertyChangeCount).isEqualTo(1);

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[1]);

        // clear the selection
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.clearSelection();
            }
        });
        robot().waitForIdle();

        // property change listeners should have been notified
        Assertions.assertThat(propertyChangeCount).isEqualTo(2);

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isNull();

        // select the first button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[0].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // property change listeners should have been notified
        Assertions.assertThat(propertyChangeCount).isEqualTo(3);

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // unregister the property change listener
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.removePropertyChangeListener(propertyChangeListener);
            }
        });
        robot().waitForIdle();

        // no property change listeners have been notified
        Assertions.assertThat(propertyChangeCount).isEqualTo(3);

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[0]);

        // select the second button
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                buttons[1].getActionModel().setSelected(true);
            }
        });
        robot().waitForIdle();

        // no property change listeners should have been notified
        Assertions.assertThat(propertyChangeCount).isEqualTo(3);

        // check that the group selection is correct
        Assertions.assertThat(GuiActionRunner.execute(new GuiQuery<JCommandToggleButton>() {
            @Override
            protected JCommandToggleButton executeInEDT() throws Throwable {
                return group.getSelected();
            }
        })).isEqualTo(buttons[1]);

        // clear the selection
        GuiActionRunner.execute(new GuiTask() {
            @Override
            protected void executeInEDT() throws Throwable {
                group.clearSelection();
            }
        });
        robot().waitForIdle();

        // no property change listeners should have been notified
        Assertions.assertThat(propertyChangeCount).isEqualTo(3);
    }
}
