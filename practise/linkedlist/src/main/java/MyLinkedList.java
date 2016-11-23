/**
 * Created by ashwani on 8/20/16.
 */
public class MyLinkedList {

    Node head;
    int count;


    public void add(int number) {
        if (head == null) {
            head = new Node(number);
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();

            }
            Node newNode = new Node(number);
            currentNode.setNext(newNode);
        }
        count++;
    }

    public int length() {
        return count;
    }

    public void delete(int value) {
        boolean delete = false;
        Node currentNode = head;
        Node previousNode = head;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                delete = true;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (delete) {
            if (currentNode == head) {
                head = currentNode.getNext();
            } else if (currentNode.getNext() == null) {
                previousNode.setNext(null);
            } else {
                previousNode.setNext(currentNode.getNext());
            }
            count--;
        }
    }

    public void showList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }

    }
}
