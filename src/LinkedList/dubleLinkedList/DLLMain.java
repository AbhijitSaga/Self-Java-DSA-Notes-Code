package LinkedList.dubleLinkedList;

public class DLLMain {
    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.insertFirst(23);
        dll.insertFirst(25);
        dll.insertFirst(27);
        dll.display();

        dll.insertAtLast(45);
        dll.display();
    }
}
