package seleniumclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictiWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"Z:\\Softwares\\Selenium Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		/*
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.name("qq")));
		 * driver.findElement(By.name("qq")).click();
		 */
		//wait.until(ExpectedConditions.alertIsPresent());
		//driver.findElement(By.name("qqq")).click();
		//wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		//wait.until(ExpectedConditions.attributeContains(By.name("q"), "type", "text"));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input")))).click();
		//wait.until(ExpectedConditions.titleContains(title))
	}
}
