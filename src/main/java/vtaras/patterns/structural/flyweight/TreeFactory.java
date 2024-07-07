package vtaras.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, TreeType> TREE_TYPE_MAP = new HashMap<>();

    private TreeFactory() {

    }

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;

        return TREE_TYPE_MAP.computeIfAbsent(key, function -> new ConcreteTreeType(name, color, texture));
    }
}
