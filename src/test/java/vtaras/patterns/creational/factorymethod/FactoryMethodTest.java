package vtaras.patterns.creational.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vtaras.patterns.creational.factorymethod.logistics.Logistics;
import vtaras.patterns.creational.factorymethod.logistics.RoadLogistics;
import vtaras.patterns.creational.factorymethod.logistics.SeaLogistics;
import vtaras.patterns.creational.factorymethod.transport.Ship;
import vtaras.patterns.creational.factorymethod.transport.Transport;
import vtaras.patterns.creational.factorymethod.transport.Truck;

class FactoryMethodTest {

    @Test
    void testRoadLogisticsCreatesTruck() {
        Logistics logistics = new RoadLogistics();
        Transport transport = logistics.createTransport();

        Assertions.assertInstanceOf(Truck.class, transport, "Transport should be an instance of Truck");
    }

    @Test
    void testSeaLogisticsCreatesShip() {
        Logistics logistics = new SeaLogistics();
        Transport transport = logistics.createTransport();

        Assertions.assertInstanceOf(Ship.class, transport, "Transport should be an instance of Ship");
    }

    @Test
    void testTruckDeliver() {
        Transport transport = new Truck();

        Assertions.assertEquals("Deliver by land in a box.", transport.deliver());
    }

    @Test
    void testShipDeliver() {
        Transport transport = new Ship();

        Assertions.assertEquals("Deliver by sea in a container.", transport.deliver());
    }
}
