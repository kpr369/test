package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionsDemo {

	
	// Assertion validaiton 
	
	//Hard Assert
	//Soft Assert

	SoftAssert assertion = new SoftAssert();
	
	@Test
public void test()
{
		
		System.out.println("Test1");
		
		assertion.assertEquals(true, false);
		System.out.println("Test2");
		System.out.println("Test3");
		assertion.assertEquals(true, false);
		System.out.println("Test4");
		System.out.println("Test5");
		assertion.assertTrue(false);

		System.out.println("Test6");
		System.out.println("Test7");
		
		assertion.assertAll();
		
	/*System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	String title = driver.getTitle();
	//Assert.assertTrue(false,"Not matched");
	assertion.assertTrue(false);
	System.out.println(driver.getCurrentUrl());
	
	
	*///Assert.assertEquals(title, "Google1");
	//Assert.assertEquals(title, "Google1","Title is not matched");
	
}
}
