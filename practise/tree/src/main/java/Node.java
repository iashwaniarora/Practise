/**
 * Created by ashwani on 10/15/16.
 */
public class Node {
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    private int key;
    private Node leftChild;
    private Node rightChild;

    Node(int key,Node leftChild,Node rightChild)
    {
        this.key=key;
        this.leftChild=leftChild;
        this.rightChild=rightChild;
    }

}
