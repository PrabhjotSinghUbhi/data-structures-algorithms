package com.prabhjot.dsa.data_structures.strings;

public class Stringbuilders {

    public static void main(String[] args) {
        // 🎉 Welcome to the world of StringBuilder! 🎉
        // If Strings are immutable necklaces, think of StringBuilder as a flexible bracelet. You can add, remove, or change beads (characters) without creating a new bracelet.

        // 🛠️ What is StringBuilder?
        // StringBuilder is a class in Java that allows you to create and modify strings efficiently. Unlike Strings, it is mutable, meaning you can change its content without creating a new object.

        // 🏗️ Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial StringBuilder: " + sb); // Output: Hello

        // ✨ Adding to the StringBuilder
        sb.append(" World"); // Adds " World" to the existing content
        System.out.println("After append: " + sb); // Output: Hello World

        // ✂️ Removing from the StringBuilder
        sb.delete(5, 11); // Removes characters from index 5 to 10 (exclusive)
        System.out.println("After delete: " + sb); // Output: Hello

        // 🔄 Replacing content in the StringBuilder
        sb.replace(0, 5, "Hi"); // Replaces characters from index 0 to 4 with "Hi"
        System.out.println("After replace: " + sb); // Output: Hi

        // 🧩 Inserting into the StringBuilder
        sb.insert(2, " there"); // Inserts " there" at index 2
        System.out.println("After insert: " + sb); // Output: Hi there

        // 🔄 Reversing the StringBuilder
        sb.reverse(); // Reverses the content
        System.out.println("After reverse: " + sb); // Output: ereht iH

        // 🛡️ Why use StringBuilder?
        // 1. Efficiency: StringBuilder is faster than Strings for operations like concatenation because it doesn't create new objects.
        // 2. Flexibility: You can modify the content without worrying about immutability.

        // 🎯 Key Takeaways:
        // - StringBuilder is like a flexible bracelet that you can modify as much as you want.
        // - Use it when you need to perform multiple string operations efficiently.
        // - Common methods: append(), delete(), replace(), insert(), reverse().

        // 🎓 That's it! StringBuilder is your go-to tool for efficient string manipulation. Keep experimenting and have fun! 🚀
    }
}
