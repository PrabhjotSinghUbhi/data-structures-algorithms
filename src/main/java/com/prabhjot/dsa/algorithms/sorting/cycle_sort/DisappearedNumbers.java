package com.prabhjot.dsa.algorithms.sorting.cycle_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  

/*
 * leetcode 448
 * disappeared numbers
 */


public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 1 };

        System.out.println(Arrays.toString(missingElements(arr).toArray()));

    }

    static List<Integer> missingElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
