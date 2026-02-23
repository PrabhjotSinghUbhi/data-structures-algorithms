package com.prabhjot.java.core.exception_handling;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("iodvjodinfv");
            System.exit(0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
