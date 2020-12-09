package Practics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class remove_duplicate 
{
	public static void main(String[] args) 
	{
		
		LinkedList ll=new LinkedList();
		
		ll.add(500);
		ll.add(200);
		ll.add(100);
		ll.add(400);
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		System.out.println(ll);

		HashSet hs=new HashSet(ll); // remove duplicate & inseration order not maintain
		System.out.println(hs);
		
		// remove duplicate & inseration order maintain
		LinkedHashSet hs1=new LinkedHashSet(ll);
		System.out.println(hs1);
		
		//remove duplicate & maintain ascending order
		TreeSet ts=new TreeSet(ll);
		System.out.println(ts);
		
	}

}
