package DSA;

import java.util.Scanner;
public class ReverseNumber 
{
	public static void main(String []args)
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		while(number>0)
		{
			int digit=number%10;
			number=number/10;
			System.out.print(digit);
		}
	}

}
