package vtaras.patterns.creational.factorymethod.logistics;

import vtaras.patterns.creational.factorymethod.transport.Transport;
import vtaras.patterns.creational.factorymethod.transport.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
