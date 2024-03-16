package StacksINJava;

import java.util.Scanner;
import java.util.Stack;

public class copyToAnotherStack {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        //reversd order
        Stack<Integer> rt= new Stack<>();
        while (st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);

    }
}
