package edu.jspider.heca48.twoD.Array;

public class identityMatrix 
{
	public static void main(String[] args) 
	{
		int [][] a=MatrixUtil.intializeMatrix();
		//int[][] a= {{1,0,0,0},{0,1,0,0},{0,0,1,0}};
		MatrixUtil.printmatrix(a);
		System.out.println("principle Diagolnal elements");
		int otherElecount=0;
		int princElecount=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(i==j)
				{
					///System.out.println(a[i][j]);
					if(a[i][j]!=1)
					{
						princElecount++;
					}
				}
				else
				{
					if(a[i][j]!=0)
					{
						otherElecount++;
					}
				}
			}
			
		}
		if(princElecount ==0&& otherElecount==0)
		{
			System.out.println(" it is diagonal matrix");
		}
		else
		{
			System.out.println("it is not diagonal");
		}
		
		
		
		
	}

}
