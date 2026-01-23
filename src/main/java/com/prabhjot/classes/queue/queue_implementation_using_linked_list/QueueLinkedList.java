package com.prabhjot.classes.queue.queue_implementation_using_linked_list;

import java.util.NoSuchElementException;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class QueueLinkedList {
    Node front;
    Node rear;
    private int size;

    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(int val) {
        Node node = new Node(val);
        if (rear == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public int dequeue() {
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        int value = front.val;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public int peek() {
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.val;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node curr = front;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) sb.append(", ");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }


}
