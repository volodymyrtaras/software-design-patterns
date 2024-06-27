package vtaras.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private final List<Graphic> childGraphics = new ArrayList<>();

    @Override
    public String describeAction() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Graphic graphic : childGraphics) {
            stringBuilder
                .append(graphic.describeAction())
                .append("\n");
        }

        return stringBuilder.toString();
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
