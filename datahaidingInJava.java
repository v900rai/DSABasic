package javaInterviewProgram;

public class datahaidingInJava 
{
	private int a=10;
	private int b=20;
	
	public int getA()
	{
		return a;
		
	}
	public int getB()
	{
		return b;
	}
	public int setA(int a)
	{
		return this.a=a;
	}
	public int setB(int b)
	{
		return this.b=b;
	}

public static void main(String[] vishal)
{
	datahaidingInJava a1=new datahaidingInJava();
	System.out.println(a1.getA());
	System.out.println(a1.getB());
	System.out.println();
	a1.setA(100);
	a1.setB(200);
	System.out.println(a1.getA());
	System.out.println(a1.getB());
}
}
