package org.example2;

import org.example2.ui.IButton;
import org.example2.ui.ICheckBox;
import org.example2.uifactory.UIFactory;

public class Application {

    private IButton button;
    private ICheckBox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void printApp(){
        button.paint();
        checkbox.paint();
    }

}
