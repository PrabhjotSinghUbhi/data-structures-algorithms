import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Answer_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 3 numbers ");
        System.out.print("a: ");
        int x = in.nextInt();
        System.out.print("b: ");
        int y = in.nextInt();
        System.out.print("z: ");
        int z = in.nextInt();

        maximum(x, y, z);
        minimum(x, y, z);
    }

    static void maximum(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("x is largest");
        } else if (y > x && y > z) {
            System.out.println("y is largest");
        } else if (z > x && z > y) {
            System.out.println("z is largest");
        }
    }

    static void minimum(int x, int y, int z) {
        if (x < y && x < z) {
            System.out.println("x is smallest");
        } else if (y < x && y < z) {
            System.out.println("y is smallest");
        } else if (z < x && z < y) {
            System.out.println("z is smallest");
        }
    }
}
