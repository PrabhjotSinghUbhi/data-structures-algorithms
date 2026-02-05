package com.prabhjot.java.core.classes.lecture2.greatest_number_in_array;

public class Code {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(STR."Greatest Number in array : \{findGreatest(arr)}");
    }

    private static int findGreatest(int[] arr) {
        int greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            greatest = Math.max(greatest, arr[i]);
        }
        return greatest;
    }
}
