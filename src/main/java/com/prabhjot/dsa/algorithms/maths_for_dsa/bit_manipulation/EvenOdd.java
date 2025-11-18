package com.prabhjot.dsa.algorithms.maths_for_dsa.bit_manipulation;

/**
 * This class demonstrates how to check if a number is even or odd using bitwise operators.
 */
public class EvenOdd {

    public static void main(String[] args) {
        int n = 89100986; // Example number to check
        // Print "Even" if checkOddEven returns 0, otherwise print "Odd"
        System.out.println((checkOddEven(n) == 0) ? "Even" : "Odd");
    }

    /**
     * Checks if a number is odd or even using bitwise AND.
     * @param n the integer to check
     * @return 1 if odd, 0 if even
     */
    private static int checkOddEven(int n) {
        // If the least significant bit is 1, the number is odd; else even
        return (n & 1) == 1 ? 1 : 0;
    }
}
