package com.prabhjot.java.core.file_handling.serialization_and_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        //save this object.
        User prince = new User(
                "Prabhjot Singh",
                "78",
                "punjab",
                10293
        );

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(prince);
            System.out.println("saved Successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
