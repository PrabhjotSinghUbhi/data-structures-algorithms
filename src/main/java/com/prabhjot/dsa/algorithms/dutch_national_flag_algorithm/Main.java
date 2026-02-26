package com.prabhjot.dsa.algorithms.dutch_national_flag_algorithm;

import java.util.Arrays;

/**
 * DNF algorithm is developed by dijkstra is a three-way sorting algorithm
 * used to sort 0,1,2 in an array in O(n) complexity.
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,1,1,1,0,2,0,2,2,2,0,1,0,0,1,1,2,2,2,0,2,1};
        dnfSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void dnfSort(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
