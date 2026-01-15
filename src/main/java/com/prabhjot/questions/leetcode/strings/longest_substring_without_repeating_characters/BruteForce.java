package com.prabhjot.questions.leetcode.strings.longest_substring_without_repeating_characters;

public class BruteForce {
    public static void main(String[] args) {
        String str = "2ijifjrijuijijr85i3o";
        System.out.println(lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String str) {
        int n = str.length();
        int ml = 0;
        for (int i = 0; i < n; i++) {
            int[] hash = new int[256];
            for (int j = i; j < n; j++) {
                if (hash[str.charAt(j)] == 1) {
                    break;
                }
                ml = Math.max(ml, j - i + 1);
                hash[str.charAt(j)] = 1;
            }
        }
        return ml;
    }
}
