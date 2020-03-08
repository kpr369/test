package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Z:\\\\Softwares\\\\\\\\Selenium Softwares\\\\\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://jqueryui.com/droppable/");
	Thread.sleep(3000);
driver.navigate().refresh();

driver.get("https://www.facebook.com/");

driver.navigate().back(); //JQury page

driver.navigate().forward(); //facebook page
	Actions actions = new Actions(driver);
	//actions.moveToElement(driver.findElement(By.xpath("//a[text()='Contribute']"))).perform();
	//actions.contextClick(driver.findElement(By.xpath("//a[text()='Contribute']"))).perform();
	//actions.cont
	//actions.doubleClick(driver.findElement(By.xpath("//a[text()='Contribute']"))).perform();
		/*
		 * driver.switchTo().frame(driver.findElement(By.xpath("//iframe"))); WebElement
		 * source = driver.findElement(By.id("draggable")); WebElement target =
		 * driver.findElement(By.id("droppable")); //actions.dragAndDropBy(source,
		 * 500,300).perform();
		 * //actions.clickAndHold(source).moveToElement(target).release().perform();
		 * actions. driver.switchTo().defaultContent();
		 * driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		 */
	
		WebElement ele = driver.findElement(By.name("s"));
		//actions.keyDown(Keys.SHIFT).sendKeys(ele,"hello").keyUp(Keys.SHIFT).perform();
		//ele.sendKeys("hghjg");
		
		
}
}
