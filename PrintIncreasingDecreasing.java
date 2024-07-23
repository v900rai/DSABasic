package BasicRecursion;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void main(String []args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ..>");
        int num=sc.nextInt();
        pdi(num);
    }
    public static void pdi(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);




    }
}
