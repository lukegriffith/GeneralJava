package uk.co.lukegriffith;
import uk.co.lukegriffith.BinaryTree.NodeData;
import uk.co.lukegriffith.BinaryTree.TreePrinter.PrintableNode;


public class IntNodeData implements NodeData  {


    private int data;


    public IntNodeData(int data) {
        this.data = data;
    }

    public int getIntValue(){
        return this.data;
    }

    public String getStringValue(){

        return Integer.toString(data);
    }
}
