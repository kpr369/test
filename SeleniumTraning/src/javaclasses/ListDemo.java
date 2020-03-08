package javaclasses;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	static List<String> list;
	public static void main(String[] args) {
		
		
		 list = new ArrayList();
	
		
		list.add("Hyd");
		list.add("Chennai");
		list.add("kerala");
		list.add("Karnataka");
		list.add(3,"India");
		list.add("Hyd");

		/*
		 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i)); }
		 */
		
		for(String s :list)
			System.out.println(s);
		
		list.remove(0);
		list.remove("Chennai");
		System.out.println(list);
	}

	

}
