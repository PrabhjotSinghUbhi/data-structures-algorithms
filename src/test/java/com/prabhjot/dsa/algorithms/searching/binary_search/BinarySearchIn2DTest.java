package com.prabhjot.dsa.algorithms.searching.binary_search;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.prabhjot.dsa.algorithms.searching.binary_search.concept.BinarySearchIn2DSortedByRowAndColumn;
import org.junit.jupiter.api.Test;

class BinarySearchIn2DTest {
    @Test
    void BinarySearchIn2DElementFound() {
        BinarySearchIn2DSortedByRowAndColumn bSearchIn2D = new BinarySearchIn2DSortedByRowAndColumn();
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        assertArrayEquals(new int[] { 2, 2 }, bSearchIn2D.search(arr, 37));
        assertArrayEquals(new int[] { 3, 3 }, bSearchIn2D.search(arr, 50));
        assertArrayEquals(new int[] { 0, 1 }, bSearchIn2D.search(arr, 20));
    }

    @Test
    void BinarySearchIn2DElementNotFound() {
        BinarySearchIn2DSortedByRowAndColumn bSearchIn2D = new BinarySearchIn2DSortedByRowAndColumn();
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        assertArrayEquals(new int[] { -1, -1 }, bSearchIn2D.search(arr, -9));
        assertArrayEquals(new int[] { -1, -1 }, bSearchIn2D.search(null, 50));
        assertArrayEquals(new int[] { -1, -1 }, bSearchIn2D.search(arr, 98));
    }
}
