package garaph;

import java.util.Scanner;

public class arraysLenght 
{
	public static void main(String []args) {
		int []arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  element arrys number");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			System.out.println(" Arrays element aaryas");{
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]+" ");
				}
				System.out.println("Arrays length "+arr.length);
				
			}
		}
	
	}

}
