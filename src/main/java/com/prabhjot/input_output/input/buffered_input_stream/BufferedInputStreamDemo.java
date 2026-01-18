package com.prabhjot.input_output.input.buffered_input_stream;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //Fasted possible way to take input in java is BufferInputStream.
        //reads from std input that is System.in
        //uses byte stream
        BufferedInputStream bis = new BufferedInputStream(System.in);
        //reads raw bytes
        //no character decoding.
        //no string
        //no overhead
        //you have to read bytes and parse manually.
        //This is what your FastScanner uses internally.
        byte[] re = bis.readNBytes(2);
        System.out.println(re);
    }
}
