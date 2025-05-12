package com.prabhjot.dsa.algorithms.searching.linear_search;

public class LinearSearchIn2D {
    public int[] search(int[][] arr, int target) {

        if (arr == null || arr.length == 0) {
            return new int[] { -1, -1 };
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
