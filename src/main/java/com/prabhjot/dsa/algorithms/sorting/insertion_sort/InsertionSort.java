package com.prabhjot.dsa.algorithms.sorting.insertion_sort;

/**
 * The InsertionSort class demonstrates the Insertion Sort algorithm.
 * Insertion Sort is a simple sorting algorithm that builds the final sorted array
 * one item at a time. It is much like the way you might sort playing cards in your hands.
 * 
 * Fun Fact: It's called "Insertion Sort" because elements are inserted into their correct
 * position in the sorted portion of the array!
 */
public class InsertionSort {

    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array.
     * 
     * How it works:
     * - We iterate through the array starting from the second element.
     * - For each element, we compare it with the elements in the sorted portion of the array.
     * - We shift the larger elements one position to the right to make space for the current element.
     * - Finally, we insert the current element into its correct position.
     * 
     * Note: This algorithm has a time complexity of O(n^2) in the worst case,
     * but it performs well for small or nearly sorted datasets.
     */
    public int[] sort(int[] arr) {
        // Outer loop: Iterate through each element starting from the second one
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1; // Start comparing with the previous element

            // Inner loop: Find the correct position for the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }
            // Insert the key into its correct position only once
            if (j + 1 != i) {
                arr[j + 1] = key;
            }
        }
        return arr; // Return the sorted array
    }
}
