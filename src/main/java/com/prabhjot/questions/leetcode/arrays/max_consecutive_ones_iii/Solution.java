package com.prabhjot.questions.leetcode.arrays.max_consecutive_ones_iii;

/**
 * leetcode - 1004
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestOnes(arr, k));
    }

    private static int longestOnes(int[] arr, int k) {
        int mx = 0; // max length of the window with zero replacement -> ones.
        int ones = 0; //frequency of ones in the window
        int j = 0;// j pointer
        // i pointer
        for (int i = 0; i < arr.length; i++) {
            // increasing the count of one in the window.
            if (arr[i] == 1)
                ones++;

            // encounter the case where the window is no longer valid.
            if ((i - j + 1) - ones > k) {
                // adjust the count of ones if the window is shrinking.
                if (arr[j] == 1)
                    ones--;
                j++; //move the j pointer further, shrink the window.
            }
            mx = Math.max(mx, i - j + 1); //updating the max length.
        }
        return mx; //returning the max length.
    }
}
