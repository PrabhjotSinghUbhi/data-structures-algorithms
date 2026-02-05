package com.prabhjot.dsa.questions.cses.exponentiation;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    public static void solution(int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            long result = exp(a, b) % ((int) Math.pow(10, 9) + 7);
            System.out.println(result);

        }
    }

    private static long exp(int a, int b) {
        if (b == 0) {
            return 1;
        }

        long mod = (long) Math.pow(10, 7) + 7;

        long x = exp(a, b / 2);
        x = (x % mod * x % mod) % mod;

        if (b % 2 != 0) {
            x = (x % mod * a % mod) % mod;
        }

        return x;

    }

}
