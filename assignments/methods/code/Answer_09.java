//Q: Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
public class Answer_09 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("factorial of  " + i + " is " + factorial(i));
    }

    private static int factorial(int i) {
        if (i == 0 || i == 1){
            return 1;
        }
        return i*factorial(i-1);
    }
}
