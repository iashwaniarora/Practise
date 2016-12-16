/**
 * Created by ashwani on 12/10/16.
 */
public class LinkedList {

    Node head;

    public void add(int data)
    {
        if(head ==null)
        {
            head = new Node(data);
        }
        else
        {
            Node current=head;
            while(true)
            {
                Node next = current.next;
                if(next==null)
                {
                    current.next = new Node(data);

                    return;
                }
                current=current.next;
            }
        }
    }

    public void show()
    {
        Node current=head;
        int i=0;
        while(current.next!=null)
        {

                System.out.print("Node" + i + "=" + current.data + "-->");
                i++;
                current = current.next;
        }
        System.out.print("Node" + i + " " + current.data );
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
       // linkedList.show();
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.delete(6);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.delete(10);
        linkedList.delete(5);
        linkedList.show();
    }

    public void delete(int data)
    {
        Node currentNode = head,parentNode= head;
        Node nextNode;
        while(true)
        {

           if(currentNode!=null&&currentNode.data==data)
           {
               
           }

        }
       // System.out.println("item not found");
    }

}
