public class EvenDigits {
    public static void main(String[] args) {

    }

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits.
    static int EvenDigits(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            while (nums[i] != 0) {
                counter++;
                nums[i] /= 10;
            }
            if (counter % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
