package StacksINJava;

import java.util.Scanner;
import java.util.Stack;

public class UserInput {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the number element you want insert element");
        int n=sc.nextInt();
        System.out.println("Enter the element :");

        for(int i=1; i<=n; i++) {

            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }

}
