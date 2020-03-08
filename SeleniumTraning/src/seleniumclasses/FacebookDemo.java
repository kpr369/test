package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.name("firstname")).isEnabled());
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Java");
		
		
		WebElement ele= driver.findElement(By.name("sex"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		ele.click();
		System.out.println(ele.isSelected());
		
		String getText = driver.findElement(By.xpath("//button[@name='websubmit']")).getText();
		System.out.println(getText);
		
		String value = driver.findElement(By.name("firstname")).getAttribute("value");
		
		System.out.println(value);
	}

}
