package com.prabhjot.questions.leetcode.matrix.rotate_image;

/**
 * leetcode 48
 * Rotate-image
 */
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        display(matrix);
    }

    private static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }

    private static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(STR."\{matrix[i][j]} ");
            }
            System.out.println();
        }
    }

    private static void reverseRows(int[][] matrix) {
        // reverse the all the rows of the matrix.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; 2 * j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }

    private static void transpose(int[][] matrix) {
        //transpose of matrix.
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i; j < matrix.length; j++) {
                // swap the values of one row the col will automatically be sorted.
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
