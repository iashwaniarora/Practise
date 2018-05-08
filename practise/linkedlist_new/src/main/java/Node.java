/**
 * Created by ashwani on 12/10/16.
 */
public class Node {

    Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    int data;

    public Node(int data)
    {
        this.data=data;
    }
}
