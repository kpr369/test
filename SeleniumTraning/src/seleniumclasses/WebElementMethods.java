package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Softwares\\\\Selenium Softwares\\\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		
		ele.sendKeys("Seleniumm");
		
		Thread.sleep(3000);
		
		ele.clear();
		System.out.println("textbox text"+ ele.getText());
		System.out.println(ele.getAttribute("title"));
		System.out.println(ele.getTagName());
		
		
		String text = driver.findElement(By.name("btnK")).getText();
		System.out.println(text);
		
	WebElement gmail= 	driver.findElement(By.xpath("//a[text()='Gmail']"));
		System.out.println(gmail.getTagName());
		System.out.println(gmail.getText());
		System.out.println(gmail.isDisplayed());
		System.out.println(gmail.isEnabled());
		System.out.println(gmail.isSelected());

		gmail.click();		
	driver.quit();
}

}
