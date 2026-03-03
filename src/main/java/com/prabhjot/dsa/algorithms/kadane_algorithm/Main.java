package com.prabhjot.dsa.algorithms.kadane_algorithm;


import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr) {
        int mx = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = max(arr[i], sum + arr[i]);
            mx = max(mx, sum);
        }
        return mx;
    }
}
