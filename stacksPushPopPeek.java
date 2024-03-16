package StacksINJava;

import java.util.Stack;

public class stacksPushPopPeek {
    public static void main(String []args){
        Stack<Integer> sts=new Stack<>();
        sts.push(10);
        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.push(20);
        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.push(30);
        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.push(40);
        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.pop();
        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.pop();

        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.pop();
        System.out.println(sts+ "....>"+sts.peek()+" +"+sts.size());
        sts.pop();
        System.out.println(sts+ "....>"+" +"+sts.size());





    }
}
