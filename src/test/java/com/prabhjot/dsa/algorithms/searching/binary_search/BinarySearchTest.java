package com.prabhjot.dsa.algorithms.searching.binary_search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    @Test
    void testBinarySearchElementFound() {
        BinarySearch bSearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;
        int result = bSearch.binarySearch(arr, target);
        assertEquals(7, result);
    }

    @Test
    void testBinarySearchElementNotFound() {
        BinarySearch bSearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = -4;
        int result = bSearch.binarySearch(arr, target);
        assertEquals(-1, result);
    }
}
