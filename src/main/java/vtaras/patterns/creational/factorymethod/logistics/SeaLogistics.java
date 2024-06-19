package vtaras.patterns.creational.factorymethod.logistics;

import vtaras.patterns.creational.factorymethod.transport.Ship;
import vtaras.patterns.creational.factorymethod.transport.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
