package com.prabhjot.input_output.output.print_writer;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        //Using string builder and print writer is a good way to fast output the data.
        StringBuilder sb = new StringBuilder();
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        /**
         * PrintWriter adds
         * - formatting using method like print(), println(), printf(), convenience
         * - BufferWriter adds speed
         */

        // instead of using sout and printing everytime => SLOW => use string builder to store the output.
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0)
                sb.append("\n");
            sb.append(i).append(" ");
        }

        //output the data using PrintWriter
        out.println(sb);
        out.flush();
        /**
         * Step by step:
         * PrintWriter converts 42 → "42\n"
         * Sends characters to BufferedWriter.
         * BufferedWriter stores them in memory
         * When buffer is full or flushed:
         * Sends characters to OutputStreamWriter.
         * OutputStreamWriter converts characters → bytes.
         * Bytes go to System.out.
         * OS prints them to the screen
         */

    }
}
