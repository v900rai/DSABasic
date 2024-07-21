package edu.jspider.heca48.twoD.Array;

public class AsciiValueOfAllChracters 
{
	public static void main(String []args)
	{
		for(int i = 0; i <= 255; i++)  
		{  
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		break;
		} 
		for(int i = 65; i <= 90; i++)  
		{  
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		}  
	}
	/*Similarly, we can print the ASCII value of a to z by changing the loop in the above code.

	for(int i = 97; i <= 122; i++) */ 

}
