package com.prabhjot.input_output.basics;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Basics {
    public static void main(String[] args) throws IOException {
        /*
            - Java only reads bytes
            - it does not know about integers or characters etc.
            - everything else is abstract on top.

            - Java usually gives System.in and System.out
            - System.in - standard input and System.out - standard output

            *- these are streams - a continuous flow of bytes in one direction.
         */
        // lowest level of input in java.
        InputStream in = System.in;
        int b = in.read(); // will read one character range-256.
        System.out.println((char) b);// give ASCII result.

        OutputStream out = System.out;
        out.write(65);
        out.flush();
        /**
         * Why flush is required if you want to print on screen?
         * - What actually happens
         * --  System.out is connected to the console.
         * --  Java does not send every byte to the console immediately.
         * --  It first puts the byte into a buffer (temporary memory).
         * --  The console only shows data when that buffer is flushed.
         * out.flush() means:
         * “Stop waiting. Send whatever you have to the console right now.”
         * Without flush(), Java assumes:
         * - More data is coming
         * - Sending it now would be inefficient
         */
        /**
         * Why raw streams are not used directly
         * Problems:
         * - Reading byte by byte is slow
         * - Writing byte by byte is slow
         * - No parsing
         * - No formatting
         * - Solution:
         * -- Wrap streams with higher-level classes.
         * -- This is the entire Java I/O design.
         */
    }
}
