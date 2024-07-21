package edu.jspider.heca48.twoD.Array;

import java.util.ArrayList;

public class ArrayListInpw 
{
	public static void main(String []vishal)
	{
		// wrapper classes
		/*Integer i=Integer.valueOf(i 4);  
		System.out.println(i);
		Float f=Float.valueOf(f 4.5);
		System.out.println(f);*/
		// ArrayList
		ArrayList<Integer> l1=new  ArrayList<>();
		 //add method 
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		
		/// get an element at index 1
		System.out.println(l1.get(1));// 6
		
		// printing the element  for the loop
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));	
		}
		// printing the arrays list directly
		System.out.println(l1);
		
		/// adding the some element at some index i
		l1.add(1 ,100);
		System.out.println(l1);
		
		//modifying element at index i
		l1.set(1, 10);
		System.out.println(l1);
		/// removing the element index i
		l1.remove(1);
		System.out.println(l1);
		
		// removing  an element e
		l1.remove(Integer.valueOf(6));
		System.out.println(l1);
		
		// checking if an element exists
		boolean ans =l1.contains(Integer.valueOf(6));
		System.out.println(ans);
		
		
		
		// if you don't specify class you can put anything inside l
		ArrayList l= new ArrayList();
		l.add("vishal");
		l.add(1);
		l.add(true);
		System.out.println(l);
		 
	}

}
