package javaclasses;

public class DecisionFlow {
	
	public static void main(String[] args) {
		
		
		int avg=200;
		
		if(avg<35) //flase
		{
			System.out.println("Fail");
		}else if(avg>=35 && avg<=50)
		{
			System.out.println("third class");
		}else if(avg >=50 &&  avg<=60)
		{
			System.out.println("Second class");
		}else if(avg>=60 && avg<=75)
		{
			System.out.println("First class");
		}else if(avg>=75 && avg<=100)
		{
			System.out.println("Distinction");
		}else
		{
			System.out.println("Invalid number");
		}

	}

}
