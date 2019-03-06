
class Node{
    int data;
    Node next;
    Node prev;
}

public class DoublyLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;



    void insert(Node node){
        System.out.println("inserting node " + node.data + " at last" );
        if(head == null){
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            node.prev = temp;
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        for (int i = 0; i<5; i++ ){

            Node node = new Node();
            node.data = (i + 1) * 1000;
            linkedList.insert(node);
        }

        linkedList.display();
        linkedList.delete();
        linkedList.display();
    }

    void delete (){
        if(head == null){
            System.out.println("empty list");
        }
        else{
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            }
            System.out.println("deleting node " + temp.data + " from last");
            temp = temp.prev;
            temp.next = null;
        }

    }

    void display(){
        System.out.println("Doubly linkedList");
        Node temp = head;
        System.out.println("null <...>");
        while(temp != null){
            System.out.println(temp.data + "<...>");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
