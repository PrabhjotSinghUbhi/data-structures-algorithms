package com.prabhjot.dsa.data_structures.linked_lists.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        
        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
        ll.insertAtLast(4);
        ll.insertAtLast(5);
        ll.insertAtLast(6);

        ll.deleteAt(2);
        ll.deleteAt(2);
        ll.deleteAt(2);
       

        ll.display();
    }
}
