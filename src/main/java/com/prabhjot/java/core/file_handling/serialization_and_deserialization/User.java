package com.prabhjot.java.core.file_handling.serialization_and_deserialization.serializer;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String marks;
    String location;
    int id;

    public User(String name, String marks, String location, int id) {
        this.name = name;
        this.marks = marks;
        this.location = location;
        this.id = id;
    }
}
