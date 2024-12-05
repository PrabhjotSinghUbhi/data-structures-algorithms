public class Reverse {
    public static void arrayReverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            arr[start]= arr[start]^arr[end];
            arr[end] = arr[end]^arr[start];
            arr[start]= arr[start]^arr[end];

            start++;
            end--;
        }
    }
}
