package com.prabhjot.dsa.data_structures.queues.CustomQueue;

public class CustomQueue {
    protected final static int DEFAULT_SIZE = 10;
    protected int end;
    private int[] data;

    public CustomQueue() {
        this.end = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
        this.end = -1;
        this.data = new int[size];
    }

    public boolean enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return false;
        }

        data[++end] = val;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!");
            return -1;
        }

        int toRemove = data[0];

        int[] temp = new int[data.length];
        System.arraycopy(data, 1, temp, 0, data.length - 1);

        data = temp;
        end--;
        return toRemove;
    }

    private boolean isEmpty() {
        return end == -1;
    }

    private boolean isFull() {
        return end == this.data.length - 1;
    }

    private int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() {
        System.out.print("front - ");
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print(" end");
    }

}
