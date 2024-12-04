package code;

import java.util.Scanner;

public class Answer_13 {
    public static void main(String[] args) {
//        leapYear();
//        table();

    }

    static void leapYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = in.nextInt();
        boolean isLeap;
        isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeap) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }

    static void table() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number you want a table of: ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    static void hcflcm() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
    }

    //Q: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    static void fun() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number (or 'x' to stop):");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid number or 'x' to stop.");
            }
        }
        System.out.println("The sum of all entered numbers is: " + sum);
    }
}


