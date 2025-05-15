package com.prabhjot.dsa.recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = arr.length - 1;
        int target = 6;
        System.out.println(bSearch(arr, target, start, end));
    }

    private static int bSearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bSearch(arr, target, mid + 1, end);
        } else {
            return bSearch(arr, target, start, mid - 1);
        }
    }
}
