package com.prabhjot.dsa.data_structures.queues.CircularQueue;

public class CircularQueue {

    protected final static int DEFAULT_SIZE = 10;
    protected int end;
    protected int front;
    protected int size;
    private int[] data;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.end = 0;
        this.front = 0;
        this.size = 0;
        this.data = new int[size];
    }

    public boolean enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return false;
        }

        data[end] = val;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }

        int toRemove = data[front];
        front = (front + 1) % data.length;
        size--;

        return toRemove;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.print("front -  end");
            return;
        }

        System.out.print("front - ");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            System.out.print(data[idx] + " ");
        }
        System.out.print(" end");
    }

}
