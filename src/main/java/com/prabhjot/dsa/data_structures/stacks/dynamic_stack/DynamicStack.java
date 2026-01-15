package com.prabhjot.dsa.data_structures.stacks.dynamic_stack;

import com.prabhjot.dsa.data_structures.stacks.custom_stack.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
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
     */
    @Override
    public boolean push(int val) {
        if (isFull()) {
            int[] data2 = new int[this.data.length * 2];
            System.arraycopy(data, 0, data2, 0, this.data.length);
            this.data = data2;
        }
        data[++index] = val;
        return true;
    }

}
