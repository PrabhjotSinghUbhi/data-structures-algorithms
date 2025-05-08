package com.prabhjot.dsa.algorithms.searching.binary_search;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Loop until the search space is exhausted
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid; // Return the index if the element is found
            }

            // Adjust the search space based on the comparison
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1; // Return -1 if the element is not found
    }
}
