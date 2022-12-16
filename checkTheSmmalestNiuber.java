package NumberProgram;
import java.util.Scanner;
public class checkTheSmmalestNiuber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("cheak the min" +min);
		
	}

}
