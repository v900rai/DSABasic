package DSA;

public class ToUpperCaseAlphaBets
{
	public static void main(String[] args)
	{
		String str="This Is My Book"; /// only count upper case alphabets only 
		for(int i=0; i<=str.length()-1; i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}

}
