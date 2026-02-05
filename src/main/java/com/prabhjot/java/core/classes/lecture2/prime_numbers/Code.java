package com.prabhjot.java.core.classes.lecture2.prime_numbers;

public class Code {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1 || n == 0)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
