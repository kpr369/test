package javaclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://compressjpeg.com/");
		
		driver.findElement(By.xpath("//span[text()='Upload Files']")).sendKeys("Z:\\Selenium.jpg");
		
		String path = "Z:\\Selenium.jpg";
		
		StringSelection ss = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //Copy Cntl+C
		
		Robot robot = new Robot();
		
		Thread.sleep(6000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		
		

}
}