package com.prabhjot.dsa.questions.leetcode.arrays.medium.next_permutaion;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermutation(int[] nums) {
        boolean t = false;
        int br = -1;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                br = i - 1;
                t = true;
                break;
            }
        }

        if (!t) {
            Arrays.sort(nums);
        } else {
            System.out.println("break index: " + br);
            int tem = -1;
            for (int i = n - 1; i > 0; i--) {
                if (nums[i] > nums[br]) {
                    tem = i;
                    break;
                }
            }

            System.out.println("MinIndex at : " + tem);
            swap(nums, tem, br);

            reverse(nums, br + 1, n - 1);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
