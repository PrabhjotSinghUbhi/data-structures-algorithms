
import java.util.Arrays;

public class Temp {

    public static void main(String[] args) {
        // int[] arr = { 3, 4, 5, 2, 1 };
        // Search search = new Search();
        // System.out.println("found at index: "+search.linearSearch(arr, 2));

        // int[] arr = {1,2,3,4,5,6,7,8};
        // Search search = new Search();
        // System.out.println("Element found at " + search.binarySearch(arr,4));
        // int[] arr = {4, 3, 2, 1};
        // Sorting sort = new Sorting();
        // int[] result = sort.bubbleSort(arr);
        // System.out.println(Arrays.toString(result));
        int[] arr = {4, 3, 2, 1};
        Sorting sort = new Sorting();
        int[] result = sort.selectionSort(arr);
        System.out.println(Arrays.toString(result));
    }
}

class Search {

    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < 10; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}

class Sorting {

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, i, last);

            swap(arr, maxIndex, last);

            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    private int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return arr;
    }

    private int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
