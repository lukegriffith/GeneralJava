package uk.co.lukegriffith;
import uk.co.lukegriffith.BinaryTree.NodeData;

public class StringNodeData implements NodeData {


    char data;

    public int getIntValue(){
        return (int)data;
    }

    public String getStringValue(){
        return Character.toString(data);
    }

    public StringNodeData(char c) {
        this.data = c;
    }

}
