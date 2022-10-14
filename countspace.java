package August;

public class countspace 
{
	public static void main(String []rags)
	{
		String str="this is a book";
		int count =0;
		for(int i=0; i<=str.length()-1; i++)
		{
			if(str.charAt(i) !=' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);
	}

}
