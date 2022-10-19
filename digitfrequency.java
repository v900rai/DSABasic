package DSA;
import java.util.Scanner;

public class digitfrequency 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int d=sc.nextInt();
		int f=digitsfrequency(n, d);
	System.out.println(f);
	}
	public static int digitsfrequency(int n, int d)
	{
		int count=0;
		while(n>0)
		{
			int dig =n%10;
			n=n/10;
			if(dig==d)
			{
				count++;
			}
		}
		return count;
		
		
		
	}
}

