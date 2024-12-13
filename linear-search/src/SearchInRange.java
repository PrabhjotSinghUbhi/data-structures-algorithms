public class SearchInRange {
    public static void main(String[] args) {
        int start = 2;
        int end = 5;
        int[] arr = {3, 5, 7, 2, 5, 8,};
        int target = 7;

        rangeSearch(arr, target, start, end);
    }

    private static void rangeSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            System.out.println("INVALID");
            return;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                System.out.println("found at index " + i);
                return;
            }
        }
        System.out.println("not found");
        return;
    }
}
