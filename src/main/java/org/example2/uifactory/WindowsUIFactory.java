package org.example2.uifactory;

import org.example2.ui.IButton;
import org.example2.ui.ICheckBox;
import org.example2.ui.windows.WindowsButton;
import org.example2.ui.windows.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
