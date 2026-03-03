package com.prabhjot.dsa.questions.leetcode.strings.temp;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        findKthBit(n, k);
    }

    public static char findKthBit(int n, int k) {
        StringBuilder ans = new StringBuilder("0");

        for (int i = 1; i < n; i++) {
            ans = build(ans);
        }
        System.out.println(ans.toString());
        return ans.charAt(k);

    }

    public static StringBuilder build(StringBuilder s1) {
        StringBuilder ans = new StringBuilder(s1)
                .append("1")
                .append(
                        reverse(
                                inverse(new StringBuilder(s1))));

        return ans;
    }

    public static StringBuilder reverse(StringBuilder s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
        return s;
    }

    public static StringBuilder inverse(StringBuilder s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                s.setCharAt(i, '0');
            } else {
                s.setCharAt(i, '1');
            }
        }
        return s;
    }

}
