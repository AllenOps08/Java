class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data; 
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original linked list : ");
        printList(head);
 
        head  = reverseLinkedList(head);

        System.out.println("Reversed linked list : ");
        printList(head);
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node head){
        Node prev = null, current = head, next;

        while (current != null) {
            // Basic swapping
            next = current.next; 
            current.next  = prev; 
            prev = current ;
            current = next;
        }

        return prev; 
    }



}