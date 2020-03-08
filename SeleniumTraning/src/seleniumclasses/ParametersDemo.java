package seleniumclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {

	WebDriver driver;
	@BeforeMethod
	@Parameters({"browser","version"})
	void init(@Optional String browserName, String version)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
			
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("ie")) {
			 System.setProperty("webdriver.ie.driver", "Z:\\IEDriverServer.exe");
			  driver = new InternetExplorerDriver();

		}
	}
	
	@Test
	void navigateToGoogle()
	{
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	void closeBrowser()
	{
		driver.quit();
		}
	
	
}
