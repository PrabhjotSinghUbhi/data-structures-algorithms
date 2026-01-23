package com.prabhjot.classes.stack.stack_implementation_using_linked_list;

import java.util.EmptyStackException;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

public class StackDemo {
    Node head;
    int size;

    StackDemo() {
        this.head = null;
        this.size = 0;
    }

    public void push(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public int pop() {
        if (head == null) {
            throw new EmptyStackException();
        } else {
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
    }

    public int peek() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return head.val;
    }

    public void display() {
        if (head == null) {
            System.out.println("Stack is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }

}
