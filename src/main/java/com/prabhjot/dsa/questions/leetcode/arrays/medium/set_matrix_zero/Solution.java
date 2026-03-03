package com.prabhjot.dsa.questions.leetcode.arrays.medium.set_matrix_zero;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        convertRowColZero(matrix, list);

    }

    private static void convertRowColZero(int[][] matrix, ArrayList<int[]> list) {
        int left = 0;
        int top = 0;
        int right = matrix.length - 1;
        int bottom = matrix.length - 1;
        for (int i = 0; i < list.size(); i++) {

        }
    }
}
