package vtaras.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/*
 * The Flyweight pattern minimizes memory usage by sharing common parts of object state between multiple objects, reducing redundancy
 *
 * It separates shared state from unique state to optimize resource usage, especially useful in large-scale systems with many similar objects
 */
public class Forest {

    private final List<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);

        treeList.add(tree);
    }

    public List<String> draw() {
        List<String> eventList = new ArrayList<>();

        for (Tree tree : treeList) {
            eventList.add(tree.draw());
        }

        return eventList;
    }
}
