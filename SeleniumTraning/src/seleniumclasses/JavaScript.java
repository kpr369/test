package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Cookies']"));
		
		//js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView()", ele);
		//js.executeScript("arguments[0].click()", ele); //script mandatoru,  arg optopmn
	}
}
