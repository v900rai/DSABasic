package edu.jspider.heca48.twoD.Array;
/// Given 2 integer a and b .swap the 2 given value using .sum of difference  methods.
public class swapWithoutTemp
{

	public static void main(String []args)
	{
		int a=9;
		int b=10;
		
		swapnumber(a,b);
	}
	
	
	public static void swapnumber(int a, int b)
	{
		System.out.println("Orijinal value before swap");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		System.out.println("After the sawping values");
		
		 a=a+b;
		 b=a-b;
		 a=a-b;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
	}
	

}
