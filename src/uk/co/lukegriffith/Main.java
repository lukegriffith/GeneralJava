package uk.co.lukegriffith;

import uk.co.lukegriffith.BinaryTree.Tree;
import uk.co.lukegriffith.BinaryTree.Node;

public class Main {

    public static void main(String[] args) {

        int[] a = {5,1,7,3,8,2,8};

        Tree t =  new Tree(a);

        System.out.print("Built");

        Node n = t.FindNodeByData(9);

        System.out.println(n.getData());



    }
}
