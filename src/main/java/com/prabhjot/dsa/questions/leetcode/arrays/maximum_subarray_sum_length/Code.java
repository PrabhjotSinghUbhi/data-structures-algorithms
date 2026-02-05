package com.prabhjot.dsa.questions.leetcode.arrays.maximum_subarray_sum_length;

public class Code {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubArrayLength(arr);
        System.out.println("\n" + ans);
    }

    /**
     * Optimized Approach (Kadane’s Algorithm)
     * <pre>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * <pre>
     * Description:
     * - Traverses the array once while maintaining a running subarray sum.
     * - Tracks the starting index of the current subarray.
     * - Resets the running sum to zero when it becomes negative, since a negative
     * prefix cannot contribute to a maximum-sum subarray.
     * - Whenever the current sum exceeds the previously recorded maximum sum,
     * updates the boundaries (start and end indices) of the best subarray.
     * - The length of the maximum-sum subarray is derived from the stored indices
     * using the formula: (bestEnd - bestStart + 1).
     * <pre>
     * Key Observations:
     * - The algorithm does not enumerate all subarrays.
     * - Length is not incremented directly; it is computed from indices.
     * - Index tracking is essential to correctly determine the subarray length.
     */
    private static int maxSubArrayLength(int[] arr) {
        int currS = 0;
        int bestS = 0;
        int bestE = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                bestS = currS;
                bestE = i;
            }

            if (sum < 0) {
                sum = 0;
                currS = i + 1;
            }

        }
        for (int i = bestS; i <= bestE; i++) {
            System.out.print(arr[i] + " ");
        }
        return bestE - bestS + 1;
    }
}
