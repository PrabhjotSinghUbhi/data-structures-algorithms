package com.prabhjot.dsa.algorithms.maths_for_dsa.square_root;

public class SquareRoot {
    public static void main(String[] args) {
        double num = 40;
        System.out.printf("%.3f", sqrt(num, 3));
    }

    private static double sqrt(double num, int p) {
        int start = 0;
        int end = (int) num;

        double root = 0.0;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return mid;
            }

            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= num) {
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }

        return root;
    }
}