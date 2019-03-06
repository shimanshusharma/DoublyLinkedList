public class DoublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;

    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        Node node = new Node();
        node.data = 4;
        node.next = null;
        node.prev = null;
        linkedList.insert(node);
    }

    void insert(Node node){
        System.out.println("inserting node " + node.data + "at last" );
    }


}
