package com.prabhjot.dsa.algorithms.sorting.insertion_sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    void testSortWithUnsortedArray() {
        InsertionSort sorter = new InsertionSort();
        int[] input = { 5, 3, 8, 6, 2 };
        int[] expected = { 2, 3, 5, 6, 8 };
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    void testSortWithAlreadySortedArray() {
        InsertionSort sorter = new InsertionSort();
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    void testSortWithReverseSortedArray() {
        InsertionSort sorter = new InsertionSort();
        int[] input = { 9, 7, 5, 3, 1 };
        int[] expected = { 1, 3, 5, 7, 9 };
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    void testSortWithSingleElementArray() {
        InsertionSort sorter = new InsertionSort();
        int[] input = { 42 };
        int[] expected = { 42 };
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    void testSortWithEmptyArray() {
        InsertionSort sorter = new InsertionSort();
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, sorter.sort(input));
    }

    @Test
    void testSortWithDuplicateElements() {
        InsertionSort sorter = new InsertionSort();
        int[] input = { 4, 2, 4, 3, 2 };
        int[] expected = { 2, 2, 3, 4, 4 };
        assertArrayEquals(expected, sorter.sort(input));
    }
}
