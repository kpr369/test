package seleniumclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWait {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"Z:\\Softwares\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("qq")).click();

		
		

		
	}
}
