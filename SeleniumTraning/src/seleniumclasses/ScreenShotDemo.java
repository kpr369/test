package seleniumclasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	
		
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

		driver.get("https://www.facebook.com/");

			TakesScreenshot ts = ((TakesScreenshot)driver);
			File file = ts.getScreenshotAs(OutputType.FILE); //temp location
			FileUtils.copyFile(file, new File("C:\\Users\\Varsha\\Downloads\\ts"+new SimpleDateFormat("dd-MM-YY-mm-ss").format(new Date())+".jpeg"));
	}
}
