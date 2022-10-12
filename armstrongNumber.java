package August;
import java.util.Scanner;
public class armstrongNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int ram=0, c;
		c=number;
		while(number>0)
		{
			int rem=number%10;
			ram=(rem*rem*rem)+ram;
			number=number/10;
		}
		if(c==ram)
		{
			System.out.println("armastrong number");
		}
		else {
		System.out.println("it is not amstrng number");
		}
	}

}
