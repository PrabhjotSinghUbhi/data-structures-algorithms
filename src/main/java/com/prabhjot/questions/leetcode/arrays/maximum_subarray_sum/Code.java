package com.prabhjot.questions.leetcode.arrays.maximum_subarray_sum;

/**
 * Leetcode
 * - 53. Maximum Subarray
 * - Given an integer array nums, find the subarray with the largest sum, and return its sum.
 */
public class Code {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubArrayBruteForce(arr);
        System.out.println(ans);
    }

    /**
     * - Optimal Approach (Kadane's Algorithm)
     * - Time Complexity
     * - O(n)
     * - Space Complexity
     * - O(1)
     * <pre>
     *  - Description
     * - continue to increase the add the elements(continuously) to the a variable sum.
     * - if after adding a element to the sum, the sum becomes -ve:
     * - discard the sum and reinitialize it to 0
     * - continue to add the elements
     * - REM:: the element at which the value of sum became 0:
     * - that is the start of the new array.
     * - the end is i (pointer)
     * </pre>
     */
    public static int maxSubArrayOptimal(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int len = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            len++;
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
                len = 0;
            }
        }
        System.out.println("Length is of maximum subarray is :: " + len);
        return maxSum;
    }

    /**
     * Brute Force Approach
     * - Time Complexity
     * - O(n^2)
     * - Space Complexity
     * - O(1)
     * <pre>
     * - Description
     * - checks for each subarray possible in the array.
     * - if sum exceeds the maxSum, maxSum is replaced with the updated value.
     */
    public static int maxSubArrayBruteForce(int[] arr) {

        // maxSum contains the minus infinity.
        int maxSum = Integer.MIN_VALUE;

        // loop for each element of the array.
        for (int i = 0; i < arr.length; i++) {

            // sum from arr[i] to element at n-1.
            // reinitialize the value of sum to zero for the next computation.
            int sum = 0;

            // logic for each element of i
            for (int j = i; j < arr.length; j++) {

                // adding the element arr[j] to the sum.
                sum += arr[j];

                // compare the update the maxSum.
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

}