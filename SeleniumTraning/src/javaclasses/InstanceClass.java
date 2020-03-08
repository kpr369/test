package javaclasses;

public class InstanceClass {

//instance block	
	
		static int i =0;
	
	{
		i++;
		System.out.println("Instance Block ");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		InstanceClass ic = new InstanceClass();	
		InstanceClass ic1 = new InstanceClass();	

		InstanceClass ic11 = new InstanceClass();	
		InstanceClass ica = new InstanceClass();	
		InstanceClass icaa = new InstanceClass();	
		InstanceClass icv = new InstanceClass();	
		InstanceClass iccv= new InstanceClass();	
		InstanceClass icdsaf = new InstanceClass();	
		InstanceClass icasf = new InstanceClass();	
		InstanceClass icaf = new InstanceClass();	
		InstanceClass icadf = new InstanceClass();	
		InstanceClass icadfa = new InstanceClass();	
		InstanceClass icasfa = new InstanceClass();	
		InstanceClass icsadf = new InstanceClass();	
		InstanceClass icafds = new InstanceClass();	
		InstanceClass icew = new InstanceClass();	
		InstanceClass icrwe = new InstanceClass();	

		System.out.println("Number of Objects:\t"+i);

	}
	
	public InstanceClass()
	{
		System.out.println("Constructer");
	}
	
	void m1()
	{
	}
}
