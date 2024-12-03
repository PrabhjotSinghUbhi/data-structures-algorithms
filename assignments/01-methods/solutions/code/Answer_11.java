import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class Answer_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three numbers");
        System.out.println("enter Base length: ");
        int Base_length = in.nextInt();
        System.out.println("enter perpendicular : ");
        int perpendicular = in.nextInt();
        System.out.println("enter Hypotenuse: ");
        int Hypoteneus = in.nextInt();

        System.out.println(checkTriplet(Base_length , perpendicular , Hypoteneus ));
    }

    private static Boolean checkTriplet(int Base_length, int perpendicular, int Hypoteneuse) {
        return Base_length*Base_length + perpendicular*perpendicular == Hypoteneuse*Hypoteneuse;
    }

}
