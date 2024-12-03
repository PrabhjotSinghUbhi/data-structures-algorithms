import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Answer_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius of circle");
        double r = in.nextInt();

        System.out.println("circumference is " + circumference(r));
        System.out.println("area is " + area(r));
    }

    private static double area(double r) {
        return (3.14*3.14*r);
    }

    private static double circumference(double r){
        return (3.14*2*r);
    }
}
