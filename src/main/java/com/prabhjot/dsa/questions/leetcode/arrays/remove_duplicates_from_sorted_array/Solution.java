package com.prabhjot.dsa.questions.leetcode.arrays.remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int pos = 1;
        int cnt = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[pos++] = nums[i + 1];
                cnt++;
            }
        }
        return cnt;
    }
}
