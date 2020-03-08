package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
}
