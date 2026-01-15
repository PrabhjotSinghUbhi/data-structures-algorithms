package com.prabhjot.collections.list.vector;

import java.util.Vector;

/*
    Vectors are legacy class i.e. they existed even before the collection framework was introduced.
        - Vectors are thread safe i.e. they are synchronised by default.
*/
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(12, 1);
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);

        System.out.println(vec.capacity());

    }
}
