import java.util.*;

public class solution {
    public static int[] sol(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i : nums){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
