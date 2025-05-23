package com.prabhjot.dsa.maths_for_dsa.bit_manipulation;

/**
 * Amazon Interview Question:
 * Find the nth magic number, where a magic number is defined as the sum of unique powers of 5.
 * For example, the 3rd magic number is 30 (5 + 25).
 */
public class MagicNumber {

    public static void main(String[] args) {
        int n = 9; // Example input
        int result = findMagicNumber(n);
        System.out.println(result);

        String alpha = "Prabhjot Singh";
        System.out.println(alpha.length());
    }

    /**
     * Finds the nth magic number using bitwise operations.
     * @param n the position of the magic number
     * @return the nth magic number, or -1 if n is 0
     */
    private static int findMagicNumber(int n) {
        if (n == 0) {
            return -1;
        }

        int magicNumber = 0;
        int power = 5;
        // For each bit in n, add the corresponding power of 5 if the bit is set
        while (n > 0) {
            if ((n & 1) != 0) {
                magicNumber += power;
            }
            n = n >> 1;
            power *= 5;
        }

        return magicNumber;
    }
}
