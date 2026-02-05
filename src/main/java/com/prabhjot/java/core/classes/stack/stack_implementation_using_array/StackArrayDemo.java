package com.prabhjot.java.core.classes.stack.stack_implementation_using_array;

import java.util.EmptyStackException;

public class StackArrayDemo {
    final int maxCapacity = 10;
    int[] stack = new int[maxCapacity];
    int index = -1;
    int size = 0;

    public void display() {
        if (size == 0) {
            System.out.println("Empty Stack");
            return;
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void push(int val) {
        if (size >= maxCapacity) {
            throw new StackOverflowError();
        }
        stack[++index] = val;
        size++;
    }

    public int size() {
        return size;
    }

    public int pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        size--;
        return stack[index--];
    }

    public int peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return stack[index];
    }

}
