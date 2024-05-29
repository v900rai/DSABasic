package selfpractices;
import java.io.*;

public class Excepations {
    //program to print the exception information using printStackTrace() method




        public static void main (String[] args) {
            int a=5;
            int b=0;
            try{
                System.out.println(a/b);
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
        }
    }


