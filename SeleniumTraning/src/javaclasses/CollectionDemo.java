package javaclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		
		
		String[] values= {"ABC","BBC","CCC"};		
		
		List intgervalues = new ArrayList(Arrays.asList(values));
		
		System.out.println("Array Values:"+ intgervalues);
		
		List<String> list = new ArrayList<String>();
		
		list.add("ABC");
		list.add("ABC");
		list.add("XYZ");
		
		
		System.out.println(list);
	
		
		
		List list2 = new ArrayList<Integer>();
		
		//list2.add("KKK");
		
		list2.addAll(list);
		
		System.out.println(list2);
		
		
		
		List list3 = new ArrayList<>(list2);
		
		System.out.println("List 3 values"+ list3);
		
	}

}
