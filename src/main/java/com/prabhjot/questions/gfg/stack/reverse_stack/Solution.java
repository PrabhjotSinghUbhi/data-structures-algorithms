package com.prabhjot.questions.gfg.stack.reverse_stack;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        reverseStack(st);
        System.out.println(st);
    }

    private static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int val = st.pop();
        // reverse the remaining stack
        reverseStack(st);
        // insert the popped value at the bottom
        helperFn(st, val);
    }

    private static void helperFn(Stack<Integer> st, int val) {

        if (st.isEmpty()) {
            st.push(val);
            return;
        }

        int tp = st.pop();
        helperFn(st, val);
        // push back the previously popped element
        st.push(tp);
    }
}
