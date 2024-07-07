package vtaras.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

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
          eventList.add(  tree.draw());
        }

        return eventList;
    }
}
