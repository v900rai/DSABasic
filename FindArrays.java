package selfpractices.InterviewOnly;

import java.util.Scanner;

public class FindArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int index=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                index=i;
                break;
            }
        }
        System.out.println("print Index "+index);
    }
}
