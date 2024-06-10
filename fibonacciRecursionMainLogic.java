package RecursionAllProgram;

public class fibonacciRecursionMainLogic {
    public static int fibonacci(int n){
        if(n<=1){
            return 1;
        }
        int firstNumber=fibonacci(n-1);
        int SecondNumber=fibonacci(n-2);
        return firstNumber+SecondNumber;

    }
    public static void main(String []args){
        int n=5;
        System.out.println(fibonacci(n));
    }
}
