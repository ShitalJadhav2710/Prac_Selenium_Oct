package Practics;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_hashset
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(100);
		lhs.add("abc");
		lhs.add("xyz");
		lhs.add(200);
		lhs.add(500);
		lhs.add(null);
		System.out.println(lhs);
		
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.size());
		System.out.println(lhs.contains("abc"));
		
		lhs.add("shital");
		System.out.println(lhs);
		
		lhs.remove(200);
		System.out.println(lhs);
		
		
		System.out.println("...using Iterator....");
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("...using foreach");
		for(Object obj:lhs)
		{
			System.out.println(obj);
		}
		
	}

}
