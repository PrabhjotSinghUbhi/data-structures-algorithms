package com.prabhjot.classes.queue.queue_implementation_using_linked_list;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue after enqueues: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Queue after dequeue: " + q);
        System.out.println("Size: " + q.size());
        System.out.println("Is empty: " + q.isEmpty());

    }
}
