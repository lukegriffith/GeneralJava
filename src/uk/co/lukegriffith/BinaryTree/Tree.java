package uk.co.lukegriffith.BinaryTree;

public class Tree {

    private Node root;

    public Tree(NodeData[] IntData) {

        root = new Node(IntData[0]);

        Node currNode = root;

        for (int i = 1; i < IntData.length; i++) {

            boolean found = false;

            while (!found) {

                if (IntData[i].getIntValue() == currNode.getData()) {
                    // Tree does not insert duplicates, already exists and ignores.
                    found = true;
                }
                if (IntData[i].getIntValue() > currNode.getData() && currNode.getRight() == null) {

                    // Inserting to the right of the current node
                    currNode.setRight(new Node(IntData[i]));
                    found = true;
                } else if (IntData[i].getIntValue() > currNode.getData()) {
                    // Searching right for location.
                    currNode = currNode.getRight();
                } else if (IntData[i].getIntValue() < currNode.getData() && currNode.getLeft() == null) {
                    // Inserting to the left of the current node.
                    currNode.setLeft(new Node(IntData[i]));
                    found = true;
                } else if (IntData[i].getIntValue() < currNode.getData()) {
                    // Searching left for location.
                    currNode = currNode.getLeft();
                }

            }
            currNode = root;
        }

    }
    public Node FindNodeByData(int data) {
        // Iterative approach to finding the node.
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

    public Node RFindNodeByData(int data, Node n) {
        // Recursive approach to finding the node.
        if (data == n.getData()) {
            return n;
        }
        else if (data > n.getData() && n.getRight() != null) {
            return RFindNodeByData(data, n.getRight());
        }
        else if (data < n.getData() && n.getLeft() != null) {
            return RFindNodeByData(data, n.getLeft());
        }
        else {
            throw new java.lang.Error("Unable to find node.");
        }
    }


    public Node getRoot() {
        return this.root;
    }
}
