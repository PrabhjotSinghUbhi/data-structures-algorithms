package com.prabhjot.dsa.questions.cses.counting_divisors;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class FastScanner {
    private final byte[] buffer = new byte[1 << 16];
    private final InputStream in = System.in;
    private int ptr = 0, len = 0;

    private int readByte() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }

    long nextLong() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);

        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }

        long val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        return val * sign;
    }

    int nextInt() throws IOException {
        return (int) nextLong();
    }
}

public class Sol {

    static final int MAX = 1000000;
    static ArrayList<Integer> primes = new ArrayList<>();

    static void sieve() {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) primes.add(i);
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        sieve();

        int n = fs.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long x = fs.nextLong();
            long ans = 1;
            long temp = x;

            for (int p : primes) {
                if ((long) p * p > temp) break;

                if (temp % p == 0) {
                    int cnt = 0;
                    while (temp % p == 0) {
                        temp /= p;
                        cnt++;
                    }
                    ans *= (cnt + 1);
                }
            }

            // leftover prime factor
            if (temp > 1) ans *= 2;

            sb.append(ans).append('\n');
        }

        out.print(sb);
        out.flush();
    }
}
