package vtaras.patterns.structural.bridge;

/*
 * The Bridge pattern is a structural design pattern that decouples an abstraction from its implementation, allowing them to vary independently
 *
 * It achieves this by defining an interface for the abstraction and another interface for the implementation, with concrete implementations for both
 *
 * This separation enables flexible and scalable designs, making it easier to extend and maintain the codebase
 */
public class Circle extends Shape {

    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(color);

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    String applyColor() {
        String applyColorResult = color.applyColor();
        String message = "Drawing Circle at (" + x + ", " + y + ") with radius " + radius;

        return applyColorResult + "\n" + message;
    }
}
