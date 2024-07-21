package edu.jspider.heca48.twoD.Array;

import java.util.Scanner;

public class findUnique 
{
	static int FindUnique(int[] arr)
	{
		int n=arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		int ans=-1;
		for(int i=0; i<n; i++)
		{
			if(arr[i]>0)
			{
				ans=arr[i];
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
		//System.out.println("Enter the target sum");
		//int target=sc.nextInt();
		System.out.println("Unique element"+FindUnique(arr));
	}

}
/*Enter the Size5
Enter5Element
1
2
3
2
3
Unique element1
*/