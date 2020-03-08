package seleniumclasses;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo2 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		int date = new Date().getDate()+2;
		
		driver.findElement(By.xpath("(//table)[1]//tbody//tr//td/a[text()="+date+"]")).click();
}

}
