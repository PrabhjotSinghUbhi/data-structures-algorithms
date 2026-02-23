package com.prabhjot.dsa.algorithms.searching.binary_search.concept;

public class BinarySearchIn2DSortedByRowAndColumn {

    /**
     * 
     * @param matrix the matrix to search in.
     * @param target the target to search for.
     * @return the indices of the target found, if not found return array of -1,-1
     * 
     *         Work if the matrix is sorted by row and sorted by column.
     */
    public int[] search(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
            return new int[] { -1, -1 };
        }

        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }
}