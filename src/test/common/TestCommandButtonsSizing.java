package test.common;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorConvertOp;
import java.util.LinkedList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.icon.FilteredResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;
import org.pushingpixels.flamingo.api.svg.SvgBatikResizableIcon;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class TestCommandButtonsSizing extends JPanel {
	private static interface Creator {
		public JComponent create(int fontSize);
	}

	private static class Mapping {
		public String caption;

		public Creator creator;

		public Mapping(String caption, Creator creator) {
			super();
			this.caption = caption;
			this.creator = creator;
		}
	}

	private List<Mapping> model;

	private JScrollPane central;

	public TestCommandButtonsSizing() {
		this.model = new LinkedList<Mapping>();
		for (final CommandButtonDisplayState state : new CommandButtonDisplayState[] {
				CommandButtonDisplayState.BIG,
				CommandButtonDisplayState.MEDIUM,
				CommandButtonDisplayState.TILE, CommandButtonDisplayState.SMALL }) {
			for (final CommandButtonKind commandButtonKind : CommandButtonKind
					.values()) {
				this.model.add(new Mapping(state.getDisplayName() + " + "
						+ commandButtonKind.name(), new Creator() {
					public JComponent create(int fontSize) {
						return createActionOnlyButton("Sample", state,
								commandButtonKind, fontSize);
					}
				}));
			}
		}

		final JList list = new JList(new AbstractListModel() {
			public Object getElementAt(int index) {
				return model.get(index);
			}

			public int getSize() {
				return model.size();
			}
		});
		list.setCellRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list,
					Object value, int index, boolean isSelected,
					boolean cellHasFocus) {
				return super.getListCellRendererComponent(list,
						((Mapping) value).caption, index, isSelected,
						cellHasFocus);
			}
		});
		this.setLayout(new BorderLayout());
		this.add(new JScrollPane(list), BorderLayout.WEST);

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		list.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								if (central != null)
									remove(central);
								central = null;

								int selIndex = list.getSelectedIndex();
								if (selIndex >= 0) {
									Mapping sel = (Mapping) list
											.getSelectedValue();
									FormLayout lm = new FormLayout(
											"right:pref, 4dlu, left:pref:grow",
											"");
									DefaultFormBuilder builder = new DefaultFormBuilder(
											lm);
									builder.setDefaultDialogBorder();
									for (int fontSize = 11; fontSize < 25; fontSize++) {
										builder.append(fontSize + " pixels",
												sel.creator.create(fontSize));
									}
									central = new JScrollPane(
											builder.getPanel(),
											JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
											JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
									add(central, BorderLayout.CENTER);
									doLayout();
									revalidate();
								}
							}
						});
					}
				});
	}

	private JCommandButton createActionOnlyButton(String text,
			CommandButtonDisplayState state,
			CommandButtonKind commandButtonKind, int fontSize) {
		ResizableIcon mainPasteIcon = SvgBatikResizableIcon.getSvgIcon(
				TestCommandButtons.class.getClassLoader().getResource(
						"test/svg/edit-paste.svg"), new Dimension(32, 32));
		JCommandButton mainButton = new JCommandButton(text, mainPasteIcon);
		mainButton.setDisabledIcon(new FilteredResizableIcon(mainPasteIcon,
				new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY),
						null)));
		// mainButton.setMnemonic('P');
		mainButton.setExtraText("Extra for " + text.toLowerCase());
		mainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action invoked");
			}
		});
		mainButton.setPopupCallback(new PopupPanelCallback() {
			@Override
			public JPopupPanel getPopupPanel(JCommandButton commandButton) {
				return new SamplePopupMenu(commandButton
						.getComponentOrientation());
			}
		});
		mainButton.setCommandButtonKind(commandButtonKind);
		mainButton.setDisplayState(state);
		mainButton.setFlat(false);
		mainButton.setFont(mainButton.getFont().deriveFont((float) fontSize));
		return mainButton;
	}

	/**
	 * Main method for testing.
	 * 
	 * @param args
	 *            Ignored.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Testing command button fonts");
				frame.setSize(800, 600);
				frame.add(new TestCommandButtonsSizing());
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
	}

}
