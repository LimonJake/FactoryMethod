package org.example2.uifactory;

import org.example2.ui.IButton;
import org.example2.ui.ICheckBox;

public interface UIFactory {

    IButton createButton();
    ICheckBox createCheckBox();

}
