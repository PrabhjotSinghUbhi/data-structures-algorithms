package com.prabhjot.dsa.data_structures.strings;

public class Strings {

    public static void main(String[] args) {
        // 🎉 Welcome to the magical world of Strings in Java! 🎉
        // Think of strings as a chain of characters, like a necklace made of beads. Each bead is a character, and the whole necklace is your string.

        // 🧵 Strings are Immutable:
        // Imagine you have a necklace (string). Once it's made, you can't change it. If you want to add more beads, you need to create a new necklace.
        String str1 = "Hello";
        String str2 = str1.concat(" World"); // Creates a new necklace (string)
        System.out.println("str1: " + str1); // Output: Hello
        System.out.println("str2: " + str2); // Output: Hello World
        System.out.println("Are str1 and str2 the same object? " + (str1 == str2)); // Output: false
        // See? The original necklace (str1) is untouched! 🧵✨

        // 🏠 The String Pool: A Special Neighborhood for Strings
        // Think of the String Pool as a neighborhood where all the identical necklaces (strings) live together to save space.
        String s1 = "Java";
        String s2 = "Java"; // Points to the same necklace in the neighborhood
        String s3 = new String("Java"); // Creates a new necklace outside the neighborhood
        System.out.println("Are s1 and s2 the same object? " + (s1 == s2)); // Output: true
        System.out.println("Are s1 and s3 the same object? " + (s1 == s3)); // Output: false
        System.out.println("Are s1 and s3 equal in value? " + s1.equals(s3)); // Output: true
        // 🏡 s1 and s2 share the same house in the String Pool, but s3 lives elsewhere.

        // 🛠️ Interning Strings: Moving into the Neighborhood
        // If you have a necklace outside the neighborhood (heap), you can move it into the String Pool using `.intern()`.
        String s4 = s3.intern(); // Moves s3 into the String Pool
        System.out.println("Are s1 and s4 the same object after interning? " + (s1 == s4)); // Output: true
        // Now s4 has moved into the String Pool and shares the same house as s1. 🏡

        // ✂️ Substring: Cutting a Necklace
        // When you cut a necklace (substring), you get a new necklace. The original one stays intact.
        String original = "Immutable";
        String substring = original.substring(0, 4); // Creates a new necklace "Immu"
        System.out.println("Original String: " + original); // Output: Immutable
        System.out.println("Substring: " + substring); // Output: Immu
        System.out.println("Are original and substring the same object? " + (original == substring)); // Output: false
        // The original necklace is still there, untouched! ✂️✨

        // 🛡️ Why Immutability? 
        // 1. Security: Imagine if someone could change your necklace while you're wearing it. That would be chaos! Immutability keeps it safe. 🔒
        // 2. Performance: The String Pool helps save memory by reusing necklaces instead of creating new ones. 🏡
        // 3. Hashing: Immutable necklaces are great for maps and sets because their "design" (hash) never changes. 🗺️

        // 🎯 Key Takeaways:
        // - Strings are immutable (unchangeable).
        // - The String Pool is a memory-saving neighborhood for strings.
        // - Use `.intern()` to move strings into the pool.
        // - Substring creates a new string without altering the original.

        // 🎓 That's it! Strings are simple yet powerful. Keep experimenting and have fun! 🚀
    }
}
