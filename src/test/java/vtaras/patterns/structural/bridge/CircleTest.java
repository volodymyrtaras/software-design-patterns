package vtaras.patterns.structural.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircleTest {

    private Shape redCircle;
    private Shape greenCircle;

    @BeforeEach
    void setUp() {
        redCircle = new Circle(100, 100, 10, new RedColor());
        greenCircle = new Circle(200, 200, 20, new GreenColor());
    }

    @Test
    void testRedCircleDrawing() {
        String expectedResult = "Applying red color" + "\n" + "Drawing Circle at (100, 100) with radius 10";

        String applyColorResult = redCircle.applyColor();

        Assertions.assertNotNull(applyColorResult);
        Assertions.assertEquals(expectedResult, applyColorResult);
    }

    @Test
    void testGreenCircleDrawing() {
        String expectedResult = "Applying green color" + "\n" + "Drawing Circle at (200, 200) with radius 20";

        String applyColorResult = greenCircle.applyColor();

        Assertions.assertNotNull(applyColorResult);
        Assertions.assertEquals(expectedResult, applyColorResult);
    }
}
