package com.prabhjot.dsa.data_structures.strings;

public class palindrome {
    public static void main(String[] args) {
        String s = "";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            char headChar = s.charAt(head);
            char tailChar = s.charAt(tail);
            if (!(headChar >= 'a' && headChar <= 'z') && !(headChar >= 'A' && headChar <= 'Z')
                    && !(headChar >= '0' && headChar <= '9')) {
                head++;
                continue;
            }
            if (!((tailChar >= 'a' && tailChar <= 'z') || (tailChar >= 'A' && tailChar <= 'Z')
                    || (tailChar >= '0' && tailChar <= '9'))) {
                tail--;
                continue;
            }
            if (Character.toLowerCase(headChar) != Character.toLowerCase(tailChar)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
