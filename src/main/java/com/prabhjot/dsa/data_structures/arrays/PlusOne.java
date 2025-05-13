package com.prabhjot.dsa.data_structures.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = { 9 };
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;
            } else if (digits[i] == 9 && digits.length == 1) {
                return new int[] { 1, 0 };
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
