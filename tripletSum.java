package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class tripletSum 
{
	static int tripletSum(int arr[], int target)
	{
		int n=arr.length;
		int ans=0;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++ )
			{
				for(int k=j+1; k<n; k++)
				{
					if(arr[i] + arr[j] +arr[k]==target)
						ans++;
				}
			}
		}
		return ans;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter"+size+"Element");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target sum");
		int target=sc.nextInt();
		
		
	}

}
