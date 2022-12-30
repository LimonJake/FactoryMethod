package org.example.transport.impl;

import org.example.transport.ITransport;

public class Truck implements ITransport {
    @Override
    public void filling() {
        System.out.println("Filling the truck");
    }

    @Override
    public void start() {
        System.out.println("Starting the journey...");
    }
}
