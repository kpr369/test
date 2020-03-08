package seleniumclasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Softwares\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //Browser launch
		
		driver.get("https://www.google.com/");  //Navigate to google
		
	
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
	WebElement ele = driver.findElement(By.name("q"));
	ele.sendKeys("hi");
Thread.sleep(3000);
		ele.clear();
		ele.sendKeys("Hello");
	}	
	
}
