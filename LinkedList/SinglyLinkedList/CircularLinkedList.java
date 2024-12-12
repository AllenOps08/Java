package SinglyLinkedList;

public class CircularLinkedList {

    static Node insertInEmptyList(Node last , int data){
        if (last != null) {
            return last;
        }

        // Create a new node 
        Node newNode = new Node(data);
  
        // Point newNode to itself
        newNode.next = newNode;

        last = newNode;
        return last;
    }

    static void printList(Node last){
        if (last == null) {
            return ;
        }

        Node head = last.next ;
        while (true) {
            System.out.println(head.data + " ");
            head = head.next  ;
            if (head == last.next) {
                break ;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node last = null; 
        last = insertInEmptyList(last,1);
        last = insertInEmptyList(last, 2);
        System.out.println("List after insertion: ");
        printList(last);
    }
    
}

class Node {
    int data;
    Node next; 


    Node(int value){
        data = value;
        next  = null; 
    }
}
