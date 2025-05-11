package com.prabhjot.dsa.data_structures.linked_lists.circular_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();

        cl.insertAtFirst(5);
        cl.insertAtFirst(4);
        cl.insertAtFirst(3);
        cl.insertAtFirst(2);
        cl.insertAtFirst(1);

        cl.insertLast(99);
        cl.display();
    }
}
