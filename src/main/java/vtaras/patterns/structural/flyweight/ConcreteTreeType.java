package vtaras.patterns.structural.flyweight;

public class ConcreteTreeType implements TreeType {

    private final String name;
    private final String color;
    private final String texture;

    public ConcreteTreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String draw(int x, int y) {
        return "Drawing " +
            name +
            " tree at (" +
            x +
            ", " +
            y +
            ") with color " +
            color +
            " and texture " +
            texture;
    }
}
