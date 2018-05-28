package uk.co.lukegriffith.BinaryTree;

import uk.co.lukegriffith.BinaryTree.TreePrinter.PrintableNode;

public class Node implements PrintableNode {

    private Node left;
    private Node right;

    private NodeData data;

    public NodeData getNodeData() {
        return data;
    }

    public int getData(){
        return data.getIntValue();
    }


    public String getText() {
        //return Integer.toString(data.getIntValue());
        return data.getStringValue();
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public void setData(NodeData data) {
        this.data = data;
    }


    public Node(NodeData data) {
        this.data = data;
    }
}
