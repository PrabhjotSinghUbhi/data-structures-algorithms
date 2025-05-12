package com.prabhjot.dsa.algorithms.sorting.selection_sort;

/**
 * The SelectionSort class demonstrates the Selection Sort algorithm.
 * Selection Sort is a simple sorting algorithm that divides the array into two
 * parts:
 * the sorted part and the unsorted part. It repeatedly selects the smallest
 * element
 * from the unsorted part and moves it to the sorted part.
 * 
 * Fun Fact: It's like picking the smallest card from a deck repeatedly until
 * the deck is sorted!
 */
public class SelectionSort {

    /**
     * Sorts an array of integers using the Selection Sort algorithm.
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array.
     * 
     *         How it works:
     *         - We iterate through the array.
     *         - For each position, we find the smallest element in the unsorted
     *         part of the array.
     *         - We swap this smallest element with the first element of the
     *         unsorted part.
     *         - This process continues until the entire array is sorted.
     * 
     *         Note: This algorithm has a time complexity of O(n^2) in the worst
     *         case,
     *         so it's not the most efficient for large datasets. However, it's easy
     *         to understand and implement!
     */
    public int[] sort(int[] arr) {
        // Outer loop: Iterate through each position in the array
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Assume the current position has the smallest element
            // Inner loop: Find the smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // Update the index of the smallest element
                }
            }
            // Swap only if the smallest element is not already in the correct position
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr; // Return the sorted array
    }
}
