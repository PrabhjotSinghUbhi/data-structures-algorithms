import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter array element at position " + i + ": ");
            arr[i] = in.nextInt();
        }

        //
        Reverse.arrayReverse(arr);

        System.out.println(Arrays.toString(arr));

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}