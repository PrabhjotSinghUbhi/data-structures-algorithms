package com.prabhjot.dsa.maths_for_dsa.square_root;

public class Temp {
    public static void main(String[] args) {
        // Your code here
        int num = 38;
        System.out.println(addDigits(38));
    }
     public static int addDigits(int num) {

        if (num == 0) {
            return 0;
        }

        int digits = (int) (Math.log(num)/Math.log(10));
        System.out.println(digits);
        int ans = 0;
       while(digits != 1){
           ans = add(num);
           digits = (int)(Math.log(ans)/Math.log(10));
       }

        return ans;
    }

    static int add(int num){ 
        int ans = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            ans += lastDigit;
            num /= 10;
        }

        return ans;
    }
}