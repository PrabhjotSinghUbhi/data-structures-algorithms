package com.prabh.dsa.SearchingAlgorithms.BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 0, 5, 4, 3, 2, 1 };
        int target = 7;

        int[] newArr = sort(arr);
        System.out.println(Arrays.toString(newArr));

        System.out.println(binarySearch(newArr, target));
    }

    private static int[] sort(int[] arr) {
        // sorting using insertion sort.

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
