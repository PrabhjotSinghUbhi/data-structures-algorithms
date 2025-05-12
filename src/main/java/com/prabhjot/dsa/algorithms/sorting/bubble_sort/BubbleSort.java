package com.prabhjot.dsa.algorithms.sorting.bubble_sort;

/**
 * The BubbleSort class demonstrates the Bubble Sort algorithm.
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order.
 * 
 * Fun Fact: It's called "Bubble Sort" because the smaller elements "bubble" to the top
 * (or front) of the array, just like bubbles in water!
 */
public class BubbleSort {

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array.
     * 
     * How it works:
     * - We iterate through the array multiple times.
     * - During each pass, we compare adjacent elements.
     * - If the current element is greater than the next one, we swap them.
     * - The largest unsorted element "sinks" to its correct position at the end of the array.
     * 
     * Note: This algorithm has a time complexity of O(n^2) in the worst case,
     * so it's not the most efficient for large datasets. But it's great for learning!
     */
    public int[] sort(int[] arr) {
        // Outer loop: Controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop: Compares adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // If the current element is greater than the next one, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr; // Return the sorted array
    }
}
