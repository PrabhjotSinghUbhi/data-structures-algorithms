package com.prabhjot.dsa.maths_for_dsa.bitwise_operators;

public class NoOfDigits {
    public static void main(String[] args) {
        // Your code here
        int num = 64;
        int digits = (int) (Math.log(num) / Math.log(2)) + 1;
        System.out.println(digits);
    }
}