package edu.jspider.heca48.twoD.Array;

public class ExcepationHandling
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello start");
		try
		{
		int a=10, b=0, c;
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException  e) {
			System.out.println("haidele the program");
		System.out.println("End the program");
			
		}
		
	}

}
