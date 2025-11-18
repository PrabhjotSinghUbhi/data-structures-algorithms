package com.prabhjot.dsa.data_structures.linked_lists.circular_linked_list;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    // Inserts a new node at the beginning of the list
    public void insertAtFirst(int val) {
        Node node = new Node(val);

        if (tail != null) {
            tail.next = node; // Update the tail's next to point to the new node
        }
        node.next = head; // New node points to the current head
        head = node; // Update head to the new node
    }

    // Displays the elements of the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Head -> ");
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head); // Loop until we circle back to the head
        System.out.println("Head (circular)");
    }

    // Inserts a new node at the end of the list
    public void insertLast(int val) {
        Node node = new Node(val);

        if (tail != null) {
            tail.next = node; // Update the current tail's next to the new node
        }
        node.next = head; // New node points to the head (circular link)
        tail = node; // Update tail to the new node
    }

    // Deletes the first node in the list
    public void deleteFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head == tail) { // If there's only one node
            head = tail = null; // Set both head and tail to null
        } else {
            head = head.next; // Move head to the next node
            tail.next = head; // Update tail's next to the new head
        }
    }

    // Deletes the last node in the list
    public void deleteLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head == tail) { // If there's only one node
            head = tail = null; // Set both head and tail to null
        } else {
            Node temp = head;
            while (temp.next != tail) { // Traverse to the second last node
                temp = temp.next;
            }
            temp.next = head; // Update the second last node's next to head
            tail = temp; // Update tail to the second last node
        }
    }

    // Searches for a value in the list and returns true if found
    public boolean find(int val) {
        if (head == null) {
            return false; // List is empty
        }

        Node temp = head;
        do {
            if (temp.val == val) { // Check if the current node's value matches
                return true;
            }
            temp = temp.next;
        } while (temp != head); // Loop until we circle back to the head

        return false; // Value not found
    }

    // Returns the size of the circular linked list
    public int getSize() {
        if (head == null) {
            return 0; // List is empty
        }

        int size = 0;
        Node temp = head;
        do {
            size++; // Increment size for each node
            temp = temp.next;
        } while (temp != head); // Loop until we circle back to the head

        return size;
    }

    private static class Node {
        private final int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
