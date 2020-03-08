package javaclasses;

import java.io.File;

public class MultiCatch {

	public static void main(String[] args) throws InterruptedException {
		
		m1();
	}
	
	static void m1() throws InterruptedException 
	{
		m2();
	}
	
	static void m2() throws InterruptedException
	{
		
		m3();
}
	static void m3() throws InterruptedException
	{
		Thread.sleep(1000);  //Checked Exception

	}
}


//Checked Exception
//UnChecked Exception 


///Exception
