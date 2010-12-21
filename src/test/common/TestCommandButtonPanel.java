/*
 * Copyright (c) 2005-2010 Flamingo Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package test.common;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

import org.pushingpixels.flamingo.api.common.JCommandButtonPanel.LayoutKind;

import test.common.LocaleSwitcher.LocaleCallback;

public class TestCommandButtonPanel extends JFrame {
	protected ResourceBundle resourceBundle;

	protected Locale currLocale;

	private JScrollPane scroller;

	private QuickStylesPanel buttonPanel;

	public TestCommandButtonPanel() {
		currLocale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("test.resource.Resources",
				currLocale);

		buttonPanel = new QuickStylesPanel(resourceBundle, currLocale);
		scroller = new JScrollPane(buttonPanel);

		add(scroller, BorderLayout.CENTER);
		JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		final JCheckBox toShowGroupLabels = new JCheckBox("show group labels");
		toShowGroupLabels.setSelected(buttonPanel.isToShowGroupLabels());
		toShowGroupLabels.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonPanel
						.setToShowGroupLabels(toShowGroupLabels.isSelected());
				scroller.revalidate();
			}
		});
		controlPanel.add(toShowGroupLabels);

		final JCheckBox isRowFillLayout = new JCheckBox("use row fill layout");
		isRowFillLayout
				.setSelected(buttonPanel.getLayoutKind() == LayoutKind.ROW_FILL);
		isRowFillLayout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonPanel
						.setLayoutKind(isRowFillLayout.isSelected() ? LayoutKind.ROW_FILL
								: LayoutKind.COLUMN_FILL);
			}
		});
		controlPanel.add(isRowFillLayout);

		JComboBox localeSwitcher = LocaleSwitcher
				.getLocaleSwitcher(new LocaleCallback() {
					@Override
					public void onLocaleSelected(Locale selected) {
						currLocale = selected;
						resourceBundle = ResourceBundle.getBundle(
								"test.resource.Resources", currLocale);
						remove(scroller);

						buttonPanel = new QuickStylesPanel(resourceBundle,
								currLocale);
						scroller = new JScrollPane(buttonPanel);
						add(scroller, BorderLayout.CENTER);
						Window window = SwingUtilities
								.getWindowAncestor(buttonPanel);
						window.applyComponentOrientation(ComponentOrientation
								.getOrientation(currLocale));
						SwingUtilities.updateComponentTreeUI(window);
					}
				});
		controlPanel.add(localeSwitcher);

		add(controlPanel, BorderLayout.SOUTH);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(new MetalLookAndFeel());
				} catch (Exception e) {
				}

				new TestCommandButtonPanel().setVisible(true);
			}
		});
	}
}
