package com.prabhjot.input_output.input.string_tokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws IOException {
        //String Tokenizer is basically used to split a string
        //it is very faster than using split() method
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());

        //iteration
        //TODO: check the error, and check out the iterator method.
        for (int i = 0; i < st.countTokens(); i++) {
            System.out.println(st.nextElement());
        }
    }
}
