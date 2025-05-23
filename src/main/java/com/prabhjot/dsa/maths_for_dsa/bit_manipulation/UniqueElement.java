package com.prabhjot.dsa.maths_for_dsa.bit_manipulation;

/**
 * This class demonstrates how to find the unique element in an array
 * where every other element appears exactly twice, using bitwise XOR.
 */
public class UniqueElement {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4 }; // Example array
        // Print the unique element
        System.out.println("Unique: " + findUnique(arr));
    }

    /**
     * Finds the unique element using XOR.
     * @param arr the input array
     * @return the unique element
     */
    private static int findUnique(int[] arr) {
        int unique = 0;
        // XOR all elements; duplicates cancel out, leaving the unique one
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        return unique;
    }
}
