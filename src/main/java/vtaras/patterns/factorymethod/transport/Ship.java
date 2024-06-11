package vtaras.patterns.factorymethod.transport;

public class Ship implements Transport {

    @Override
    public String deliver() {
        return "Deliver by sea in a container.";
    }
}
