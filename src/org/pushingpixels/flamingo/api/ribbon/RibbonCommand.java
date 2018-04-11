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

import org.pushingpixels.flamingo.api.common.RichTooltip;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

public class RibbonCommand {
    private String text;
    private ResizableIcon icon;
    private ActionListener action;
    private RichTooltip richTooltip;
    private String actionKeyTip;

    public RibbonCommand() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ResizableIcon getIcon() {
        return icon;
    }

    public void setIcon(ResizableIcon icon) {
        this.icon = icon;
    }

    public ActionListener getAction() {
        return action;
    }

    public void setAction(ActionListener action) {
        this.action = action;
    }

    public RichTooltip getRichTooltip() {
        return richTooltip;
    }

    public void setRichTooltip(RichTooltip richTooltip) {
        this.richTooltip = richTooltip;
    }

    public String getActionKeyTip() {
        return actionKeyTip;
    }

    public void setActionKeyTip(String actionKeyTip) {
        this.actionKeyTip = actionKeyTip;
    }

    public static class RibbonCommandBuilder {
        private String text;
        private ResizableIcon icon;
        private ActionListener action;
        private RichTooltip richTooltip;
        private String actionKeyTip;

        public RibbonCommandBuilder setText(String text) {
            this.text = text;
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

        public RibbonCommandBuilder setRichTooltip(RichTooltip richTooltip) {
            this.richTooltip = richTooltip;
            return this;
        }

        public RibbonCommandBuilder setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return this;
        }
        
        public RibbonCommand build() {
            RibbonCommand command = new RibbonCommand();
            command.setText(this.text);
            command.setIcon(this.icon);
            command.setAction(this.action);
            command.setRichTooltip(this.richTooltip);
            command.setActionKeyTip(this.actionKeyTip);
            return command;
        }

    }

}
