package Practics;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set 
{
	public static void main(String[] args) 
	{
		
		TreeSet ts=new TreeSet();
		
		ts.add(100);
		ts.add(200);
		ts.add(300);
		System.out.println(ts);
		
		ts.add(400);
		System.out.println(ts);
		
		ts.remove(200);
		System.out.println(ts);
		
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.contains(300));
		
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		
		System.out.println("...using iterator....");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ts.clear();
		System.out.println("...using for...");
		for(Object obj:ts)
		{
			System.out.println(obj);
		}
		
		
		
	}

}
