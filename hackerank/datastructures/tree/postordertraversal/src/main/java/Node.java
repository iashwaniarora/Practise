/**
 * Created by ashwani on 11/21/16.
 */
public class Node {
    int data;

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    Node leftNode;
    Node rightNode;

    Node(int data)
    {
        this.data=data;
    }

}
