package com.prabhjot.dsa.algorithms.recursion;

/*
 & What is recursion?
 * -> 
 ? Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem. It is often used to solve problems that can be broken down into smaller, similar sub problems. A recursive function typically has two main components:

    *1. Base Case: The condition under which the recursion stops. Without a base case, the function would call itself indefinitely, leading to a stack overflow.

    *2. Recursive Case: The part of the function where it calls itself to solve a smaller instance of the problem.
 */
public class RecursionIntro {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fibo(n)); // Example usage: Calculate the 9th Fibonacci number.
        System.out.println(fiboFormula(n)); // Example usage: Calculate the 9th Fibonacci number.
    }

    private static int fiboFormula(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    private static int fibo(int n) {

        // Base condition: If n is less than 2, return n directly.
        // This stops the recursion when n is 0 or 1.
        if (n < 2) {
            return n;
        }

        // Recursive case: Calculate the Fibonacci number by summing the results
        // of the two previous Fibonacci numbers (fibo(n-1) and fibo(n-2)).
        return fibo(n - 1) + fibo(n - 2);

        /*
         * Explanation of recursion in Fibonacci:
         * - The Fibonacci sequence is defined as:
         * F(0) = 0, F(1) = 1
         * F(n) = F(n-1) + F(n-2) for n > 1
         * - For example, fibo(4) will call fibo(3) and fibo(2).
         * fibo(3) will call fibo(2) and fibo(1).
         * fibo(2) will call fibo(1) and fibo(0).
         * - The recursion stops when it reaches the base case (n < 2).
         * - Once the base cases are reached, the results are returned and summed up:
         * fibo(2) = fibo(1) + fibo(0) = 1 + 0 = 1
         * fibo(3) = fibo(2) + fibo(1) = 1 + 1 = 2
         * fibo(4) = fibo(3) + fibo(2) = 2 + 1 = 3
         */
    }
}
