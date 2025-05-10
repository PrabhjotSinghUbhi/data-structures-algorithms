package com.prabhjot.dsa.data_structures.linked_lists.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        for (int i = 1; i <= 5; i++) {
            ll.insertAtLast(i);
        }
        ll.display();

        ll.reverse();
        ll.display();

        ll.reverse();
        ll.display();
    }

}
