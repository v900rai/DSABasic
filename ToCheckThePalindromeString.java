package DSA;

public class ToCheckThePalindromeString 
{
	public static void main(String []args)
	{
		String str="DINID";
		String rev="";
		System.out.println(str);
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(rev+" is palindrome String");
		}
		else
		{
			System.out.println(rev+" is not plaindrome number");
		}
	}

}
