package DSA;

public class reversString
{
	public static void main(String []args)
	{
		String s1="vishalrai";
		String rev="";
		System.out.println("orijanl String" +s1);
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Revers String" +rev);
		
		
	}

}
