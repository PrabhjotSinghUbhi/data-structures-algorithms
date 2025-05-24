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

        System.out.println(pow(2, 1));
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

    static double pow(double x, int n) {
        if (n > 0) {
            int pow = 0;
            double ans = 1d;
            while (pow != n) {
                ans = ans * x;
                pow++;
            }
            return ans;
        } else {
            int pow = 0;
            double ans = 1d;
            while (pow != n) {
                ans = ans * x;
                pow++;
            }
            return ans;
        }
    }
}
