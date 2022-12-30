package org.example.transportFactory.ext;

import org.example.transport.ITransport;
import org.example.transport.impl.Truck;
import org.example.transportFactory.TransportFactory;

public class CreateTruck extends TransportFactory {
    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
