package DSA;
import java.util.Scanner;
public class arrayFindelementinanArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int arr[]= new int [num];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int dx=-1;
		int data=sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==data)
			{
				dx=i;
				break;
			}
		}
		System.out.println(dx);
		
		
	}

}
