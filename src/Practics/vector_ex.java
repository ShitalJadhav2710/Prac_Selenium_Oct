package Practics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector_ex
{
	public static void main(String[] args) 
	{
		
		Vector v=new Vector();
		
		v.add(12);
		v.add("shital");
		v.add(15.23);
		v.add("jadhav");
		
		System.out.println(v);
		
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		System.out.println(v.get(2));
		
		v.set(0, "Amol");
		
		System.out.println(v);
		v.add("abc");
		
		System.out.println(v);
		v.add(2, 111);
		System.out.println(v);
		
		v.remove(5);
		System.out.println(v);
		
		System.out.println(v.contains("jadhav"));
		
		System.out.println("..Using Iterator......");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("..Using foreach loop......");
		for(Object obj:v)
		{
			System.out.println(obj);
			
		}
		
		System.out.println("..Using for loop......");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
			
		}
		System.out.println("..Using Enumeration class......");
		
		Enumeration en=v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		System.out.println("..Using ListIterator......");
		
		ListIterator litr=v.listIterator();
		
		while(litr.hasNext())
		{
			
			System.out.println(litr.next());
		}
	}

}
