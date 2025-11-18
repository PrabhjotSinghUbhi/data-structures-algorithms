package com.prabhjot.dsa.algorithms.maths_for_dsa.prime_numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ",i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }

        return true;
    }
}
