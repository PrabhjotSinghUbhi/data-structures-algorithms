package com.prabhjot.dsa.questions.leetcode.arrays.two_sum;

import java.util.Arrays;

import static com.prabhjot.dsa.questions.leetcode.arrays.two_sum.BruteForce.twoSum1;
import static com.prabhjot.dsa.questions.leetcode.arrays.two_sum.Optimal.twoSum2;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }
}
