package allProgram;

import java.util.Scanner;

public class takingUserPattern 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the diffence number");
		int n=sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				System.out.print(n+" ");
				n=n+3;
			}
			System.out.println();
		}
	}

}
