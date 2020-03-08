package seleniumclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	WebElement selectTag=	driver.findElement(By.id("day"));
		
	Select select = new Select(selectTag);
		/*
		 * select.selectByIndex(4); select.selectByValue("31");
		 * select.selectByVisibleText("20");
		 */
	
		/*
		 * List<WebElement> options = select.getOptions();
		 * 
		 * for(WebElement option: options) { System.out.println(option.getText()); }
		 */
		/*
		 * List<WebElement> option=
		 * driver.findElements(By.xpath("//select[@id='day']/option"));
		 * 
		 * for(WebElement opt: option) { System.out.println(opt.getText());
		 * 
		 * if(opt.getText().equals("31")) { opt.click(); } }
		 * 
		 */
	
		
	//select.deselectByIndex(20);
	//System.out.println(select.isMultiple());
		
	}
}


//isMultiple()
//selectByIndex
//selectByValue
//SelectByVisibleText