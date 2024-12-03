import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Answer_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        System.out.println(Check_Palindrome(num));
    }

    private static Boolean Check_Palindrome(int num) {
        int rem;
        int sum = 0;
        int original = num;

        while (num != 0) {
            rem = num % 10;   // 1234 -- 4  // 123 --- 3
            sum = (sum + rem) * 10; //sum = 0 + 4 * 0 -- 40  + 3*10 --70 //
            num /= 10;
        }
        sum /= 10;
        return (sum == original);
    }
}
