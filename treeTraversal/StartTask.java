package treeTraversal;

import java.util.ArrayList;
import java.util.List;

import static treeTraversal.NodeOperation.collectAllNodes;

public class StartTask {

    public static Node getFilledNode() {
        Node root = new Node("root");
        Node child1 = new Node("child1");   //    r
        Node child2 = new Node("child2");   //   / \
        Node child3 = new Node("child3");   //  1   2
        Node child4 = new Node("child4");   // / \   \
        Node child5 = new Node("child5");   //3   4   5

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);
        child1.addChild(child4);
        child2.addChild(child5);

        return root;
    }

    public static void start() {

        List<Node> allNodes = new ArrayList<>();

        collectAllNodes(getFilledNode(), allNodes);

        printArrayNodes(allNodes);

    }

    public static void printArrayNodes(List<Node> allNodes) {
        System.out.println("Все узлы:");
        for (Node node : allNodes) {
            System.out.println(node.getValue());
        }
    }
}