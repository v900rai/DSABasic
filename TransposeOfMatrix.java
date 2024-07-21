package edu.jspider.heca48.twoD.Array;

public class TransposeOfMatrix 
{
	public static void main(String[] args) 
	{
		int [][] a= MatrixUtil.intializeMatrix();
		System.out.println("Original matrix");
		MatrixUtil.printmatrix(a);
		
		int[][] trnaspose = new int [a.length][a[0].length];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				trnaspose[i][j]=a[j][i];
			}
		}
		System.out.println("Trnaspose  matrix");
		MatrixUtil.printmatrix(trnaspose);
		
	}

}
