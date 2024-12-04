import java.util.*;

//Write a function that returns the sum of first n natural numbers.
public class Answer_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();

        System.out.println(nSum(n));
    }

    private static int nSum(int n) {
        if (n == 1 || n==0){
            return 1;
        }
        return (n*(n+1))/2;
    }

}
