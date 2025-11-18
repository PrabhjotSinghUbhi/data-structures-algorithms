package com.prabhjot.dsa.algorithms.maths_for_dsa.bit_manipulation;

public class XOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(xor(b) ^ xor(a - 1));
    }

    static int xor(int n) {
        switch (n % 4) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;

            default:
                return 0;
        }
    }
}
