package com.prabhjot.dsa.algorithms.maths_for_dsa.prime_numbers.sieve_of_eratosthenes;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int num = 37;
        boolean[] primes = new boolean[num + 1];
        sieveOfEratosthenes(num, primes);
    }

    public static void sieveOfEratosthenes(int num, boolean[] primes) {
        // false means prime.
        for (int i = 2; i * i <= num; i++) {
            // if it is prime.
            if (!primes[i]) {
                for (int j = i * i; j <= num; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (!primes[i])
                System.out.printf("%d ", i);
        }
    }
}
