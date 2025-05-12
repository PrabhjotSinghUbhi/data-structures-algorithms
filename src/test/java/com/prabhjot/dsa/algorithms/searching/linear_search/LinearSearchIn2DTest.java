package com.prabhjot.dsa.algorithms.searching.linear_search;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class LinearSearchIn2DTest {
    @Test
    void testLinearSearch2DElementFound() {
        LinearSearchIn2D lSearchIn2D = new LinearSearchIn2D();
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 9;
        assertArrayEquals(new int[] { 2, 2 }, lSearchIn2D.search(arr, target));
    }

    @Test
    void testLinearSearch2DElementNotFound() {
        LinearSearchIn2D lSearchIn2D = new LinearSearchIn2D();
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = -5;
        assertArrayEquals(new int[] { -1, -1 }, lSearchIn2D.search(arr, target));
    }
    
    @Test
    void testLinearSearch2DElementNull() {
        LinearSearchIn2D lSearchIn2D = new LinearSearchIn2D();
        int[][] arr = null;
        int target = -5;
        assertArrayEquals(new int[] { -1, -1 }, lSearchIn2D.search(arr, target));
    }
}
