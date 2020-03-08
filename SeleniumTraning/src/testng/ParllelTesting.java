package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParllelTesting {
	
	//Methods
	//Class Levl
	//Test Level
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
