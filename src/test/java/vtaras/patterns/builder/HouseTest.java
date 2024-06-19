package vtaras.patterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vtaras.patterns.creational.builder.House;

class HouseTest {

    @Test
    void testHouseBuilder() {
        House house = House
            .builder()
            .foundation("foundation")
            .structure("structure")
            .roof("roof")
            .interior("interior")
            .build();

        Assertions.assertNotNull(house);

        Assertions.assertEquals("foundation", house.getFoundation());
        Assertions.assertEquals("structure", house.getStructure());
        Assertions.assertEquals("roof", house.getRoof());
        Assertions.assertEquals("interior", house.getInterior());
    }

    @Test
    void testHouseBuilderNoInterior() {
        House house = House
            .builder()
            .foundation("foundation")
            .structure("structure")
            .roof("roof")
            .build();

        Assertions.assertNotNull(house);

        Assertions.assertEquals("foundation", house.getFoundation());
        Assertions.assertEquals("structure", house.getStructure());
        Assertions.assertEquals("roof", house.getRoof());
        Assertions.assertNull(house.getInterior());
    }

    @Test
    void testHouseBuilderPartial() {
        House house = House
            .builder()
            .foundation("foundation")
            .build();

        Assertions.assertNotNull(house);

        Assertions.assertEquals("foundation", house.getFoundation());
        Assertions.assertNull(house.getStructure());
        Assertions.assertNull(house.getRoof());
        Assertions.assertNull(house.getInterior());
    }

    @Test
    void testDefaultHouseBuilder() {
        House house = House
            .builder()
            .build();

        Assertions.assertNotNull(house);

        Assertions.assertNull(house.getFoundation());
        Assertions.assertNull(house.getStructure());
        Assertions.assertNull(house.getRoof());
        Assertions.assertNull(house.getInterior());
    }
}
