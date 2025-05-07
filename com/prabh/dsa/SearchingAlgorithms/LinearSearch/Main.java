package com.prabh.dsa.searchingalgorithms.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4, 5 };
        int target = 4;

        int ans = linearSearch(arr, target);

        if(ans != -1){
            System.out.println("Element Found at: " +  ans + " index.");
        } else {
            System.out.println("Element not found.");
        }
    }

    private static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
