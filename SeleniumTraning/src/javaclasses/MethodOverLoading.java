package javaclasses;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		
		add(5); //Argument
		
	}

	public static void add(int a)  //parameters
	{
		System.out.println("Hello");
	}
	
	public static void add()
	{
		System.out.println("Hi");
	}
	
	
	/* Rules
		
		1. 2 or more methods can have same name diffett signature
		2. Return type not considered
		3. Through single class we can achive method overloading
		4. Method Signature = Method Name + Parameters
		
		
		
		Parameters 
		Arguments
	*/
	
}
