package com.prabhjot.dsa.algorithms.recursion.array_questions.check_if_the_array_is_sorted;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 18, 9, 12};
        System.out.println(rec(arr, 0));
    }

    private static boolean rec(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i+1] &&  rec(arr, ++i);
    }
}
