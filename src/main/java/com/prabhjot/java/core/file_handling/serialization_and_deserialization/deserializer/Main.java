package com.prabhjot.java.core.file_handling.serialization_and_deserialization.deserializer;


import com.prabhjot.java.core.file_handling.serialization_and_deserialization.User;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User prince = null;

        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\ASUS\\Desktop\\data-structures-algorithms\\UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            prince = (User) in.readObject();

            in.close();
            fin.close();

            System.out.println("Successful ");
            System.out.println(prince.name);
            System.out.println(prince.marks);
            System.out.println(prince.id);
        } catch (IOException e) {
            System.out.println("IO exceptions :: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound exception :: " + e.getMessage());
        }

    }
}
