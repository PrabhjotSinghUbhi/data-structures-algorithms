package com.prabhjot.dsa.data_structures.queues.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);

        cq.display();
    }
}
