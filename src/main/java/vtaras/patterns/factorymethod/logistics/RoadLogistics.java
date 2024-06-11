package vtaras.patterns.factorymethod.logistics;

import vtaras.patterns.factorymethod.transport.Transport;
import vtaras.patterns.factorymethod.transport.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
