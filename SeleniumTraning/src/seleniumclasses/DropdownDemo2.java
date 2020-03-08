package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo2 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	
	Select select = new Select(driver.findElement(By.id("selenium_commands")));
	System.out.println(select.isMultiple());
	
	select.selectByVisibleText("Switch Commands");
	//select.selectByVisibleText("Wait Commands");
	
	select.deselectByVisibleText("Wait Commands");
	
	}
}
