package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotain {

	@Test
	@DataProvider(name = "dataProvider")
	public Object[] getdata() // return type should be array of Object
	{
		Object obj[] = new Object[3];

		obj[0] = "Selenium";
		obj[1] = "Java";
		obj[2] = "Testng";

		return obj;

	}

	@Test(dataProvider = "dataProvider")
	public void testcase(String name) {

		System.setProperty("webdriver.chrome.driver", "Z:\\Softwares\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Browser launc

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys(name);
		driver.quit();

	}
}
