//import static sun.swing.MenuItemLayoutHelper.max;

public class MaximumArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};

        System.out.println(maxArr(arr));
        int temp = Integer.MAX_VALUE;
        Double temp2 =Double.MAX_VALUE;

        System.out.println(temp);
        System.out.println(temp2);
    }

    static int maxArr(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
