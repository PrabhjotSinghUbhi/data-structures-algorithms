package com.prabhjot.dsa.questions.leetcode.strings.alternating_zeros_and_ones;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String str = "0100";
        System.out.println(minOperations(str));
    }

    public static int minOperations(String s) {
        int cnt = 0;
        boolean isStartZero = s.charAt(0) == '0';
        int n = s.length();

        int even = 0;
        int odd = 1;
        if(isStartZero) {
            while(even < n) {
                if(s.charAt(even) != 0)
                    cnt++;

                even += 2;
            }
            while(odd < n) {
                if(s.charAt(odd) != 1)
                    cnt++;

                odd += 2;
            }
        } else {
            while(even < n) {
                if(s.charAt(even) != 1)
                    cnt++;

                even += 2;
            }
            while(odd < n) {
                if(s.charAt(odd) != 0)
                    cnt++;

                odd += 2;
            }
        }

        return cnt;
    }
}
