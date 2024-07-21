package edu.jspider.heca48.twoD.Array;
import java.util.Scanner;
public class ShortAce 
{
	public static void main(String[] ags)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int arr[] =new int[number];
		System.out.println("Enter the number");
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("sorted array the element");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
	

}
