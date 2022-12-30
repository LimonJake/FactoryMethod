package org.example.transportFactory.ext;

import org.example.transport.ITransport;
import org.example.transport.impl.Ship;
import org.example.transportFactory.TransportFactory;

public class CreateShip extends TransportFactory {
    @Override
    public ITransport createTransport() {
        return new Ship();
    }
}
