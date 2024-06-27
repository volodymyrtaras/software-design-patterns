package vtaras.patterns.structural.bridge;

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
