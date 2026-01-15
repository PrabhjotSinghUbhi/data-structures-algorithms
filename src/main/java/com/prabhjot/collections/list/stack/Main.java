package com.prabhjot.collections.list.stack;

import java.util.Stack;

/*
    Stacks are based on LIFO principle.
    - Stack are implement on top of LinkedLists.
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(15);
        stack.push(59);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }
}
