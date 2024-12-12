public class DoublyLinkedList {
    
    static void forwardTraversal(Node head){
        Node current = head; 

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next ;
        }

        System.out.println();
    }    

    static void backwardTraversal(Node tail){
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " ");
            current  = current.prev; 
        }
        System.out.println();
    }

    static int search(Node head,  int x){
        Node current = head;
        int position = 0 ;

        while (current != null && current.data != x) {
            position++;
            current = current.next;
        }
      
        // If the integer is not present in the list
        if (current == null || current.data != x) {
            return -1;
        }

        return (position+1);
    }

    public static void main(String[] args) {
        Node head  = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.prev = head;
        second.next = third ;
        third.prev = second;

        System.out.println("Forward traversal: ");
        forwardTraversal(head);
        System.out.println("Backward traversal : ");
        backwardTraversal(third);

        Node head1 = null;
        int x = 8;

        head1 = new Node(18);
        head1.next = new Node(15);
        head1.next.prev = head1; 
        head1.next.next = new Node(8);
        head1.next.next.prev  = head1.next.next ;
        head1.next.next.next = new Node(9);
        head1.next.next.next.prev = head1.next.next ;
        head1.next.next.next.next = new Node(14);
        head1.next.next.next.next.prev = head1.next.next.next;

        System.out.println("Forward traversal: ");
        forwardTraversal(head1);

        System.out.println(search(head1, x));

    }
}


class Node{
    int data;
    // Reference to the previous node 
    Node prev;
    //Reference to the next node 
    Node next; 

    public Node(int data){
        this.data = data; 
        this.next = null;
        this.prev = null;
    }

}