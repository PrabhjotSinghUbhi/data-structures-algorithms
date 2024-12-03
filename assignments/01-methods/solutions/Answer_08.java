//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class Answer_08 {
    public static void main(String[] args) {
        System.out.print("Enter your Total Marks: ");
        Scanner in = new Scanner(System.in);
        float marks = in.nextFloat();
        grade(marks);
    }

    private static void grade(float marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Your grade is AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("your grade is AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("your grade is BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("your grade is BB");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("your grade is BC");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("your grade is CD");
        } else if (marks < 40) {
            System.out.println("fail");
        }
    }
}

