package selfpractices;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class CeilAndFloorPrintValue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ceil and floor value");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr[i] ; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the data value");
        int data=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int ceil=0;
        int floor=0;
        while (low<high){
            int mid=(low+high)/2;
            if(data<arr[mid]){
                high=mid-1;
                ceil=arr[mid];
            }
            else if(data>arr[mid]){
                low=mid+1;
                floor=mid+1;
            }
            else{
                ceil=mid-1;
                floor=mid+1;
                break;
            }

        }
        System.out.println("ceil "+ceil);
        System.out.println("floor "+floor);
    }
}
