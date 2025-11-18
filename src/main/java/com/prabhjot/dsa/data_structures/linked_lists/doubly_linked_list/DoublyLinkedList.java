// language: java
package com.prabhjot.dsa.data_structures.linked_lists.doubly_linked_list;

/**
 * A simple doubly linked list of integers.
 *
 * <p>This class implements common operations on a doubly linked list:
 * insert at beginning, insert at end, insert at position,
 * delete from beginning, delete from end, delete at position,
 * search, and display.</p>
 *
 * <p>Internally each element is stored in a {@code Node} which contains
 * a value and references to the next and previous nodes.</p>
 */
public class DoublyLinkedList {

    private Node head; // first node in the list
    private Node tail; // last node in the list
    private int size;  // number of elements in the list

    /**
     * Insert a new value at the beginning of the list.
     * <p>
     * Steps (simple words):
     * - Create a new node for the value.
     * - If the list is empty, set both head and tail to the new node.
     * - Otherwise, link the new node before the current head and update head.
     *
     * @param val the value to insert at the beginning
     */
    public void insertAtFirst(int val) {
        Node node = new Node(val);

        // If list is empty, new node is both head and tail
        if (head == null) {
            head = tail = node;
            size++; // increment size for this insertion
            return;
        }

        // Link new node to the current head
        node.prev = null;
        node.next = head;

        // Current head should point back to the new node
        head.prev = node;

        // Update head reference to new node
        head = node;
        size++;
    }

    /**
     * Print the list from head to tail to standard output.
     *
     * <p>Example output: "head -> 3 -> 5 -> 7 -> tail"</p>
     * <p>
     * This method does not modify the list; it only traverses it.
     */
    public void display() {
        Node temp = head;

        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("tail");
    }

    /**
     * Insert a new value at the end of the list.
     * <p>
     * Steps:
     * - If the list is empty, reuse insertAtFirst.
     * - Otherwise, link the new node after the current tail and update tail.
     *
     * @param val the value to insert at the end
     */
    public void insertAtLast(int val) {
        // If list empty, insert at first handles head/tail/size
        if (head == null) {
            insertAtFirst(val);
            return;
        }

        Node node = new Node(val);

        // Link the new node after current tail
        tail.next = node;
        node.prev = tail;
        node.next = null;

        // Update tail reference
        tail = node;
        size++;
    }

    /**
     * Insert a new value at the specified position.
     * <p>
     * Positions are zero-based:
     * - pos == 0 inserts at the beginning
     * - pos == size inserts at the end
     * - valid positions are 0..size inclusive
     * <p>
     * Steps (simple):
     * - Validate position.
     * - If inserting at ends, delegate to existing methods.
     * - Otherwise, find node at pos-1 and insert new node between pos-1 and pos.
     *
     * @param val the value to insert
     * @param pos the zero-based position at which to insert (0..size)
     * @throws IndexOutOfBoundsException if pos is negative or greater than size
     */
    public void insertAt(int val, int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        } else if (pos == 0) {
            insertAtFirst(val);
        } else if (pos == size) {
            insertAtLast(val);
        } else {
            Node node = new Node(val);

            // Find the node after which we will insert (pos - 1)
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            // temp is node at pos-1, nextNode is current node at pos
            Node nextNode = temp.next;

            // Link new node between temp and nextNode
            node.next = nextNode;
            node.prev = temp;

            temp.next = node;
            if (nextNode != null) {
                nextNode.prev = node;
            }

            size++;
        }
    }

    /**
     * Remove and return the first value from the list.
     * <p>
     * Steps:
     * - If list is empty, throw.
     * - Save value to return.
     * - If only one element, clear head and tail.
     * - Otherwise, move head to next and unlink previous pointer.
     *
     * @return the removed value
     * @throws IllegalStateException if the list is empty
     */
    public int deleteFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int val = head.val;

        // If single element, clear list
        if (head == tail) {
            head = tail = null;
        } else {
            // Move head forward and remove back reference
            head = head.next;
            head.prev = null;
        }

        size--;
        return val;
    }

    /**
     * Remove and return the last value from the list.
     * <p>
     * Steps:
     * - If list is empty, throw.
     * - Save value to return.
     * - If single element, clear head and tail.
     * - Otherwise, move tail back and unlink next pointer.
     *
     * @return the removed value
     * @throws IllegalStateException if the list is empty
     */
    public int deleteLast() {
        if (tail == null) {
            throw new IllegalStateException("List is empty");
        }

        int val = tail.val;

        // If single element, clear list
        if (head == tail) {
            head = tail = null;
        } else {
            // Move tail backward and remove forward reference
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return val;
    }

    /**
     * Remove and return the value at the specified position.
     * <p>
     * Steps:
     * - Validate position.
     * - If removing first or last, delegate.
     * - Otherwise, find node at position and unlink it from its neighbors.
     *
     * @param pos the zero-based position to remove (0..size-1)
     * @return the removed value
     * @throws IndexOutOfBoundsException if pos is out of range
     */
    public int deleteAt(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (pos == 0) {
            return deleteFirst();
        } else if (pos == size - 1) {
            return deleteLast();
        } else {
            // Find node to remove
            Node temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }

            int val = temp.val;

            // Remove temp by linking its neighbors together
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            size--;
            return val;
        }
    }

    /**
     * Check if the list contains the given value.
     * <p>
     * Steps:
     * - Traverse from head to tail comparing values.
     * - Return true immediately when found, otherwise false after traversal.
     *
     * @param val the value to search for
     * @return true if the value exists in the list, false otherwise
     */
    public boolean find(int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    /**
     * Get the number of elements currently in the list.
     *
     * @return the list size
     */
    public int getSize() {
        return size;
    }

    /**
     * Prints the list in reverse order
     * Steps:- starts from tail and moves backward.
     * Does not reverse the linked list internally.
     */
    public void printReverse() {
        Node temp = tail;
        System.out.print("tail -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.print(" head");
    }

    /**
     * Node represents a single element inside the doubly linked list.
     * It stores an integer value and pointers to the next and previous nodes.
     */
    private class Node {
        private int val;
        private Node next;
        private Node prev;

        /**
         * Construct a node with the given value.
         *
         * @param val the integer value to store in the node
         */
        public Node(int val) {
            this.val = val;
        }
    }


}