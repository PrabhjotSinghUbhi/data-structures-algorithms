import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Input_for_2DArray {
    public static void main(String[] args) {

        //INDIVIDUAL ARRAY IS AN INDIVIDUAL OBJECT.
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Scanner in = new Scanner(System.in);

        int [][] arr = new int[3][3];

        //input
        //for rows
        for (int rows = 0; rows < arr.length; rows++) {
            //for columns
            for (int col = 0; col < arr[rows].length; col++) {
//                System.out.print("for row: " + rows + " and column: " + col + " element: ");
                arr[rows][col]  = in.nextInt();
            }
        }

        //output
//        for (int rows = 0; rows < arr.length; rows++) {
//            //for columns
//            for (int col = 0; col < arr[rows].length; col++) {
////                System.out.print("for row: " + rows + " and column: " + col + " element: ");
//                System.out.print(arr[rows][col] + " ");
//            }
//            System.out.println();
//        }

        //output 2
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

//        output 3
            for(int[] a  : arr){
                System.out.println(Arrays.toString(a));
            }
    }
}

