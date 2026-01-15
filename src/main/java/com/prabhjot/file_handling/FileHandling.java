package com.prabhjot.file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <pre>
 * - This Module talks about the basics of file handling in java.
 * - Java uses streams to handle input and output
 * - streams are basically sequence of data
 * - Its Abstraction that provides for input and output tasks.
 * - Java implements these with in class hierarchy in java.io package.
 *
 * - Types of Streams in Java
 * - ByteStream
 * - represents binary data, img files, pdf files.
 *
 * - Types of ByteStream
 * - InputStream
 * - Output Stream
 *
 * - Character Stream
 * - Reader
 * - Write
 * </pre>
 */
public class FileHandling {
    public static void main(String[] args) {
        /*
            IOException
                - This exception occurs when
                    - File is corrupted.
                    - File could not be opened
                    - etc.

            Predefined Streams in java-
                - System.out
                    - standard output stream
                    - console

                - System.in
                    - Standard input stream
                    - Keyboard

                - System.error
                    - standard error stream
                    - console

         */
        //Let's talk about a real example.
        //Converting byte streams into character streams
//        try {
//            /*
//                System.in - byte stream
//                    |
//                InputStream - converts Bytes into Characters
//             */
//            InputStreamReader isr = new InputStreamReader(System.in);
//            System.out.println("Enter letter: ");
//
//            /*
//                read() method.
//                    - returns int i.e. Unicode of one character
//                    - or -1 if end of the stream.
//             */
//            int letter = isr.read(); // reads the first value from isr.
//            while (isr.ready()) {
//                System.out.println((char) letter); // prints the typecast value of letter
//                letter = isr.read(); // reads the next value
//            }
////            isr.close(); no need to close after java 7, automatically closes after try-catch.
//            System.out.println();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//            throw new RuntimeException(e);
//        }

        //Now let's talk about some real file handling.
        //Reading a real .txt file.
//        try {
//            // when code run the path is from root directory
//            // so this mean intro.txt is in the root of the file.
//            FileReader fr = new FileReader("intro.txt");
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.print((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //Let's talk about more efficient read operations using bufferedReader
        //byte to char stream and then reading char stream.
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // fast input-output, this line is useful.
//        try {
//            // reads the whole line at once
//            System.out.println("You Typed :: " + br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // we can also read from the file.
//        BufferedReader bufferedReader = null;
//        try {
//            bufferedReader = new BufferedReader(new FileReader("intro.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            while (bufferedReader.ready()) {
//                String line = bufferedReader.readLine();
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //OutputStreamWriter
        // converts char stream into byte stream.
//        try {
//            OutputStreamWriter osw = new OutputStreamWriter(System.out);
//            osw.write("Prince Ramgharia");
//            osw.write("/n");
//            osw.write("Prince");
//            osw.write(97);
//
////            osw.write(😂);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            FileWriter fw = new FileWriter("intro.txt", true);
            fw.write("Hello world Prabh");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //creating a new file
        File fo = new File("src/New-File.txt");
        try {
            fo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fo.getAbsoluteFile());

    }


}
