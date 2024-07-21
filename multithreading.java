package edu.jspider.heca48.twoD.Array;



public class multithreading extends Thread
{
	public  void run() {

	
		try
		{
			for(int i=1; i<5; i++)
			{
				System.out.println("vishal Rai");
				Thread.sleep(1000);
			}
		}
			catch (InterruptedException i)
			{
				
			}
		}
	

		
	public static void main(String[] args) throws InterruptedException 
	{

		multithreading t=new multithreading();
		t.start();
		
		for(int i=1; i<5; i++)
		{
			System.out.println("kunj rai");
			Thread.sleep(1000);
			
		}
		
	}
}

	
	


