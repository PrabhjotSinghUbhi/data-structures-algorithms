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
    private int size;

    public void insertAtFirst(int val) {

        Node node = new Node(val);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.prev = null;
        node.next = head;

        head.prev = node;

        head = node;
        size++;

    }

    public void display() {
        Node temp = head;

        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("tail");

        // Node temp2 = tail;
        // System.out.println("Printing in reverse.");

        // System.out.print("Head -> ");
        // while (temp2 != null) {
        // System.out.print(temp2.val + " -> ");
        // temp2 = temp2.prev;
        // }
        // System.out.println("Tail");

    }

    public void insertAtLast(int val) {
        Node node = new Node(val);

        if (head == null) {
            insertAtFirst(val);
            return;
        }

        tail.next = node;

        node.prev = tail;
        node.next = null;

        tail = node;
        size++;

    }

    public void insertAt(int val, int pos) {
        if (pos < 0 || pos > size) {

        } else if (pos == 0) {
            insertAtFirst(val);
        } else if (pos == size) {
            insertAtLast(val);
        } else {
            Node node = new Node(val);

            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;

            node.prev = temp;

            temp = temp.next.next;
            temp.prev = node;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int val = head.val;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return val;
    }

    public int deleteLast() {
        if (tail == null) {
            throw new IllegalStateException("List is empty");
        }

        int val = tail.val;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return val;
    }

    public int deleteAt(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (pos == 0) {
            return deleteFirst();
        } else if (pos == size - 1) {
            return deleteLast();
        } else {
            Node temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }

            int val = temp.val;

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            size--;
            return val;
        }
    }

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

    public int getSize() {
        return size;
    }

}
