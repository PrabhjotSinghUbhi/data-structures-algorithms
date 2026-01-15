package com.prabhjot.dsa.data_structures.stacks.custom_stack;

public class Main {
    public static void main(String[] args) {
        CustomStack cs = new CustomStack(5);
        cs.push(5);
        cs.push(4);
        cs.push(3);
        cs.push(2);
        cs.push(1);

        for (int i = 0; i < 4; i++) {
            System.out.println(cs.pop());
        }

        System.out.println("Peek: " + cs.peek());

    }
}
