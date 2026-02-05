package com.prabhjot.dsa.questions.code_forces.replace_character;

import java.io.IOException;
import java.io.InputStream;

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
}

public final class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();  // number of test cases

        while (t-- > 0) {
            int n = fs.nextInt();
            String s = fs.next();

            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            // find max frequency character
            int maxChar = 0;
            for (int i = 1; i < 26; i++) {
                if (freq[i] > freq[maxChar]) {
                    maxChar = i;
                }
            }

            // find min frequency character (freq > 0)
            int minChar = -1;
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0 && (minChar == -1 || freq[i] < freq[minChar])) {
                    minChar = i;
                }
            }

            char maxC = (char) ('a' + maxChar);
            char minC = (char) ('a' + minChar);

            char[] arr = s.toCharArray();
            for (int i = 0; i < n; i++) {
                if (arr[i] == maxC) {
                    arr[i] = minC;  // replace **one occurrence** of maxC with minC
                    break;
                }
            }

            out.append(arr).append('\n');
        }

        System.out.print(out);
    }
}
