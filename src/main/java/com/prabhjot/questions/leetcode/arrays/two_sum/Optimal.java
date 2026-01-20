package com.prabhjot.questions.leetcode.arrays.two_sum;

import java.util.HashMap;

/**
 * Leetcode 1.
 */
public class Optimal {

    /**
     * TIme Complexity - O(n^2)
     *
     * @param nums   - input array
     * @param target - target to find
     * @return - the indexes of the 2 elements that add up to the target.
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i]) && i != mp.get(target - nums[i])) {
                return new int[]{mp.get(target - nums[i]), i};
            } else {
                mp.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
