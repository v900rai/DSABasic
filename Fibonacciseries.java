package JavaInterViewProgram100VVI;

public class Fibonacciseries {
    public static void main(String[] args) {
        // 0 1 1 3 4 7 11 18
        int a = 0;
        int b = 1;
        int c;
        int num = 10;
        System.out.print(a + " " + b); // print the value
        for (int i = 2; i < num; i++) ;
        {
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;


        }
    }
}
