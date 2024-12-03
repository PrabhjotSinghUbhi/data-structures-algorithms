import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Answer_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number: ");
        System.out.print("a:");
        int a = in.nextInt();
        System.out.print("b:");
        int b = in.nextInt();

        System.out.println(add(a , b));

    }
    static int add(int a , int b){
        System.out.print("addition is : ");
        return a + b;
    }
}
