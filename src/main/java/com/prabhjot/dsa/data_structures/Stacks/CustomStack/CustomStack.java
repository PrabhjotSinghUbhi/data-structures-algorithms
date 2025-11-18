package com.prabhjot.dsa.data_structures.Stacks.CustomStack;

import java.util.EmptyStackException;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    protected int index;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
        this.index = -1;
    }

    public CustomStack(int size) {
        this.data = new int[size];
        this.index = -1;
    }

    /**
     * Pushes the element into the stack.
     *
     * @param val The value you want to put into the stack.
     *            {@code Algorithm}
     *            <p>1.Check if the stack is not full.</p>
     *            <p>2.If YES throw a StackOverflow Exception.</p>
     *            <p>3.According to size add the element into the array.</p>
     * @return True or False based on whether the value has been pushed successfully into the stack.
     * @throws StackOverflowError Throw stackOverFlowError if you try to push into a full stack.
     */
    public boolean push(int val) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        data[++index] = val;
        return true;
    }

    /**
     * Returns whether the stack is full or not.
     *
     * @return True or False based on whether the stack is full or not.
     */
    protected boolean isFull() {
        return index == data.length - 1;
    }

    /**
     * <p>Removes and returns and top element in the stack.</p>
     * <p><b>Algorithm</b></p>
     * <p>1.Check for Empty Stack.</p>
     * <p>2.Reduce the index by one.</p>
     *
     * @return value that has been removed.
     */
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[index--];
    }

    /**
     * Returns whether the stack is empty or not.
     *
     * @return True or False based on whether the stack is empty or not.
     */
    private boolean isEmpty() {
        return index == -1;
    }

    /**
     * Returns the top element of the stack.
     *
     * @return Returns the top element of the stack.
     */
    public int peek() {
        if (index == -1) {
            throw new EmptyStackException();
        }
        return data[index];
    }

}
