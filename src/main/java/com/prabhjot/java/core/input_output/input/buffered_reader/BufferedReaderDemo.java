package com.prabhjot.java.core.input_output.input.buffered_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Reads large chunks internally
         * Avoids frequent system calls
         * Much faster than reading one character at a time
         * * readLine() returns null at EOF => This is how EOF is detected at line level
         * BufferedReader is fast enough for many problems, but not the fastest.
         */
        int a = br.read();
        System.out.println(a);
        String b = br.readLine();
        System.out.println("This" + b);

    }
}
