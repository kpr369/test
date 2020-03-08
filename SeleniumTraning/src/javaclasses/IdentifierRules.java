package javaclasses;

public class IdentifierRules {

	
	static int javaWorld = 32; 
	
	static int abc []= {33};
	
	static int test(int[] a)
	{
		
		return a[0]+a[1];
	}
	
	public static void main(String[] args) {
		
		test(abc); 
		System.out.println(javaWorld);
		System.out.println(abc);

	}
	
	public void testMethod() //instance
	{
		
	}
	
	
	public IdentifierRules()
	{
		
	}
	
	public IdentifierRules(int a)
	{
		
	}
}
