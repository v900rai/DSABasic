package NumberProgram;

import java.util.Scanner;

public class SumOfOddElementsOfAnArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
		for(int i=0; i<=arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}
		 for(int i=0; i<=arr.length; i++)
		 {
			 sum=sum+arr[i];	 
		 }
		System.out.println(sum);
		
	}
	
}