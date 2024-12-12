import SinglyLinkedList.SinglyLinkedList;

public class Practice {
    private Node head; 

    public Practice(){
        this.head  = null;
    }

    public Node insertAtFront(int data){
        Node new_Node = new Node(data);
        new_Node.next = head; 
        return new_Node;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head; 
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public Node removeFirstNode(){
        if (head == null) {
            return null; 
        }

        Node temp = head; 
        head = head.next ;
        return head; 
    }

    public Node removeLastNode(){
        if(head == null){
            return null;
        }

        if(head.next == null) {
            head = null;
            return null;
        }

        Node second_last = head; 
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }

        second_last.next = null ;
        return head ;
    }

    public void printLinkedList(){
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteAtPosition(int position){
        if(head == null || position<1) return;
        
        if(position == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return;
        }


        Node current = head; 
        for (int i = 0; i < position-1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        Node temp = current.next;
        current.next  = current.next.next; 

        temp = null;
    }


    
public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    System.out.println("Linked list after adding elements");
    list.traverseLinkedList();

    list.removeFirstNode();
    System.out.println("Linked list after removing first node ");
    list.traverseLinkedList();

    list.removeLastNode();
    System.out.println("Linked list after removing last node ");
    list.traverseLinkedList();

    list.deleteAtPosition(1);
    System.out.println("Deleted at position : " + 1);
    list.traverseLinkedList();

}

}


class Node{
    int data ;
    Node next;

    public Node(int data){
        this.data  = data ;
        this.next = null;
    }
}


