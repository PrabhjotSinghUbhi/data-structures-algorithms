package com.prabhjot.dsa.algorithms.searching.linear_search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LinearSearchTest {
    @Test
    void testLinearSearchElementFound() {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int result = linearSearch.linearSearch(arr, target);
        assertEquals(2, result); // 3 is at index 2
    }

    @Test
    void testLinearSearchElementNotFound() {
        LinearSearch lSearch = new LinearSearch();
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 6;
        int result = lSearch.linearSearch(arr, target);
        assertEquals(-1, result);
    }

    @Test
    void testLinearSearchEmptyArray() {
        LinearSearch lSearch = new LinearSearch();
        int[] arr = new int[5];
        int target = 5;
        int result = lSearch.linearSearch(arr, target);
        assertEquals(-1, result);
    }
}
