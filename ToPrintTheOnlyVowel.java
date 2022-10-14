package DSA;

public class ToPrintTheOnlyVowel 
{
	public static void main(String []args)
	{
		String str="DINGA";
		for(int i=0; i<=str.length()-1;  i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U' )
			{
				System.out.println(str.charAt(i));
			}
		}
	}

}
