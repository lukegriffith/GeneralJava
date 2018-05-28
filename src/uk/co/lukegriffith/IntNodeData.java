package uk.co.lukegriffith;
import uk.co.lukegriffith.BinaryTree.NodeData;

public class IntNodeData implements NodeData {


    private int data;


    public IntNodeData(int data) {
        this.data = data;
    }

    public int getIntValue(){
        return this.data;
    }
}
