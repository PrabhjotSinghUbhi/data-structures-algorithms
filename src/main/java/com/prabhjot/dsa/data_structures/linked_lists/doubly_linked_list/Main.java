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

        
        dl.deleteAt(2);     // Test deletion at a specific position

      // Test reversing the list

        dl.display();       // Display the final state of the list

//        System.out.println("Finding 19: " + dl.find(19)); // Test find method
//        System.out.println("Finding 100: " + dl.find(100)); // Test find method
//        System.out.println("Finding 7: " + dl.find(7)); // Test find method

//        System.out.println("Size of the list: " + dl.getSize()); // Test getSize method

        dl.printReverse();

    }
}
