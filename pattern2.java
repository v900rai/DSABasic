package allProgram;

public class pattern2 
{
	public static void main(String []args)
	{
		int num=5;
		int n=2;
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				System.out.print(n+" ");
				n=n+2;
			}
			System.out.println();
		}
	}

}
