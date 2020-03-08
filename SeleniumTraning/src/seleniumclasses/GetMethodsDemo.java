package seleniumclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Softwares\\\\Selenium Softwares\\\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		String title = driver.getTitle();
		//System.out.println(driver.getTitle());
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getPageSource());
		/*
		 * if(title.equals("jQuery")) { System.out.println("Test case passed"); }else {
		 * System.out.println("Test case failed"); }
		 */		
		//driver.close();
		driver.quit();
	}

}



//ctrl+Shift+O