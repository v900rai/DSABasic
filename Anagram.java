package NumberProgram;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args)
	{
		String str1="Vishal";
		String str2="Lahsiv";
		///decler to the string
		/// now i am converting to lowercase
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//Checking for the length of strings 
		if(str1.length()!=str2.length())
		{
			System.out.println("Both the strings are not anagram ");
		}
		else
		{
			//Converting both the arrays to character array
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			
			////Sorting the arrays using in-built function sort ()  
			 Arrays.sort(string1); 
			 Arrays.sort(string2);
			 /// compariling the values
			 if(Arrays.equals(string1, string2) == true)
			 {
				 System.out.println("both are anagram");
				 
			 }
			 else
			 {
				System.out.println("both are not string in anagram");
			 }
		}
		
	}

}
