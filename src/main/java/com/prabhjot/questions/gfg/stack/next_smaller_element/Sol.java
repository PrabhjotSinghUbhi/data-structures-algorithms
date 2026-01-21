package com.prabhjot.questions.gfg.stack.next_smaller_element;

import java.util.ArrayList;
import java.util.Stack;

public class Sol {
    public static void main(String[] args) {
        int[] nums = {4, 8, 5, 2, 25};
        System.out.println(nextSmallerEle(nums));
    }

    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i])
                st.pop();

            if (!st.isEmpty())
                nums.add(st.peek());
            else
                nums.add(-1);
            st.push(arr[i]);
        }

        return nums;
    }
}
