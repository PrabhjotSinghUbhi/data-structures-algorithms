package com.prabhjot.dsa.data_structures.linked_lists.singly_linked_list;

import java.util.NoSuchElementException;

/**
 * A class representing a singly linked list data structure.
 * Provides methods for insertion, deletion, and searching of elements.
 */
public class LinkedList {

    private static final String DELETED_MESSAGE = " DELETED: ";

    /**
     * Inner class representing a node in the linked list.
     */
    class Node {
        private int val; // Value stored in the node
        private Node next; // Reference to the next node

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head; // Reference to the first node in the list
    private Node tail; // Reference to the last node in the list
    private int size; // Number of elements in the list

    /**
     * Inserts a new node with the given value at the beginning of the list.
     * 
     * @param val The value to insert.
     */
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head; // Point the new node to the current head
        head = node; // Update the head to the new node

        // If the list was empty, update the tail as well
        if (tail == null) {
            tail = head;
        }

        size++; // Increment the size of the list
    }

    /**
     * Displays the elements of the linked list.
     * Prints "List is Empty." if the list has no elements.
     */
    public void display() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("TAIL");
    }

    /**
     * Returns the size of the linked list.
     * 
     * @return The number of elements in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Inserts a new node with the given value at the end of the list.
     * 
     * @param val The value to insert.
     */
    public void insertAtLast(int val) {
        Node node = new Node(val);

        // If the list is empty, reuse the insertAtFirst method
        if (head == null) {
            insertAtFirst(val);
            return;
        }

        tail.next = node; // Link the current tail to the new node
        tail = node; // Update the tail to the new node
        size++; // Increment the size of the list
    }

    /**
     * Inserts a new node with the given value at the specified position.
     * 
     * @param pos The position to insert the value at (0-based index).
     * @param val The value to insert.
     * @throws IndexOutOfBoundsException If the position is invalid.
     */
    public void insertAt(int pos, int val) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid Position.");
        } else if (pos == 0) {
            insertAtFirst(val);
        } else if (pos == size) {
            insertAtLast(val);
        } else {
            Node temp = getNode(pos - 1); // Get the node before the position
            Node node = new Node(val, temp.next); // Create a new node
            temp.next = node; // Link the new node to the list
            size++; // Increment the size of the list
        }
    }

    /**
     * Retrieves the node at the specified index.
     * 
     * @param index The index of the node to retrieve (0-based index).
     * @return The node at the specified index.
     * @throws IndexOutOfBoundsException If the index is invalid.
     */
    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    /**
     * Deletes the first node in the list and returns its value.
     * 
     * @return The value of the deleted node.
     * @throws NoSuchElementException If the list is empty.
     */
    public int deleteAtFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is Empty");
        }

        int val = head.val; // Store the value of the head
        head = head.next; // Update the head to the next node

        // If the list becomes empty, update the tail to null
        if (head == null) {
            tail = null;
        }

        size--; // Decrement the size of the list
        System.out.println(DELETED_MESSAGE + val);
        return val;
    }

    /**
     * Deletes the last node in the list and returns its value.
     * 
     * @return The value of the deleted node.
     * @throws NoSuchElementException If the list is empty.
     */
    public int deleteAtLast() {
        if (head == tail) { // If there's only one element, reuse deleteAtFirst
            return deleteAtFirst();
        } else {
            int val = tail.val; // Store the value of the tail
            Node prev = getNode(size - 2); // Get the second-to-last node
            tail = prev; // Update the tail to the second-to-last node
            tail.next = null; // Remove the reference to the old tail
            size--; // Decrement the size of the list
            System.out.println(DELETED_MESSAGE + val);
            return val;
        }
    }

    /**
     * Deletes the node at the specified index and returns its value.
     * 
     * @param index The index of the node to delete (0-based index).
     * @return The value of the deleted node.
     * @throws NoSuchElementException If the index is invalid.
     */
    public int deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException("Invalid Position");
        } else if (index == 0) {
            return deleteAtFirst();
        } else if (index == size - 1) {
            return deleteAtLast();
        } else {
            Node prev = getNode(index - 1); // Get the node before the index
            int val = prev.next.val; // Store the value of the node to delete
            prev.next = prev.next.next; // Remove the node from the list
            size--; // Decrement the size of the list
            System.out.println(DELETED_MESSAGE + val);
            return val;
        }
    }

    /**
     * Finds the index of the first occurrence of the given value.
     * 
     * @param val The value to search for.
     * @return The index of the value, or -1 if the value is not found.
     */
    public int find(int val) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.val == val) {
                return i; // Return the index if the value is found
            }
            temp = temp.next;
        }
        return -1; // Value not found
    }

   public void reverse() {
    Node prev;
    Node next;
    Node current;
   }

    public boolean isEmpty() {
        return size == 0;
    }

    
}