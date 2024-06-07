package selfpractices.InterviewOnly;

import java.util.Scanner;

public class SpanArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0; i<arr.length; i++){
           arr[i]= sc.nextInt();
        }
        //int max=Integer.MIN_VALUE;
        //int min=Integer.MAX_VALUE;
        int max=arr[0];

        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                arr[i]=min;
            }
        }
        int span=max-min;
        System.out.println(" Span Ararys "+span);
    }
}
