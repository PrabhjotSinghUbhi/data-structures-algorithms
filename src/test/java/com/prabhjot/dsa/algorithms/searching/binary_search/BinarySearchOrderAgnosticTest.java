package com.prabhjot.dsa.algorithms.searching.binary_search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.prabhjot.dsa.algorithms.searching.binary_search.concept.BinarySearchOrderAgnostic;
import org.junit.jupiter.api.Test;

class BinarySearchOrderAgnosticTest {
    @Test
    void testBinarySearchOrderAgnosticElementFoundAscending() {
        BinarySearchOrderAgnostic bOSearch = new BinarySearchOrderAgnostic();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int target = 4;

        assertEquals(3, bOSearch.binarySearch(arr, target));
    }

    @Test
    void testBinarySearchOrderAgnosticElementFoundDescending() {
        BinarySearchOrderAgnostic bOSearch = new BinarySearchOrderAgnostic();
        int[] arr = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 4;

        assertEquals(8, bOSearch.binarySearch(arr, target));
    }

    @Test
    void testBinarySearchOrderAgnosticElementNotFound() {
        BinarySearchOrderAgnostic bOSearch = new BinarySearchOrderAgnostic();
        int[] arr = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = -8;

        assertEquals(-1, bOSearch.binarySearch(arr, target));
    }
}
