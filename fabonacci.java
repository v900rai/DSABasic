package selfpractices;

import JavaInterViewProgram100VVI.Fibonacciseries;

public class fabonacci {
    public static void fabonnicSeries(int N){
        int num1=0;
        int num2=1;
        for(int i=0; i<N; i++){
            System.out.println("Nums "+num1);
            // sawp
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }


    }
 // Driver Code
public static void main(String args[])
{
    // Given Number N
    int N = 10;
    fabonnicSeries(N);



}
}

