public class EvenDigits2 {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int counter = 0;
        for (int i : nums) {
            if (even(i)) {
                counter++;
            }
        }
        return counter;
    }

    // check for even number of digits.
    static boolean even(int num) {
        int numOfDigits = count(num);
        return numOfDigits % 2 == 0;    
    }

    //     to count the number of digits.
        static int count(int num) {
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
            return count;
        }
}
