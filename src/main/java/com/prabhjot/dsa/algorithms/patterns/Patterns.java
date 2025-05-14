package com.prabhjot.dsa.algorithms.patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        rectangle(n, "*");
        triangle(n, "*");
        inverseTriangle(n, "*");
        pyramid(n, "*");
        numberPattern(n);
        combinationTrianglePattern(n);
        diamond(n);
        numberPattern2(n);
    }

    static void rectangle(int n, String chr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chr);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triangle(int n, String chr) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n + 1; j++) {
                System.out.print(chr);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void inverseTriangle(int n, String chr) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(chr);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pyramid(int n, String chr) {
        for (int i = 0; i < n; i++) {
            // for loop to print a blank of inverse pyramids
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            // For loop to print the pattern
            for (int j = n - i; j < n + 1; j++) {
                System.out.print(chr);
            }
            // For loop to print the pattern
            for (int j = n - i; j < n; j++) {
                System.out.print(chr);
            }

            System.out.println();
        }
    }

    static void numberPattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void combinationTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void diamond(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = n - i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void numberPattern2(int n) {
        for (int row = 1; row <= n; row++) {

            for (int j = row; j < n; j++) {
                System.out.print("  ");
            }

            for (int j = n - row; j < n - 1; j++) {
                System.out.print(n-j + " ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
        System.out.println();
    }

}
