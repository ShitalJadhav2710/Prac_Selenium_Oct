package Practics;

import java.util.HashSet;
import java.util.Iterator;

public class hash_ex 
{
	public static void main(String[] args)
	{
		
		HashSet hs=new HashSet();
		
		hs.add(100);
		hs.add("abc");
		hs.add(null);
		hs.add(200);
		hs.add("xyz");
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		System.out.println(hs.contains(100));
		
		hs.remove(100);
		System.out.println(hs);
		
		hs.add("pqr");
		System.out.println(hs);
		
	
		System.out.println("...using Iterator ....");

		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("...using foreach ....");
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		
		
		
		
		
	}

}
