package com.prabhjot.dsa.data_structures.linked_lists.singly_linked_list;

public class LinkedList {
    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

    Node head;
    Node tail;

    int size;

    public void insertAtFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void display() {
        Node temp = head;

        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("tail");
    }

    public void insertAtLast(int val) {

        if (tail == null) {
            insertAtFirst(val);
        } else {

            Node node = new Node(val);

            tail.next = node;
            tail = node;

            size += 1;
        }
    }

    public void insertAt(int pos, int val) {

        if (pos == 0) {
            insertAtFirst(val);
            return;
        }

        if (pos == size) {
            insertAtLast(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size += 1;
    }

    public int deleteAtFirst() {
        int value = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;

    }

    Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void deleteAtLast() {

        if (size <= 1) {
            deleteAtFirst();
            return;
        }

        Node node = getNode(size - 2);
        tail = node;
        tail.next = null;

        size--;
    }

    public void deleteAt(int index) {

        if (index == 0) {
            deleteAtFirst();
            return;
        }
        if (index == size - 1) {
            deleteAtLast();
            return;
        }

        Node node = getNode(index - 1);
        node.next = node.next.next;

        size--;
    }

    public void size() {
        System.out.println("size: " + size);
    }
}