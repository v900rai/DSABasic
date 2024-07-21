package edu.jspider.heca48.twoD.Array;

public class swapInArrays 
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
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
	}

}
