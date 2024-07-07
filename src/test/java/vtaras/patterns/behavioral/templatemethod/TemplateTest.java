package vtaras.patterns.behavioral.templatemethod;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TemplateTest {

    @Test
    void testConcreteHouseBuildHouse() {
        HouseTemplate house = new ConcreteHouse();

        List<String> eventList = house.buildHouse();

        Assertions.assertEquals(4, eventList.size());
        Assertions.assertEquals("Building foundation with concrete, cement, and steel bars", eventList.get(0));
        Assertions.assertEquals("Building concrete walls", eventList.get(1));
        Assertions.assertEquals("Building concrete roof", eventList.get(2));
        Assertions.assertEquals("Decorating interior with modern furniture", eventList.get(3));
    }

    @Test
    void testWoodenHouseBuildHouse() {
        HouseTemplate house = new WoodenHouse();

        List<String> eventList = house.buildHouse();

        Assertions.assertEquals(5, eventList.size());
        Assertions.assertEquals("Building foundation with wood, iron rods, and gravel", eventList.get(0));
        Assertions.assertEquals("Building wooden walls", eventList.get(1));
        Assertions.assertEquals("Building wooden roof", eventList.get(2));
        Assertions.assertEquals("Decorating interior with wooden furniture", eventList.get(3));
        Assertions.assertEquals("Adding additional features to the house", eventList.get(4));
    }
}
