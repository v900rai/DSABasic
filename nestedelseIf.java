package DSA;
import java.util.Scanner;
public class nestedelseIf 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the value ");
		int value=sc.nextInt();
		if(value%2==0 && value%3==0)
		{
			System.out.println("founds value ..." +value);
		}
	}

}
