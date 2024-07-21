package edu.jspider.heca48.twoD.Array;

public class add2Matrix 
{
	public static void main(String[] args)
	{
		int[][] a=MatrixUtil.intializeMatrix();
		int[][] b=MatrixUtil.intializeMatrix();
		System.out.println("Matrix A");
		MatrixUtil.printmatrix(a);
		System.out.println("Matrix B");
		MatrixUtil.printmatrix(b);
		
		if(a.length ==b.length && a[0].length==b[0].length)
		{
			//// addtion logic
			int[][] res=new int [a.length][a[0].length];
			for(int i=0;i<res.length; i++)
			{
				for(int j=0; j<res[i].length; j++)
				{
					res[i][j]= a[i][j]+b[i][j];/// substraction on matrix i well use as (-)
				}
			}
			System.out.println("res matrix is");
			MatrixUtil.printmatrix(res);
		}
		else 
			System.out.println("matrix is  addtion is not possible  ");
		
	}

}
