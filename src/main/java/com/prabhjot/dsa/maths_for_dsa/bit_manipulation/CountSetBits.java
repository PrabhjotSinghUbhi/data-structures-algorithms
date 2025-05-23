package com.prabhjot.dsa.maths_for_dsa.bit_manipulation;

public class CountSetBits {
    public static void main(String[] args) {
        // Your code here
        int n = 9;
        System.out.println(setBits(n));

        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(-7));
    }

    public static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n - (n & -n);
        }

        return count;
    }
}