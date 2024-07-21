package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class GentrateIdentityMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int size=sc.nextInt();
		int [][] ide= new int[size][size];
		//MatrixUtil.printmatrix(ide);
		for(int i=0; i<ide.length; i++)
		{
			for(int j=0; j<ide[i].length; j++)
			{
				if(i==j)
				ide[i][j]=1;
					
				
			}
		}
		MatrixUtil.printmatrix(ide);
	
	}

}
