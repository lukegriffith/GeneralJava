package uk.co.lukegriffith;

import uk.co.lukegriffith.BinaryTree.Tree;
import uk.co.lukegriffith.BinaryTree.Node;

public class Main {

    public static void main(String[] args) {

        IntNodeData[] a = {
                new IntNodeData(5),
                new IntNodeData(1),
                new IntNodeData(7),
                new IntNodeData(4),
                new IntNodeData(8),
                new IntNodeData(4)
        };

        Tree t =  new Tree(a);

        System.out.print("Built");

        Node n = t.RFindNodeByData(8, t.getRoot());

        System.out.println(n.getData());

    }
}
