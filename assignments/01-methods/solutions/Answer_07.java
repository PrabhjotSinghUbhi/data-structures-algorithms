import java.util.Scanner;
//Define a method to find out if a number is prime or not.
public class Answer_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = in.nextInt();
        if (checkPrime(num)){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
        if (num == 0 || num == 1){
            System.out.println("invalid");
        }
    }


    static boolean checkPrime(int num){
        for (int i = 2; i*i <= num; i++) {
            if (num%i == 0){
                return false;
            }
        }

        return true;
    }
}
