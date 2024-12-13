public class Main {
    public static void main(String[] args) {
        int[] nums = {18, 12, 9, 14, 77, 50};
        int target = 14;
        // checking weather 14 in present in the given array
        linearSearch(nums, target);
    }

    // Linear search algorithm.
    static void linearSearch(int[] arr, int num) {
        // Alternatively we can use a For Each loop to obtain the same result and less code.
//        for (int i = 0; i < arr.length; i++) {
        for (int i : arr) {
            if (i == num) {
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
    }
}
