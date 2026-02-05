package com.prabhjot.dsa.questions.leetcode.strings.longest_reapeating_character_replacement;

/**
 * Leetcode - 424
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 * <p>
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 */
public class Optimal {
    public static void main(String[] args) {
        String str = "AABABBA";
        int result = characterReplacement(str, 1);
        System.out.println(result);
    }

    private static int characterReplacement(String s, int k) {

        //Hash to store the frequency of the characters.
        int[] hash = new int[256];
        int maxLength = 0;
        int maxFreq = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        while (j < n) {
            hash[s.charAt(j)]++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(j)]);
            if ((j - i + 1) - maxFreq > k) {
                hash[s.charAt(i)]--;
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }
        return maxLength;
    }
}
