package edu.jspider.heca48.twoD.Array;

public class spureOFMatrix 
{
	public static void main(String[] args)
	{
		int[][] a=MatrixUtil.intializeMatrix();
		//int[][] b=MatrixUtil.intializeMatrix();
		System.out.println("Matrix A");
		MatrixUtil.printmatrix(a);
		//System.out.println("Matrix B");
		//MatrixUtil.printmatrix(b);
		
		if(a.length==a[0].length)
		{
			System.out.println("It is square the matrix");
		}
		else
			System.out.println("It is rectangle matrix");
			
		
		
	} 

}
