package uk.co.lukegriffith;

import uk.co.lukegriffith.BinaryTree.Tree;
import uk.co.lukegriffith.BinaryTree.Node;
import uk.co.lukegriffith.BinaryTree.TreePrinter;

public class Main {

    public static void main(String[] args) {

        IntNodeData[] a = {
                new IntNodeData(5),
                new IntNodeData(1),
                new IntNodeData(7),
                new IntNodeData(3),
                new IntNodeData(4),
                new IntNodeData(8),
                new IntNodeData(4),
                new IntNodeData(10),
                new IntNodeData(2),
                new IntNodeData(20),
                new IntNodeData(40),
                new IntNodeData(13)

        };

        Tree t =  new Tree(a);

        System.out.print("Built");

        Node n = t.RFindNodeByData(8, t.getRoot());

        System.out.println(n.getData());


        TreePrinter.print(t.getRoot());

        StringNodeData[] s = {
                new StringNodeData('f'),
                new StringNodeData('t'),
                new StringNodeData('e'),
                new StringNodeData('k'),
                new StringNodeData('r'),
                new StringNodeData('u'),
                new StringNodeData('h'),
                new StringNodeData('G'),
                new StringNodeData('f'),
                new StringNodeData('i'),
                new StringNodeData('r'),
                new StringNodeData('D'),
                new StringNodeData('a'),
                new StringNodeData('p'),
                new StringNodeData('r'),
                new StringNodeData('G'),
                new StringNodeData('u'),
                new StringNodeData('n'),
                new StringNodeData('e'),
                new StringNodeData('i'),
                new StringNodeData('e'),
                new StringNodeData('t'),
                new StringNodeData('i'),
                new StringNodeData('m'),
                new StringNodeData('L'),
                new StringNodeData('h'),



        };

        Tree t2 = new Tree(s);

        TreePrinter.print(t2.getRoot());



        int i = 2;

        boolean c = i++ == 2;
        boolean b = --i == 2;

        int z = 0;



    }
}
