import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ans = {4, 5, 1, 2, 3};
        sSort(ans);
        System.out.println(Arrays.toString(ans));
    }

    private static void sSort(int[] arr) {
        for (int i = 0, n = arr.length; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int count = 0;
            for (int j = 0; j < n - i; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    count = j;
                }
            }
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[count];
            arr[count] = temp;
        }
    }
}