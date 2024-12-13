import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {{23, 45, 76, 43}, {34, 56, 29}, {45, 49, 64, 93, 46}};
        int target = 29;

        int[] ans = searchArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] searchArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        System.out.println("not fount");
        return new int[]{-1, -1};
    }
}

