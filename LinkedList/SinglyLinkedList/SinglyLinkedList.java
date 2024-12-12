package SinglyLinkedList;

public class SinglyLinkedList {
 
private class Node {
  int data;
  Node next; 

public Node(int data){
    this.data = data ;
    this.next = null ;
}
}

private Node head; 
 
public SinglyLinkedList(){
    this.head  = null ;
}

// Add a node at the end of the linked list
public void add(int data){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head ;
        while (current.next != null) {
            current = current.next; 
        }
        current.next = newNode;
    }
}

public Node removeFirstNode(){
   
    if (head == null) {
        return null ;
    }

    // Move the head pointer to the next node
    Node temp = head;
    head = head.next ;
     
    return head; 
}

public Node removeLastNode(){
    if (head == null) {
        return null ;
    }

    //If the list has only one node , delete it and return
    if(head.next  == null){
        head = null;
        return null ;
    }

    Node second_last = head; 
    while (second_last.next.next  != null) {
        second_last = second_last.next;
    }

    // Remove the last node
    second_last.next = null;

    // Return the modified list
    return head; 

}

public void traverseLinkedList(){
    //Start from the head of the linked list
    Node current = head ;

    // Traverse the ll until reachng the end
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println();
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


public void deleteAtPosition(int position){
    if(head == null || position < 1) return;

    //If the head needs to be deleted
    if (position == 1) {
        Node temp = head; 
        head = head.next ;
        temp = null;
        return ;
     }

    //Traverse to the node before the position to be deleted 
     Node current = head; 
     for (int i = 0; i < position - 1 && current != null; i++) {
         current = current.next; 
     }

     if (current == null || current.next == null) {
        return ;
     }
    
    // Store the node to be deleted 
     Node temp = current.next  ;
    //  Update the links to bypass the node to be deleted 
    current.next  = current.next.next ;

    temp = null;
}



}


