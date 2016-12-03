/**
 * Created by ashwani on 8/20/16.
 */
public class Node {

    Node(int value)
    {
        this.value = value;
        this.next =null;
    }

    private Node next;
    private int value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
