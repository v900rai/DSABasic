package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class Demo2DArray ///searching
{
	public static void main(String[] args) 
	{
		
		int[][] a=MatrixUtil.intializeMatrix();
		MatrixUtil.printmatrix(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elment");
		
		int ele=sc.nextInt();
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				if(ele==a[i][j])
				{
					System.out.println("element is present at"+i+ j+"index");
				}
			}
		}
		
	}

}
