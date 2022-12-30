package org.example2.uifactory;

import org.example2.ui.IButton;
import org.example2.ui.ICheckBox;
import org.example2.ui.mac.MacButton;
import org.example2.ui.mac.MacCheckBox;

public class MacUIFactory implements UIFactory{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
