package uk.co.lukegriffith.BinaryTree;

public class Node {

    private Node left;
    private Node right;

    private int data;


    public int getData(){
        return data;
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

    public void setData(int data) {
        this.data = data;
    }


    public Node(int data) {
        this.data = data;
    }
}
