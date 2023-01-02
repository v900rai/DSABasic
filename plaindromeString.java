package DSA;

public class plaindromeString 
{
	public static void main(String []args)
	{
		
	
	String s1="VIVIV";
	String rev=" ";
	for(int i=s1.length()-1; i>=0; i--)
	{
		rev=rev+s1.charAt(i);	
	}
	if(s1.equals(rev))
	{
		System.out.println(rev+"it is palindrome");	
	}
	else
		System.out.println(rev+"it is not plaindrome ");
}
}
