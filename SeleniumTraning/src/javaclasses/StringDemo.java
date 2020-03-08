package javaclasses;

public class StringDemo {
	
	public static void main(String[] args) {
		
		
		String ab = new String("Welcome Java");
		
		String a = "HELLO ";
		String b = new String("hello");
		String c = "hello";
		
		//System.out.println(a.trim().length());
		
		String words[] = ab.split(" ");
		
		for(String word: words)
		{
			System.out.println(word);
		}
		
	
	}

}
