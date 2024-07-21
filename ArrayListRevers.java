package edu.jspider.heca48.twoD.Array;

import java.util.ArrayList;

public class ArrayListRevers 
{
	public static void reversList(ArrayList<Integer> List)
	{
		int i=0, j=List.size()-1;
		while (i<j)
		{
			Integer temp=Integer.valueOf(List.get(i));
			List.set(i, List.get(j));
			List.set(j, temp);
			i++;
			j++;
			
			
		}
			
		
		
	}
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList();
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(33);
		list.add(19);
		System.out.println("Orijinal list"+list);
		reversList(list);
		System.out.println("Revers List"+list);
		
	}

}
