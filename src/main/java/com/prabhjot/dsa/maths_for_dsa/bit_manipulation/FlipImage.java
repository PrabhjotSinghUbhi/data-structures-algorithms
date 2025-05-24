package com.prabhjot.dsa.maths_for_dsa.bit_manipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        for (int i = 0; i < image.length; i++) {
            image[i] = flipInvertArray(image[i]);
        }

        for (int[] i : image) {
            System.out.println(Arrays.toString(i));
        }

    }

    public static int[] flipInvertArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] ^= 1;
        }

        return arr;
    }
}
