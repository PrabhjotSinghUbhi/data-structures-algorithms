package com.prabhjot.collections.list.linkedlist;

import java.util.LinkedList;

/*
- LinkedList extends the List interface.
    - main feature:
        - Dynamic Size
- it uses points internally to connect each of the nodes.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        /*
        - Linked list can behave as Stacks as well.
        - Linked list best used when there is frequent need to add elements in the middle of the list.
         */

        ll.add(1);
        ll.add(1);
        ll.add(1);
        ll.add(1);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
}
