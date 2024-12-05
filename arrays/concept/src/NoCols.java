public class NoCols {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }
    }
}
