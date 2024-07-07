package vtaras.patterns.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.List;

/*
 * The Template Method pattern is a behavioral design pattern that defines the skeleton of an algorithm in a method, delegating some steps to subclasses
 *
 * It allows subclasses to redefine certain steps of the algorithm without changing its structure, promoting code reuse and ensuring consistent behavior across different implementations
 */
public abstract class HouseTemplate {

    public final List<String> buildHouse() {
        List<String> eventList = new ArrayList<>();

        eventList.add(buildFoundation());
        eventList.add(buildWalls());
        eventList.add(buildRoof());
        eventList.add(decorateHouse());

        if (addExtraFeatures()) {
            eventList.add(addExtra());
        }

        return eventList;
    }

    abstract String buildFoundation();

    abstract String buildWalls();

    abstract String buildRoof();

    abstract String decorateHouse();

    boolean addExtraFeatures() {
        return true;
    }

    String addExtra() {
        return "Adding additional features to the house";
    }
}
