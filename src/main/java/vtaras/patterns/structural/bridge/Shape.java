package vtaras.patterns.structural.bridge;

public abstract class Shape {

    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract String applyColor();
}
