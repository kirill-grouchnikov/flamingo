/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.ribbon;

import java.awt.event.ActionListener;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.CommandToggleButtonGroup;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.PopupPanelCallback;

public class RibbonCommand {
    private String title;
    private ResizableIcon icon;
    private ActionListener action;
    private RichTooltip actionRichTooltip;
    private String actionKeyTip;
    private PopupPanelCallback popupCallback;
    private RichTooltip popupRichTooltip;
    private String popupKeyTip;
    private boolean isTitleClickAction;
    private boolean isTitleClickPopup;
    private boolean isEnabled;
    private boolean isToggle;
    private boolean isToggleSelected;
    private RibbonCommandToggleGroup toggleGroup;

    private RibbonCommand() {
    }

    private void checkConsistency() {
        if (icon == null) {
            throw new IllegalStateException("Must have icon");
        }
        if (action == null) {
            if (actionRichTooltip != null) {
                throw new IllegalStateException("Configured action rich tooltip with no action");
            }
            if (actionKeyTip != null) {
                throw new IllegalStateException("Configured action key tip with no action");
            }
        }
        if (popupCallback == null) {
            if (popupRichTooltip != null) {
                throw new IllegalStateException("Configured popup rich tooltip with no callback");
            }
            if (popupKeyTip != null) {
                throw new IllegalStateException("Configured popup key tip with no callback");
            }
        }

        if ((action == null) && (popupCallback == null)) {
            throw new IllegalStateException("Command configured with no action or popup callback");
        }

        if ((action != null) && (popupCallback == null) && isTitleClickPopup) {
            throw new IllegalStateException(
                    "Action-only command configured to activate popup on title click");
        }

        if ((popupCallback != null) && (action == null) && isTitleClickAction) {
            throw new IllegalStateException(
                    "Popup-only command configured to activate action on title click");
        }

        if ((action != null) && (popupCallback != null)) {
            if (isTitleClickAction && isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup can't have both activated on title click");
            }
            if (!isTitleClickAction && !isTitleClickPopup) {
                throw new IllegalStateException(
                        "Command configured to have both action and popup must have one activated on title click");
            }
        }

        if (isToggle && (popupCallback != null)) {
            throw new IllegalStateException("Command configured to be toggle can't have popups");
        }

        if ((toggleGroup != null) && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is in a toggle toggleGroup");
        }
        if (isToggleSelected && !isToggle) {
            throw new IllegalStateException(
                    "Command configured to not be a toggle but is selected");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public ResizableIcon getIcon() {
        return this.icon;
    }

    public ActionListener getAction() {
        return this.action;
    }

    public RichTooltip getActionRichTooltip() {
        return this.actionRichTooltip;
    }

    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    public PopupPanelCallback getPopupCallback() {
        return this.popupCallback;
    }

    public RichTooltip getPopupRichTooltip() {
        return this.popupRichTooltip;
    }

    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    public boolean isTitleClickAction() {
        return this.isTitleClickAction;
    }

    public boolean isTitleClickPopup() {
        return this.isTitleClickPopup;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isToggle() {
        return this.isToggle;
    }
    
    public boolean isToggleSelected() {
        return this.isToggleSelected;
    }

    public RibbonCommandToggleGroup getToggleGroup() {
        return this.toggleGroup;
    }

    public AbstractCommandButton buildButton() {
        AbstractCommandButton result = this.isToggle()
                ? new JCommandToggleButton(this.getTitle(), this.getIcon())
                : new JCommandButton(this.getTitle(), this.getIcon());

        boolean hasAction = (this.getAction() != null);
        boolean hasPopup = (this.getPopupCallback() != null);

        if (hasAction) {
            result.addActionListener(this.getAction());
            result.setActionRichTooltip(this.getActionRichTooltip());
            result.setActionKeyTip(this.getActionKeyTip());
        }

        if (!isToggle) {
            JCommandButton jcb = (JCommandButton) result;
            if (hasPopup) {
                jcb.setPopupCallback(this.getPopupCallback());
                jcb.setPopupRichTooltip(this.getPopupRichTooltip());
                jcb.setPopupKeyTip(this.getPopupKeyTip());
            }

            if (hasAction && hasPopup) {
                jcb.setCommandButtonKind(
                        this.isTitleClickAction ? CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION
                                : CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
            } else if (hasAction) {
                jcb.setCommandButtonKind(CommandButtonKind.ACTION_ONLY);
            } else {
                jcb.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
            }
        }

        result.setEnabled(this.isEnabled());

        if (this.getToggleGroup() != null) {
            this.getToggleGroup().toggleButtonGroup.add((JCommandToggleButton) result);
        }
        
        if (this.isToggleSelected()) {
            result.getActionModel().setSelected(true);
        }

        return result;
    }

    public static class RibbonCommandToggleGroup {
        private CommandToggleButtonGroup toggleButtonGroup = new CommandToggleButtonGroup();
    }

    public static class RibbonCommandBuilder {
        private String title;
        private ResizableIcon icon;
        private ActionListener action;
        private RichTooltip actionRichTooltip;
        private String actionKeyTip;
        private PopupPanelCallback popupCallback;
        private RichTooltip popupRichTooltip;
        private String popupKeyTip;
        private boolean isTitleClickAction;
        private boolean isTitleClickPopup;
        private boolean isEnabled = true;
        private boolean isToggle;
        private boolean isToggleSelected;
        private RibbonCommandToggleGroup toggleGroup;

        public RibbonCommandBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public RibbonCommandBuilder setIcon(ResizableIcon icon) {
            this.icon = icon;
            return this;
        }

        public RibbonCommandBuilder setAction(ActionListener action) {
            this.action = action;
            return this;
        }

        public RibbonCommandBuilder setActionRichTooltip(RichTooltip actionRichTooltip) {
            this.actionRichTooltip = actionRichTooltip;
            return this;
        }

        public RibbonCommandBuilder setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return this;
        }

        public RibbonCommandBuilder setPopupCallback(PopupPanelCallback popupCallback) {
            this.popupCallback = popupCallback;
            return this;
        }

        public RibbonCommandBuilder setPopupRichTooltip(RichTooltip popupRichTooltip) {
            this.popupRichTooltip = popupRichTooltip;
            return this;
        }

        public RibbonCommandBuilder setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return this;
        }

        public RibbonCommandBuilder setTitleClickAction() {
            this.isTitleClickAction = true;
            return this;
        }

        public RibbonCommandBuilder setTitleClickPopup() {
            this.isTitleClickPopup = true;
            return this;
        }

        public RibbonCommandBuilder setEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public RibbonCommandBuilder setToggle() {
            this.isToggle = true;
            return this;
        }

        public RibbonCommandBuilder setToggleSelected(boolean toggleSelected) {
            this.isToggle = true;
            this.isToggleSelected = toggleSelected;
            return this;
        }

        public RibbonCommandBuilder inToggleGroup(RibbonCommandToggleGroup toggleGroup) {
            this.toggleGroup = toggleGroup;
            return this;
        }

        public RibbonCommand build() {
            RibbonCommand command = new RibbonCommand();
            command.title = this.title;
            command.icon = this.icon;
            command.action = this.action;
            command.actionRichTooltip = this.actionRichTooltip;
            command.actionKeyTip = this.actionKeyTip;
            command.popupCallback = this.popupCallback;
            command.popupRichTooltip = this.popupRichTooltip;
            command.popupKeyTip = this.popupKeyTip;
            command.isTitleClickAction = this.isTitleClickAction;
            command.isTitleClickPopup = this.isTitleClickPopup;
            command.isEnabled = this.isEnabled;
            command.isToggle = this.isToggle;
            command.isToggleSelected = this.isToggleSelected;
            command.toggleGroup = this.toggleGroup;

            command.checkConsistency();

            return command;
        }

    }

}
