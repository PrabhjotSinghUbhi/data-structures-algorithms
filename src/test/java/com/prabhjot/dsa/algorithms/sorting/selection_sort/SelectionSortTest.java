package com.prabhjot.dsa.algorithms.sorting.selection_sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
    @Test
    void testSelectionSort() {
        SelectionSort ss = new SelectionSort();
        int[] arr = { 4, 6, 4, 9, 2 };
        assertArrayEquals(new int[] { 2, 4, 4, 6, 9 }, ss.sort(arr));
    }

    @Test
    void testEmptyArray() {
        SelectionSort ss = new SelectionSort();
        int[] arr = {};
        assertArrayEquals(new int[] {}, ss.sort(arr)); // Test empty array
    }

    @Test
    void testSingleElementArray() {
        SelectionSort ss = new SelectionSort();
        int[] arr = { 5 };
        assertArrayEquals(new int[] { 5 }, ss.sort(arr)); // Test single element array
    }

    @Test
    void testAlreadySortedArray() {
        SelectionSort ss = new SelectionSort();
        int[] arr = { 1, 2, 3, 4, 5 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, ss.sort(arr)); // Test already sorted array
    }

    @Test
    void testReverseSortedArray() {
        SelectionSort ss = new SelectionSort();
        int[] arr = { 5, 4, 3, 2, 1 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, ss.sort(arr)); // Test reverse sorted array
    }

    @Test
    void testArrayWithDuplicates() {
        SelectionSort ss = new SelectionSort();
        int[] arr = { 3, 3, 2, 1, 2 };
        assertArrayEquals(new int[] { 1, 2, 2, 3, 3 }, ss.sort(arr)); // Test array with duplicates
    }

    @Test
    void testArrayWithNegativeNumbers() {
        SelectionSort ss = new SelectionSort();
        int[] arr = { -3, -1, -2, 0, 2 };
        assertArrayEquals(new int[] { -3, -2, -1, 0, 2 }, ss.sort(arr)); // Test array with negative numbers
    }
}
