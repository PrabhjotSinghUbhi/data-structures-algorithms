package com.prabhjot.questions.leetcode.arrays.two_sum;

/**
 * Leetcode 1.
 */
public class BruteForce {

    /**
     * TIme Complexity - O(n^2)
     *
     * @param nums   - input array
     * @param target - target to find
     * @return - the indexes of the 2 elements that add up to the target.
     */
    static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //improvement instead of j = 0, start from j = i + 1 because e.g. 2,6 and 6,2 is the same.
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j] && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
