package com.prabhjot.dsa.algorithms.sorting.bubble_sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    @Test
    void bubbleSortTest() {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 4, 6, 4, 9, 2 };
        assertArrayEquals(new int[] { 2, 4, 4, 6, 9 }, bs.sort(arr));
    }

    @Test
    void testEmptyArray() {
        BubbleSort bs = new BubbleSort();
        int[] arr = {};
        assertArrayEquals(new int[] {}, bs.sort(arr)); // Test empty array
    }

    @Test
    void testSingleElementArray() {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 5 };
        assertArrayEquals(new int[] { 5 }, bs.sort(arr)); // Test single element array
    }

    @Test
    void testAlreadySortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 1, 2, 3, 4, 5 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, bs.sort(arr)); // Test already sorted array
    }

    @Test
    void testReverseSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 5, 4, 3, 2, 1 };
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, bs.sort(arr)); // Test reverse sorted array
    }

    @Test
    void testArrayWithDuplicates() {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 3, 3, 2, 1, 2 };
        assertArrayEquals(new int[] { 1, 2, 2, 3, 3 }, bs.sort(arr)); // Test array with duplicates
    }

    @Test
    void testArrayWithNegativeNumbers() {
        BubbleSort bs = new BubbleSort();
        int[] arr = { -3, -1, -2, 0, 2 };
        assertArrayEquals(new int[] { -3, -2, -1, 0, 2 }, bs.sort(arr)); // Test array with negative numbers
    }
}
