package LinkedList.dubleLinkedList;

public class DLL {
    private Node head;
    private  int size=0;
    void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;

        if(head!=null) {
            head.previous = node;
        }
        head=node;
        size++;
    }


  void  insertAtLast(int value){
        Node node=new Node(value);
        Node temp=head;
        if(node==null){
           head=node;
           node.next=null;
           return;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.previous=temp;
        node.next=null;
  }

    void display(){
        Node temp=head;
        Node last=null;
        //display forward diraction
        while (temp!=null){
         System.out.print(temp.value+"->");
         last=temp;
         temp=temp.next;
        }
        System.out.println("End");

        //display backward diraction
        while (last!=null){
         System.out.print(last.value +"->");
         last=last.previous;
        }
        System.out.println("Start");
    }


   private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
