package com.prabhjot.java.core.input_output.output.buffered_writer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //Buffer Writer buffers the characters.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //Buffers character output
        //Reduces system calls
        //Improves performance
        //without buffering:-
        // Every write hits OS
        //Slow
        bw.write("Hello world");
        bw.flush();
    }
}
