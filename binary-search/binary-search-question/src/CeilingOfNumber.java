public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 9, 14, 16, 18};
        int target = 3;
        int result = ceiling(arr, target);
        if (result != -1) {
            System.out.println("number found at index: " + result);
        } else {
            System.out.println("couldn't find the target");
        }
    }

    private static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // using this we can cover if index overflow condition

            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
