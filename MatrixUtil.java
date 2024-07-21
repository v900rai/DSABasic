package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class MatrixUtil
{
	public static int[][] intializeMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		System.out.println("enter the coloum value");
		int column=sc.nextInt();
		
		int[][] arr=new int[row][column];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print("enter the element at" +j+"and "+i+"index");
				arr[i][j]=sc.nextInt();
			}
		}
			return arr;
		}
	public static void printmatrix(int[][] arr)
	{
		for(int i=0;i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
