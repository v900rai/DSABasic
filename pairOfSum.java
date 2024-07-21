package edu.jspider.heca48.twoD.Array;
import java.util.*;
public class pairOfSum 
{
	static int pairSum(int arr[], int target)
	{
		int n=arr.length;
		int ans=0;
		{
			for(int i=0; i<n; i++)// frist number
			{
				for(int j=i+1; j<n; j++)// second number
				{
					if(arr[i] + arr[j] ==target)
					
					ans++;
				}
			}
		}
		return ans;
		
		
	}
	public static void main(String []vishalrai)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter"+size+"Elements");
		
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target number");
		int target=sc.nextInt();
		System.out.println(pairSum(arr, target));
	}
}
