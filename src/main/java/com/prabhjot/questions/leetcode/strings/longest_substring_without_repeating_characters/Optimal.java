package com.prabhjot.questions.leetcode.strings.longest_substring_without_repeating_characters;

import java.util.HashMap;

/**
 * Utility class that contains an optimal sliding-window implementation
 * to find the length of the longest substring without repeating characters.
 *
 * <p>The algorithm maintains a sliding window [i, j] and a map of the last
 * seen index for each character. When a repeated character is encountered,
 * the left boundary i is moved to one position after the last occurrence of
 * that character (if it lies within the current window).</p>
 *
 * Complexity:
 * - Time: O(n) where n is the length of the input string (each character is
 *   visited at most twice by the window pointers).
 * - Space: O(min(n, m)) where m is the character set size (stored in the map).
 */
public class Optimal {

    /**
     * Simple runner for quick manual verification.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {
        String str = "2ijifjrijuijijr85i3o";
        System.out.println(lengthOfLongestSubstring(str));
    }

    /**
     * Returns the length of the longest substring of the given string that
     * contains no repeated characters.
     *
     * <p>This method uses the standard sliding-window approach. A map stores
     * the most recent index of each character seen. The right pointer j
     * expands the window, and when a duplicate character is found, the left
     * pointer i is advanced to the position just after the last occurrence of
     * that character (if that occurrence is inside the current window).</p>
     *
     * @param s the input string to examine; if null, a NullPointerException will be thrown
     * @return the length of the longest substring without repeating characters
     */
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        while (j < s.length()) {
            char currChar = s.charAt(j);
            if (mp.containsKey(currChar)) {
                i = Math.max((mp.get(currChar) + 1), i);
                mp.put(currChar, j);
            } else {
                mp.put(currChar, j);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }
        return maxLength;
    }
}