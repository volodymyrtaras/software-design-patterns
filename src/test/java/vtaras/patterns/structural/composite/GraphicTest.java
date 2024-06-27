package vtaras.patterns.structural.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphicTest {

    @Test
    void testCircleDescribeAction() {
        Graphic circle = new Circle();

        Assertions.assertEquals("Drawing Circle", circle.describeAction());
    }

    @Test
    void testSquareDescribeAction() {
        Graphic square = new Square();

        Assertions.assertEquals("Drawing Square", square.describeAction());
    }

    @Test
    void testCompositeGraphicDescribeActionWithSingleChild() {
        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic.add(new Circle());

        Assertions.assertEquals("Drawing Circle\n", compositeGraphic.describeAction());
    }

    @Test
    void testCompositeGraphicDescribeActionWithMultipleChildren() {
        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic.add(new Circle());
        compositeGraphic.add(new Square());

        Assertions.assertEquals("Drawing Circle\nDrawing Square\n", compositeGraphic.describeAction());
    }

    @Test
    void testCompositeGraphicNested() {
        CompositeGraphic compositeGraphic1 = new CompositeGraphic();
        compositeGraphic1.add(new Circle());
        compositeGraphic1.add(new Square());

        CompositeGraphic compositeGraphic2 = new CompositeGraphic();
        compositeGraphic2.add(compositeGraphic1);
        compositeGraphic2.add(new Circle());

        Assertions.assertEquals("Drawing Circle\nDrawing Square\n\nDrawing Circle\n", compositeGraphic2.describeAction());
    }

    @Test
    void testCompositeGraphicAddRemove() {
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        Graphic circle = new Circle();
        Graphic square = new Square();

        compositeGraphic.add(circle);
        compositeGraphic.add(square);

        Assertions.assertEquals("Drawing Circle\nDrawing Square\n", compositeGraphic.describeAction());

        compositeGraphic.remove(square);

        Assertions.assertEquals("Drawing Circle\n", compositeGraphic.describeAction());
    }
}
