/**
 * Created by ashwani arora on 8/20/2016.
 */
public class MyListMain {


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(56);
        myLinkedList.add(52);
        myLinkedList.add(6);
        myLinkedList.showList();
      myLinkedList.delete(56);
       myLinkedList.delete(52);
        myLinkedList.delete(6);
        myLinkedList.delete(5);
        System.out.println("After deletion "+myLinkedList.length());
        myLinkedList.showList();




    }
}
