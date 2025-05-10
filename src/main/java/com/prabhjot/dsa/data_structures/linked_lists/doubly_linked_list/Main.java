package com.prabhjot.dsa.data_structures.linked_lists.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertAtFirst(10);
        dl.insertAtFirst(9);
        dl.insertAtFirst(8);
        dl.insertAtFirst(7);

        dl.insertAtLast(19);
        dl.insertAtLast(100);

        dl.insertAt(69, 3);

        dl.deleteAtFirst(); // Test deletion at the beginning
        dl.deleteAtLast();  // Test deletion at the end
        dl.deleteAt(2);     // Test deletion at a specific position

        dl.reverse();       // Test reversing the list

        dl.display();       // Display the final state of the list
    }
}
