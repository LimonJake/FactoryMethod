package org.example;

import org.example.transportFactory.TransportFactory;
import org.example.transportFactory.ext.CreateShip;

public class Main {
    public static void main(String[] args) {

        TransportFactory transport = new CreateShip();
        transport.doSomething();

    }
}