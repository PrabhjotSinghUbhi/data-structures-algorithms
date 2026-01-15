package com.prabhjot.dsa.algorithms.sorting.bubble_sort;

/**
 * The BubbleSort class demonstrates the Bubble Sort algorithm.
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order.
 * 
 * Fun Fact: It's called "Bubble Sort" because the smaller elements "bubble" to the top
 * (or end) of the array, just like bubbles in water!
 */
public class BubbleSort {

    /**
     * Sorts an array of integers using an optimized Bubble Sort algorithm.
     * 
     * Optimization:
     * - A flag is used to check if any swaps were made during a pass.
     * - If no swaps are made, the array is already sorted, and we can exit early.
     */
    public int[] sort(int[] arr) {
        // Outer loop: Controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // Flag to track if any swaps were made
            // Inner loop: Compares adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // If the current element is greater than the next one, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap was made
                }
            }
            // If no swaps were made, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr; // Return the sorted array
    }
}
