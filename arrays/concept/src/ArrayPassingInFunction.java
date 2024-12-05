import java.util.Arrays;

public class ArrayPassingInFunction {
    public static void main(String[] args) {
        String[] arr = {"one", "two"};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    //  IMP: ARRAYS ARE MUTABLE IN JAVA.
    static void swap(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}

