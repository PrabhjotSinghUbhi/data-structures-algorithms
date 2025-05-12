package com.prabhjot.dsa.algorithms.searching.binary_search;

import java.util.Arrays;

/**
 * 🚀 This class demonstrates binary search in a sorted 2D matrix.
 * 🧩 The matrix is sorted row-wise and column-wise.
 */
public class BinarySearchInSorted2D {
    public static void main(String[] args) {
        // 🟦 Example 2D matrix
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // 🔍 Searching for the target value 4
        System.out.println(Arrays.toString(bSearch(arr, 4)));
    }

    /**
     * 🔎 Performs binary search on a single row of the matrix.
     *
     * @param arr    The 2D matrix.
     * @param row    The row index to search in.
     * @param cStart The starting column index.
     * @param cEnd   The ending column index.
     * @param target The target value to search for.
     * @return The position of the target as an array [row, column], or [-1, -1] if not found.
     */
    private static int[] bSearchMatrix(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            // 🧮 Calculate the middle column
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target) {
                return new int[] { row, mid }; // 🎯 Target found
            } else if (arr[row][mid] < target) {
                cStart = mid + 1; // 👉 Search in the right half
            } else {
                cEnd = mid - 1; // 👈 Search in the left half
            }
        }

        return new int[] { -1, -1 }; // ❌ Target not found
    }

    /**
     * 🔎 Performs binary search in a sorted 2D matrix.
     *
     * @param arr    The 2D matrix.
     * @param target The target value to search for.
     * @return The position of the target as an array [row, column], or [-1, -1] if not found.
     */
    private static int[] bSearch(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length; // ⚠️ Be cautious, the matrix may be empty.

        // 🟧 If the matrix has only one row, perform binary search on that row
        if (row == 1) {
            return bSearchMatrix(arr, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2; // 🧮 Middle column index

        // 🔽 Narrow down to two rows
        while (rStart < (rEnd - 1)) { // While more than two rows are remaining
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid }; // 🎯 Target found
            } else if (arr[mid][cMid] < target) {
                rStart = mid; // 🔻 Search in the lower half
            } else {
                rEnd = mid; // 🔺 Search in the upper half
            }
        }

        // 🟨 Check the middle column of the two remaining rows
        if (arr[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        // 🔍 Search in the four quadrants
        // 🟥 First quadrant
        if (target <= arr[rStart][cMid - 1]) {
            return bSearchMatrix(arr, rStart, 0, cMid - 1, target);
        }
        // 🟩 Second quadrant
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][col - 1]) {
            return bSearchMatrix(arr, rStart, cMid + 1, col - 1, target);
        }
        // 🟦 Third quadrant
        if (target <= arr[rStart + 1][cMid - 1]) {
            return bSearchMatrix(arr, rStart + 1, 0, cMid - 1, target);
        }
        // 🟪 Fourth quadrant
        return bSearchMatrix(arr, rStart + 1, cMid + 1, col - 1, target);
    }
}
