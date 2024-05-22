package LinkedList.SingleLinkedList;

import LinkedList.SingleLinkedList.LL;

public class LLMain {

    public static void main(String[] args) {
     LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(4);
        list.insertFirst(17);
        list.insertFirst(8);

        list.display();

        list.insertLast(15);
        list.insertAtIndex(100,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtIndex(2));
        list.display();
        System.out.println();
    }
}
