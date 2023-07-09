package tree;

public class Node {
    private int data;
    Node leftChild;
    Node rightChild;

    Node(int data){
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public Node() {
    }

    public int getData() {
        return data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

}
