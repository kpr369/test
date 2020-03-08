package seleniumclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[] args) {
		
		/*
		 * System.setProperty("webdriver.ie.driver", "Z:\\IEDriverServer.exe");
		 * 
		 * DesiredCapabilities dc = new DesiredCapabilities();
		 * dc.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		 * dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		 * 
		 * 
		 * 
		 * WebDriver driver = new InternetExplorerDriver(dc);
		 */
		
		

		System.setProperty("webdriver.chrome.driver",
				"Z:\\Softwares\\Selenium Softwares\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");

		WebDriver driver = new ChromeDriver(options);
	}
	}

