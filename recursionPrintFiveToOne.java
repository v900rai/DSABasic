package RecursionAllProgram;

public class recursionPrintFiveToOne {
    public static void main(String[] args) {
        int n=1;
        printNumberr(n);
    }
    public static void printNumberr(int n){
        if(n==11){
            return ; //base case
        }
        System.out.print(n+" "); //printCase
        printNumberr(n+1); //recursion
    }

}
