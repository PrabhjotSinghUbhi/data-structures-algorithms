public class Main {
    public static void main(String[] args) {
        int target = 9;
        int[] arr = {2,7,11,15};

        System.out.println(twoSum(arr,target));
    }
    static int[] twoSum(int[]nums , int target){
        int start = 0;
        int end = nums.length - 1;

        int[] arr = {start,end};

        while (start < end){
            if (nums[start] + nums[end] < target){
                start++;
            }
            if (nums[start] + nums[end] > target){
                end--;
            }
            if (nums[start] + nums[end] == target){
                break;
            }
        }
    return arr;
    }
}

