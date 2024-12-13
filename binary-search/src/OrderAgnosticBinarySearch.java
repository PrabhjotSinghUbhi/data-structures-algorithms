public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8, 9, 10, 12};
        int target = 6;
        int result = orderAgnosticBS(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

        static int orderAgnosticBS(int[] arr , int target){
            int start = 0;
            int end = arr.length - 1;

            boolean isAsc = arr[start] <= arr[end];

            while (start <= end) {
//            int mid = start + end / 2;          (start + end) might be out of range integer.
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                }
                if (isAsc) {

                    if (arr[mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (arr[mid] < target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }
