package javaclasses;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		
		map.put(1, "ABC");
		map.put(2, "ABCD");
		map.put(3, "ABC");
		map.put(4, "ABCD");
		
		System.out.println(map);
		
		
	//	System.out.println(map.get(2));
		//System.out.println(map.size());
		
		//System.out.println(map.containsKey(5));
				//System.out.println(map.containsValue("ABCDEF"));
				map.remove(4);
				System.out.println(map);
	}

}
