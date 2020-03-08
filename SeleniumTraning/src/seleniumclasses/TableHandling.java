package seleniumclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/data_sources/dom");
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.xpath("//td[text()='London']//preceding::td[2]"));
		 * 
		 * for(WebElement ele : elements) { System.out.println(ele.getText()); }
		 */
		
		int noOfRows = driver.findElements(By.xpath("(//table)[1]//tbody//tr")).size();
		
		for(int i=0;i<noOfRows;i++)
		{
			WebElement ele = driver.findElement(By.xpath("(//table)[1]//tbody//tr["+(i+1)+"]//td[3]"));
			String text = ele.getText();
			if(ele.getText().equals("London"))
			{
				String name = driver.findElement(By.xpath("(//table)[1]//tbody//tr["+(i+1)+"]//td[3]//preceding::td[2]")).getText();
				System.out.println(name);

			}
		}
	}
}
