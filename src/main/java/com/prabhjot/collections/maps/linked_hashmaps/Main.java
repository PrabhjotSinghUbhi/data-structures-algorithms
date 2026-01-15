package com.prabhjot.collections.maps.linked_hashmaps;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    Code difference b/w Hash Map and Linked Hash Map is that-
        - Order is maintained.
 */
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(
                11,
                0.5f,
                false
        ); // Doubly Linked List

        linkedHashMap.put(4, "one");
        linkedHashMap.put(2, "two");
        linkedHashMap.put(3, "three");

        for (Map.Entry<Integer, String> i : linkedHashMap.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        String res = linkedHashMap.getOrDefault(12, "Hello");
        System.out.println(res);

        String resp = linkedHashMap.putIfAbsent(1, "Hello");

    }
}
