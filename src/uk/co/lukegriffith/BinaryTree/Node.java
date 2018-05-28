package uk.co.lukegriffith.BinaryTree;

public class Node {

    private Node left;
    private Node right;

    private NodeData data;

    public NodeData getNodeData() {
        return data;
    }

    public int getData(){
        return data.getIntValue();
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
