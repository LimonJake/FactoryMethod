package org.example.transport.impl;

import org.example.transport.ITransport;

public class Ship implements ITransport {
    @Override
    public void filling() {
        System.out.println("Filling the docker");
    }

    @Override
    public void start() {
        System.out.println("Starting the journey in the sea...");
    }
}
