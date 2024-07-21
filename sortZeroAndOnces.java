package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class sortZeroAndOnces 
{
	public static void printArrays(int arr[])
	{
	   int n=arr.length;
	   for(int i=0; i<n; i++)
	   {
		   System.out.println(arr[i]+" ");
	   }
	   System.out.println();
	}
	
	static void swap(int []arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void SortzeroAndOnce(int arr[])
	{
		int n=arr.length;
		int zeroes=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==0)
			{
				zeroes++;
			}
		}
		// o to zeroes -1: 0 to n-1:
		for(int i=0; i<n; i++)
		{
			if(i<zeroes)
			{
				arr[i]=0;
			}
			else {
				arr[i]=1;
			}	
		}
	}
	public static void main(String []vishal)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.print("Enter"+n+"Elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Orinijal elements ");
		printArrays(arr);
		SortzeroAndOnce(arr);
		System.out.print("sorted arrys");
		printArrays(arr);
		
	}
	

}
/*Enter the size

10
Enter10Elements1
0
1
0
0
1
0
0
1
0
Orinijal elements 1 
0 
1 
0 
0 
1 
0 
0 
1 
0 

sorted arrys0 
0 
0 
0 
0 
0 
1 
1 
1 
1 
*/

