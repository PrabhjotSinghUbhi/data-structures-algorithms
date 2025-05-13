package com.prabhjot.dsa.algorithms.sorting.cycle_sort.leetcode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(Arrays.toString(findDuplicates(arr).toArray()));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {

                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    list.add(nums[i]);
                    i++;
                }
            } else {
                i++;
            }
        }
        return list;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
