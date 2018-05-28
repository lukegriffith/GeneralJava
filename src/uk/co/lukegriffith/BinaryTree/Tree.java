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
                } else if (IntData[i] > currNode.getData()) {
                    currNode = currNode.getRight();
                } else if (IntData[i] < currNode.getData() && currNode.getLeft() == null) {
                    currNode.setLeft(new Node(IntData[i]));
                    found = true;
                } else if (IntData[i] < currNode.getData()) {
                    currNode = currNode.getLeft();
                }

            }
            currNode = root;
        }

    }
    public Node FindNodeByData(int data) {

        boolean found = false;

        Node currNode = root;

        while (!found) {

            if (data == currNode.getData()) {
                found = true;
            }
            else if (data > currNode.getData() && currNode.getRight() != null)  {
                currNode = currNode.getRight();
            }
            else if (data < currNode.getData() && currNode.getLeft() != null){
                currNode = currNode.getLeft();
            }
            else {
                throw new java.lang.Error("Unable to find node");
            }
        }

        return currNode;
    }

}
