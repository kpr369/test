package seleniumclasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Softwares\\\\Selenium Softwares\\\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		
		String mainWindow = driver.getWindowHandle(); //default window name 
		
		Set <String> allWindows = driver.getWindowHandles(); //all window names genpact,tech, naukri
		
		/*
		 * for(String windowName :allWindows )
		 * 
		 * { driver.switchTo().window(windowName); String title = driver.getTitle();
		 * 
		 * if(title.equals("Genpact")) { driver.close(); break; } }
		 */
		
		for(String windowName :allWindows)
		{
			if(windowName.equals(mainWindow))
			{
				continue;
			}else
			{
				driver.switchTo().window(windowName);
				driver.close();
			}
			
		}

		
		
}

}
