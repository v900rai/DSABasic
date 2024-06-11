package RecursionAllProgram;

public class firstRecursionProgram {
    // print the number 5 to 1

    public static  void printNumber(int n){
        if(n==6){
            return ; // base  case
        }
        System.out.print(n +" "); // print

        printNumber(n+1); // recursion
    }

    public static void main(String[] args) {
        int num=1;
        printNumber(num);
    }
}
