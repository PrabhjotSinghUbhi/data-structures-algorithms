package com.prabhjot.dsa.algorithms.sorting.cycle_sort;

/*
 * Leetcode - 268
 * Missing Number
 */

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = { 0 ,1};
        System.out.println(findMissing(arr));
    }

    private static int findMissing(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i];
            if (arr[i] != arr[correct] && correct < arr.length - 1) {
                swap(arr, correct, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != j) {
                return j;
            }
        }

        return arr.length;

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

}
