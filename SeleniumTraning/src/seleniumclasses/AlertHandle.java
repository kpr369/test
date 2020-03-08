package seleniumclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		/*
		 * driver.findElement(By.id("searchBtn")).click(); Alert alert =
		 * driver.switchTo().alert(); System.out.println(alert.getText());
		 * alert.dismiss(); driver.findElement(By.name("source")).sendKeys("Hyderabad");
		 */
		
		int size =driver.findElements(By.xpath("//a[@target='_top']")).size();
		 List<WebElement> ele = driver.findElements(By.xpath("//a[@target='_top']"));
		 
		 for(int i=0;i<ele.size();i++)
		 {
			if( ele.get(i).getText().equals("Ticket Status"))
			{
				ele.get(i).click();
			}
			
		 }
	}
}
