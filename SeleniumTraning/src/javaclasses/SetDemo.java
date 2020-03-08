package javaclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList();
	
		
		
		list.add("Hyd");
		list.add("Chennai");
		list.add("kerala");
		list.add("Karnataka");
		list.add(3,"India");
		list.add("Hyd");
		
		
		
		
		Set<String> set = new HashSet<String>(list);
		
	
		
		Iterator ite = set.iterator();
		
		while(ite.hasNext())
		{
			ite.next();
			ite.remove();
		}
		System.out.println(set);
		
		/*
		 * System.out.println(set.add("ABC")); System.out.println(set.add("ABC"));
		 */
		/*
		 * System.out.println(set);
		 * 
		 * for(String s: set) System.out.println(s);
		 * 
		 * System.out.println("A");
		 */
		
	}

}
