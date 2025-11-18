package com.prabhjot.dsa.data_structures.Stacks.DynamicStack;

public class Main {
    public static void main(String[] args) {

        DynamicStack ds = new DynamicStack(5);

        for (int i = 0; i < 15; i++) {
            ds.push(i);
        }

        ds.push(90);

        for (int i = 0; i < 15; i++) {
            System.out.println(ds.pop());
        }


    }
}
