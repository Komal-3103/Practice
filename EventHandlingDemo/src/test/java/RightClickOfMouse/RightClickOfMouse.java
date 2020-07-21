package RightClickOfMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickOfMouse {
	WebDriver driver;
	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demoq.com/buttons");
	}
	
	@Test
	public void RightClickOfMouse() {
		Actions act = new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).build().perform();
		act.doubleClick(driver.findElement(By.xpath("//button[@id='rightClickBtn']"))).build().perform();
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Click me']"))).build().perform();
		
	}

}
