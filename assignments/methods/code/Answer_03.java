import java.util.Scanner;

//Q: A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Answer_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        ageVote(age);
    }

    static void ageVote(int age) {
        if (age >= 18 && age < 123) {
            System.out.println("You are eligible to vote");
        } else if (age < 18 && age > 1) {
            System.out.println("you are not eligible to vote");
        } else {
            System.out.println("Enter valid age");
        }
    }
}
