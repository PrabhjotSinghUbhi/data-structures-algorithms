package com.prabhjot.classes.stack.stack_implementation_using_array;

public class Main {
    public static void main(String[] args) {
        StackArrayDemo st = new StackArrayDemo();
        for (int i = 0; i < 10; i++) {
            st.push(i);
        }
        st.display();
        System.out.println(st.size());
//        st.push(56);
        System.out.print("-------------");
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.size);
    }
}
