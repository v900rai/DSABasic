package DSA;
import java.util.Scanner;

public class arrayBarChart 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int max= arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int floor=max; floor>=1; floor-- )
		{
			for(int i=0; i<=arr.length; i++)
			{
				if(arr[i]>=floor)
				{
					System.out.print("*");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println();
			
			
			
		}
		
		
	}

}
