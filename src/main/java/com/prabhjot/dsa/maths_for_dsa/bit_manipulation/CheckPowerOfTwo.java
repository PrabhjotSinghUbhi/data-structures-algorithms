package com.prabhjot.dsa.maths_for_dsa.bit_manipulation;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(checkPower(0));
    }

    public static boolean checkPower(int number) {
        if (number == 0) {
            return false;
        }
        return (0 == ((number) & (number - 1)));
    }

}
