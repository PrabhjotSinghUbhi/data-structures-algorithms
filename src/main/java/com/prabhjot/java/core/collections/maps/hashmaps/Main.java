package com.prabhjot.java.core.collections.maps.hashmaps;

import java.util.HashMap;
import java.util.Map;

/*
    HashMaps:-
        - Stores key value pairs.
        - Unordered : no order is maintained.
        - Allows null keys and values.
        - not synchronized i.e. not thread-safe.

 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        /*
            Some methods of HashMaps of-
                Adding values
                    - put(key,value) : adds a key value pair in the hashmap.

                Getting/Reading values
                    - get(key) : getting the value at that particular key.
                        @returns null if no key exists.

                Checks Existence
                    - containsKey(key) : checks if the key exists in the hashmap.
                    - containsValue(value) : checks if that particular value exists in hashmap.

                Looping through map
                    - keySet() : return a Set of keys that can be used in for loop for iteration.


         */
        hashMap.put(1, "Prabhjot");
        hashMap.put(2, "Singh");
        hashMap.put(3, "Prince");

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.containsKey(30));

        for (int i : hashMap.keySet()) {
            System.out.println(i + " : " + hashMap.get(i));
        }

        System.out.println();

        for (Map.Entry<Integer, String> i : hashMap.entrySet()) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        boolean ree = hashMap.remove(2, "Singh");
        System.out.println(ree);

        // Internal Structure.
        /*
            Internal Structure of HashMaps-
                1. Key
                2. Value
                3. Buckets - A place where key value pair are stored. They are like cell(array).
                4. Hash Function - used to map keys to the indexes of buckets.
         */

        // Data Storage.
        /*
            How Data is stored in hashmaps-
                1. Hashing the key
                2. Calculating the index. e.g. - hashcode%array_size
                    Collisions(Linear Probing) -
                        - collisions in java are handled using LinkedList.
                        - after java 8 -
                            they use Balanced trees or RB Tree.
                        - after a certain threshold is reached the linked list then converts to RB tree.
                        - that threshold is 8
         */

        // Hashing Resizing or Rehashing.
        /*
            - HashMaps generally have a default array size of 16.
            - when the number of key-value pairs increase exceeding a certain load factor(default 0.75)
            - HashMaps automatically resize the array to accommodate that
         */

        // Time Complexity
        /*
            - HashMaps provide O(1) complexity assuming there are no collisions.
            - if there are any collisions the complexity may increase to O(n) or O(nlogn).
         */

    }
}
