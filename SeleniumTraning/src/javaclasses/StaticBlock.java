package javaclasses;

public class StaticBlock {
	
	
	static 
	{
		System.out.println("Static Block 1");
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		
	}
	
	static
	{
		System.out.println("Static Block");
		
	}

}
