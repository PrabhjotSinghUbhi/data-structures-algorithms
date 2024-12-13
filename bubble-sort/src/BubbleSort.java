import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {3, 4, 2, 5, 1};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0, n = arr.length; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}