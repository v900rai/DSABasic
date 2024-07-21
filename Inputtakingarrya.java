package edu.jspider.heca48.twoD.Array;
import java.util.*;
public class Inputtakingarrya 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the"+n+" element");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		/*		// tring to copy arr to arr-2;
		int arr2[]=arr;
		System.out.println(" copy arry");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
						
				*/
	}

}
