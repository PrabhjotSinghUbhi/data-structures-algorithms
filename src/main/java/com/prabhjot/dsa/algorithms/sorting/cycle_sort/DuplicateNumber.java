package com.prabhjot.dsa.algorithms.sorting.cycle_sort;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        
        System.out.println(findDuplicate((arr)));
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }

            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
