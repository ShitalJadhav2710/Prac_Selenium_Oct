package Practics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrayliat_ex 
{
	
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		
		ar.add("abc");
		ar.add(12);
		ar.add("xyz");
		ar.add(10.20);
		
		System.out.println(ar);
		
		System.out.println(ar.isEmpty()); // false
		
		System.out.println(ar.size()); // 4
		
		ar.add(1, "XYZ");
		System.out.println(ar);
		
		ar.remove(1);
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		
		System.out.println(ar.contains("XYZ"));
		
		
		ar.set(2, "ABC");
		System.out.println(ar);
		
		ar.add("shital");
		System.out.println(ar);
		
		System.out.println("..........By using Iterator Class......");
		Iterator itr= ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println(".......By using for loop.........");
		for(int i=0;i<=ar.size()-1;i++)
		{
			
			System.out.println(ar.get(i));
		}
		
		System.out.println("....By using ListIterator........");
		ListIterator litr=ar.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
			
		}
		
		System.out.println("....using foreach .....");
		for(Object o:ar)
		{
			System.out.println(o);
		}
	}

}
