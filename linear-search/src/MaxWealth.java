public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(nums));
    }

    static int maximumWealth(int[][] accounts) {
        int min = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > min) {
                min = sum;
            }
        }
        return min;
    }
}
