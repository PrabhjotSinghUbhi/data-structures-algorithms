package com.prabhjot.dsa.data_structures.arrays;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        displayMatrix(generateMatrix(n));
    }

    private static int[][] generateMatrix(int n) {
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int[][] result = new int[n][n];

        int count = 0;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++)
                result[top][i] = ++count;
            top++;
            // Traverse downwards
            for (int i = top; i <= bottom; i++)
                result[i][right] = ++count;
            right--;
            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result[bottom][i] = ++count;
                bottom--;
            }
            // Traverse upwards
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result[i][left] = ++count;
                left++;
            }
        }
        return result;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            System.out.println(Arrays.toString(matrix1));
        }
    }
}
