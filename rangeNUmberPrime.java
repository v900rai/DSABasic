package JavaInterViewProgram100VVI;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class rangeNUmberPrime {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int start=sc.nextInt();
        System.out.println("Enter the second number");
        int end=sc.nextInt();
        System.out.println(start+" "+end);
        for(int i=start; i<end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }

        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
