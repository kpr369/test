package testng;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttributes {

	@Test(description = "TestDemo", enabled = true, dependsOnMethods = "testMethod2", timeOut = 30)
	public void testMethod1() throws InterruptedException {
		System.out.println("HEllo");

	}

	@Test (priority=0, invocationCount=5, invocationTimeOut=30 )
	public void testMethod2() throws InterruptedException
	{
		//Thread.sleep(10000);
	System.out.println("Method2");	
	}

}
