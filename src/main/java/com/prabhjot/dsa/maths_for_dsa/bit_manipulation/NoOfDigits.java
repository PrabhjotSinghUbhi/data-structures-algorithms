package com.prabhjot.dsa.maths_for_dsa.bit_manipulation;

public class NoOfDigits {
    public static void main(String[] args) {
        // Your code here
        int num = 6449858;
        int digits = calc(num,10);
        System.out.println(digits);
    }

    public static int calc(int number, int base){
        return (int) (Math.log(number) / Math.log(base)) + 1;
    }
}