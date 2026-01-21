package com.prabhjot.classes.stack_implementation_using_linked_list;

public class Main {
    public static void main(String[] args) {
        StackDemo st = new StackDemo();
        for (int i = 0; i < 5; i++) {
            st.push(i);
        }
        st.display();
        System.out.println(STR."Top Element : \{st.peek()}");
        st.pop();
        System.out.println(STR."Top Element Now : \{st.peek()}");
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.pop();
        st.pop();
    }
}
