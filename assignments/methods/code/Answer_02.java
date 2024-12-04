import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Answer_02 {
    public static void main(String[] args) {
        //input a  number.
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();

        checkOddEven(num);
    }
    static void checkOddEven(int a){
        if (a%2 == 0){
            System.out.println("Number is even");
        }
        else {
        System.out.println("Number is odd");
        }
    }
}
