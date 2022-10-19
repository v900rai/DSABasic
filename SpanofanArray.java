package DSA;
import java.util.Scanner;
public class SpanofanArray 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		int span=max-min;
		System.out.println(span);
		
		
		
		
	}

}
/*Enter the two number
5 input 
2 min
3
4
5
6max
4 diffance
*/

