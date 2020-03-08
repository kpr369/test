package javaclasses;

public class ExceptionHandler {
	
	public static void main(String[] args) {
			
		
		
		try
		{
		System.out.println(5/0);
		System.out.println("Hello");
		}catch(ArithmeticException ne)
		{
			System.out.println("Exception Handler");
			try
			{
			System.out.println(5/0);
			}catch(ArithmeticException ae)
			{
				
			}
		}finally
		{
			System.out.println("Finally block"); //
		}
		
		System.out.println("Hi");
	}

}
