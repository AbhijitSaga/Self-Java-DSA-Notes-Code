package LinkedList.SingleLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertAtIndex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
         temp=temp.next;
        }

        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
        
    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteAtIndex(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node prevNode=getNodeAtIndex(index-1);
        int val=prevNode.next.value;
        prevNode.next=prevNode.next.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
       Node secondLast=getNodeAtIndex(size-2);
        secondLast.next=null;
        size--;
        return secondLast.value;
    }

    public Node getNodeAtIndex(int index){
        Node node=head;
        for (int i=0;i< index;i++){
            node=node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node=head;
        while (node.next!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp =temp.next;
        }
        System.out.println("END");
    }



    private class Node{
       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }
}
