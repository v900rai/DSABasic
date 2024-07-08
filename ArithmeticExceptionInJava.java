package July2024;

public class ArithmeticExceptionInJava {
    public static void main(String args){
        try{

        int a=10;
        int b=0;
        int c=a/b;
            System.out.println("result  "+c);

        }
        catch (ArithmeticException e){
            System.out.println ("Can't divide a number by 0");

    }
    }
}
