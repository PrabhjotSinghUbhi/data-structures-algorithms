package com.prabhjot.input_output.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        /**
         * The Scanner is designed for:
         * => beginners, interactive programs and convenience.
         * Scanner does:
         * ==> Regex parsing
         * ==> Type Conversion
         * ==> Locale Handling
         * ==> Tokenization
         * All of this costs time.
         * This is the reason it is very slow and gives TLE for competitive platforms.
         */
    }
}
