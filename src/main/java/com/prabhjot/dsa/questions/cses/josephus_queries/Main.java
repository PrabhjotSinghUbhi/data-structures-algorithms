package com.prabhjot.dsa.questions.cses.josephus_queries;

//package com.prabhjot.dsa;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        long t = fs.nextLong();
        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            if (k <= Math.floor(n / 2)) {
                sb.append(2 * k).append("\n");
            } else {

            }
        }

        /*
        solve(n, k):
            if k <= n / 2:
                return 2 * k
            else:
                return 2 * solve((n + 1) / 2, k - n / 2) - 1
         */

    }
}

class FastScanner {
    private final byte[] buffer = new byte[1 << 16];
    private final InputStream in = System.in;
    private int ptr = 0, len = 0;

    private int readByte() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);//"Fill this byte array with as many bytes as you can from input, in one shot."
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }

    int nextInt() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);

        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }

        int val = 0;
        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        return val * sign;
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

    String next() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);

        StringBuilder sb = new StringBuilder();
        while (c > ' ') {
            sb.append((char) c);
            c = readByte();
        }
        return sb.toString();
    }

    String nextLine() throws IOException {
        int c;
        StringBuilder sb = new StringBuilder();
        while ((c = readByte()) != -1) {
            if (c == '\n') break;
            if (c != '\r') sb.append((char) c);
        }
        return sb.toString();
    }

    boolean hasNext() throws IOException {
        int c;
        while ((c = readByte()) != -1) {
            if (c > ' ') {
                ptr--;
                return true;
            }
        }
        return false;
    }

    double nextDouble() throws IOException {
        int c;
        do {
            c = readByte();
        } while (c <= ' ' && c != -1);

        int sign = 1;
        if (c == '-') {
            sign = -1;
            c = readByte();
        }

        double val = 0;
        while (c > ' ' && c != '.') {
            val = val * 10 + (c - '0');
            c = readByte();
        }

        if (c == '.') {
            double div = 1;
            while ((c = readByte()) > ' ') {
                div *= 10;
                val += (c - '0') / div;
            }
        }
        return sign * val;
    }

}

