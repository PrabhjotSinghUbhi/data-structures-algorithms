//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return i

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(solution.sol(nums)));
    }
}