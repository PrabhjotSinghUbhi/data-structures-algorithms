package com.prabhjot.dsa.algorithms.searching.binary_search;

public class BinarySearchOrderAgnostic {
    public int binarySearch(int[] arr, int target) {

        // Check if the array is empty
        if (arr.length == 0) {
            return -1; // Return -1 if the array is empty
        }

        int start = 0; // Initialize the start pointer
        int end = arr.length - 1; // Initialize the end pointer

        // Determine if the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        // Loop until the search space is exhausted
        while (start <= end) {

            // Calculate the middle index to avoid overflow
            int mid = start + (end - start) / 2;

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            }

            // Handle the case for ascending order arrays
            if (isAscending) {
                if (arr[mid] > target) {
                    // If the target is smaller than the middle element, search the left half
                    end = mid - 1;
                } else {
                    // If the target is larger, search the right half
                    start = mid + 1;
                }
            } else {
                // Handle the case for descending order arrays
                if (arr[mid] > target) {
                    // If the target is smaller, search the right half
                    start = mid + 1;
                } else {
                    // If the target is larger, search the left half
                    end = mid - 1;
                }
            }
        }

        // Return -1 if the target is not found in the array
        return -1;
    }
}
