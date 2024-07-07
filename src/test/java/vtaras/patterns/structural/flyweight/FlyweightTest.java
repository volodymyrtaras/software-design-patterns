package vtaras.patterns.structural.flyweight;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FlyweightTest {

    private final Forest forest = new Forest();

    @Test
    void testDraw() {
        forest.plantTree(0, 0, "Oak", "Green", "Rough");
        forest.plantTree(1, 0, "Pine", "Green", "Smooth");
        forest.plantTree(0, 1, "Oak", "Green", "Rough");
        forest.plantTree(1, 1, "Pine", "Green", "Smooth");

        List<String> events = forest.draw();

        Assertions.assertEquals(4, events.size());

        Assertions.assertEquals("Drawing Oak tree at (0, 0) with color Green and texture Rough", events.get(0));
        Assertions.assertEquals("Drawing Pine tree at (1, 0) with color Green and texture Smooth", events.get(1));
        Assertions.assertEquals("Drawing Oak tree at (0, 1) with color Green and texture Rough", events.get(2));
        Assertions.assertEquals("Drawing Pine tree at (1, 1) with color Green and texture Smooth", events.get(3));
    }
}
