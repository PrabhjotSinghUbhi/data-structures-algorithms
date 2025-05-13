package com.prabhjot.dsa.algorithms.sorting.cycle_sort;

import java.util.Arrays;

/**
 * 🚴‍♂️ CycleSort Class 🚴‍♀️
 * 
 * This class demonstrates the Cycle Sort algorithm, which is an in-place sorting algorithm.
 * It places each element at its correct position in the array by cycling through the elements.
 * 
 * Fun Fact: Cycle Sort minimizes the number of writes to the array, making it efficient for scenarios
 * where minimizing memory writes is important! 🧠
 */
public class CycleSort {

    /**
     * Sorts an array of integers using the Cycle Sort algorithm. 🚀
     * 
     * @param arr The array of integers to be sorted.
     * @return The sorted array.
     * 
     * How it works:
     * - Each element is placed at its correct position in the array.
     * - If an element is not in its correct position, it is swapped with the element at its target position.
     * - This process continues until all elements are in their correct positions.
     * 
     * Note: This algorithm assumes that the array contains integers in the range [1, n], where n is the size of the array.
     */
    public int[] sort(int[] arr) {
        int i = 0;
        // Loop through the array to place each element at its correct position
        while (i < arr.length) {
            int correct = arr[i] - 1; // Calculate the correct index for the current element
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                // 🔄 Swap the current element with the element at its correct position
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                // ✅ Move to the next element if it's already in the correct position
                i++;
            }
        }
        return arr; // Return the sorted array
    }
}
