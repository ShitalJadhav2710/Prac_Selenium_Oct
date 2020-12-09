package Practics;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist_ex 
{
	public static void main(String[] args) 
	{
		LinkedList link=new LinkedList();
		
		link.add("12");
		link.add(12.65);
		link.add("shital");
		link.add("jadhav");
		
		System.out.println(link.get(0));
		
		link.set(1, 15);
		
		System.out.println(link);
		
		System.out.println(link.contains(12.50));
		
		link.add("nilesh");
		System.out.println(link);
		
		link.add(0, 10);
		System.out.println(link);
		link.remove(0);
		System.out.println(link);
		link.removeFirst();
		System.out.println(link);
		
		System.out.println(".....using Iterator .......");
		
		Iterator itr=link.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println(".....Using ListIterator");
		
		ListIterator litr=link.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("....using For loop.....");
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i));
			
		}
		System.out.println("....using foreach loop....");
		for(Object obj:link)
		{
			System.out.println(obj);
		}
		
		
		
		
		
	}

}
