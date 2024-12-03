import java.util.Scanner;

//Write a program to print the products of two numbers entered by user by defining your own method.
public class Answer_06 {
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
        System.out.print("product is : ");
        return a * b;
    }
}
