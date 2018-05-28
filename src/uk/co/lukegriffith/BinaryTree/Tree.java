package uk.co.lukegriffith.BinaryTree;

public class Tree {

    private Node root;

    public Tree(int[] IntData) {

        root = new Node(IntData[0]);

        Node currNode = root;

        for (int i = 1; i < IntData.length; i++) {

            boolean found = false;

            while (!found) {

                if (IntData[i] == currNode.getData()) {
                    found = true;
                }
                if (IntData[i] > currNode.getData() && currNode.getRight() == null) {
                    currNode.setRight(new Node(IntData[i]));
                    found = true;
                }
                else if (IntData[i] > currNode.getData()) {
                    currNode = currNode.getRight();
                }
                else if (IntData[i] < currNode.getData() && currNode.getLeft() == null) {
                    currNode.setLeft(new Node(IntData[i]));
                    found = true;
                }
                else if (IntData[i] < currNode.getData()) {
                    currNode = currNode.getLeft();
                }

            m

            currNode = root;
        }
    }
}
