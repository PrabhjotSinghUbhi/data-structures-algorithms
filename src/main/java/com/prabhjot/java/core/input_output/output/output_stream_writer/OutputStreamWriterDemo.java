package com.prabhjot.java.core.input_output.output.output_stream_writer;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //converts characters to bytes
        //Bridge between text and binary output
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        osw.write("abc");
        osw.flush();
    }
}
