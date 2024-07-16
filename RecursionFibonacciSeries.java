package AdvancedDataStructureInJava;

public class RecursionFibonacciSeries {
    public static void main(String args[]){
        int n = 9;
        System.out.println(
                n + "th Fibonacci Number: " + fibonacciRecursion(n));

    }
    private static int fibonacciRecursion(int n){
        if(n<=1)
            return n;
        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);


    }
}
