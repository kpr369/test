package javaclasses;

public class Child extends Parent{
	int a = 50;
	
	public static void main(String[] args) {
		
		
		Parent c = new Child(); // upcasting
		
		c.green();
	}
	
	public void testMethod() //singleton
	{
		int a =45;
		
		System.out.println(a);
	}
	
	private Child() // constructor
	{
		
	}
	
	public void green()
	{
		System.out.println("Child Class");
	}
	
	/*
	 * Child(int a) {
	 * 
	 * }
	 * 
	 * Child(String a) {
	 * 
	 * }
	 */
	
}
