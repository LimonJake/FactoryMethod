package org.example.transportFactory;

import org.example.transport.ITransport;

public abstract class TransportFactory {

    public void doSomething(){
        ITransport transport = createTransport();
        transport.filling();
        transport.start();

    }
    protected abstract ITransport createTransport();
}
