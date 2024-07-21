package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class array2ddarysa

{
	public static void printArrays(int[] []arr)
	{
		for(int i=0; i<arr.length; i++)//row
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr [i][j]+" ");
			}
		}
		System.out.println();
	}
	public static void  main(String []vishalrai)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int r=sc.nextInt();
		System.out.println("Enter the coloume");
		int c=sc.nextInt();
		int arr[][]=new int [r][c];
		
		System.out.println("Enter the "+r*c+"elements");
			for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
					arr[i][j]=sc.nextInt();
				}
		}
			printArrays(arr);
		
	}

}
