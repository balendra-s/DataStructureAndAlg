public class NodeTest{
    private int value;
    private NodeTest leftChild;
    private NodeTest rightChild;

    public NodeTest(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftChild(NodeTest leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(NodeTest rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public NodeTest getLeftChild() {
        return leftChild;
    }

    public NodeTest getRightChild() {
        return rightChild;
    }

    @Override
    public String toString(){
        return "Node " + value;
    }
}
