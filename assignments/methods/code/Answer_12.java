import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class Answer_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter range: ");
        int a = in.nextInt();
        int b = in.nextInt();

        printPrime(a, b);

    }

    private static void printPrime(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i == 1 || i == 0){
                continue;
            }
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}
