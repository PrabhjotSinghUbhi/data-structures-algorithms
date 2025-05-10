package com.prabhjot.dsa.data_structures.linked_lists.doubly_linked_list;

public class DoublyLinkedList {
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

    }

    private Node head;
    private Node tail;

    public void insertAtFirst(int val) {

        Node node = new Node(val);

        node.prev = null;
        node.next = head;

        if(head != null) head.prev = node;

        head = node;

    }

    public void display() {
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("tail");
    }

    public void insertAtLast(int val) {
        Node node = new Node(val);
    }

}
