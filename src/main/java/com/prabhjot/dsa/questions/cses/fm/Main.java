package com.prabhjot.dsa.questions.cses.fm;

import java.util.Arrays;

public class Main {
    // Function to check if we can make T products in time <= mid
    static boolean check(long mid, long N, long T, long[] K) {
        // Variable to count the number of products made
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (mid / K[i]);
            if (sum >= T)
                return true;
        }
        return false;
    }

    // Function to find the minimum time to make T products
    static long solve(long N, long T, long[] K) {
        // Define the range in which our answer can lie
        long low = 1, high = Arrays.stream(K).min().getAsLong() * T; // Updated high value
        long ans = 0;

        // Binary Search for the minimum time to make T products
        while (low <= high) {
            long mid = (low + high) / 2;

            // Check if we can make T products in time <= mid
            if (check(mid, N, T, K)) {
                // Update the answer and reduce search space by
                // moving high to mid - 1
                ans = mid;
                high = mid - 1;
            } else {
                // Reduce the search space by moving low to mid + 1
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Sample Input
        long N = 3, T = 7;
        long[] K = { 3, 2, 5 };

        System.out.println(solve(N, T, K));
    }
}


