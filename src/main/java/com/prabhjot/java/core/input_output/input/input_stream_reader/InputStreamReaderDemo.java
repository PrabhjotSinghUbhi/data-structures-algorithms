package com.prabhjot.java.core.input_output.input.input_stream_reader;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        /**
         * InputStreamReader
         * - Takes Bytes from InputStream and converts them into Characters.
         * - no buffer, only conversion
         */
        InputStreamReader isr = new InputStreamReader(System.in);
        int a = isr.read();
        System.out.println((char) a);
    }
}
