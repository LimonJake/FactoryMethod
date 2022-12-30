package org.example2;

import org.example2.uifactory.MacUIFactory;
import org.example2.uifactory.WindowsUIFactory;

public class Main {
    public static void main(String[] args) {

        Application app = new Application(new MacUIFactory());
        app.printApp();

    }
}
