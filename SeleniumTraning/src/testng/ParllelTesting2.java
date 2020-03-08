package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParllelTesting2 {

	@Test
	public void m2()
	{
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Method M2");
		System.out.println(Thread.currentThread().getName());
	}

}
