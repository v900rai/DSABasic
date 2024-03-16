package StacksINJava;

import java.util.Stack;

public class stacks {
    public static void main(String []args){
        Stack<Integer> st=new Stack<>();
        st.push(100);
        st.push(200);
        st.push(300);
        System.out.println(st);
        st.push(400);
        System.out.println(st);
    }
}
