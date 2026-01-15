package com.prabhjot.questions.leetcode.strings.longest_reapeating_character_replacement;

public class BruteForce {
    public static void main(String[] args) {
        String str = "AABABBA";
        int result = characterReplacement(str, 1);
        System.out.println(result);
    }

    private static int characterReplacement(String str, int k) {
        int mx = 0;
        int mxF = 0;
        for (int i = 0; i < str.length(); i++) {
            int[] hash = new int[26];
            for (int j = i; j < str.length(); j++) {
                hash[str.charAt(j) - 'A']++;
                mxF = Math.max(mxF, hash[str.charAt(j) - 'A']);
                if ((j - i + 1) - mxF <= k)
                    mx = Math.max(mx, j - i + 1);
                else
                    break;
            }
        }
        return mx;
    }
}
