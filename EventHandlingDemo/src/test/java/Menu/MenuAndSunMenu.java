package Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuAndSunMenu {

	WebDriver driver;
	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu");
	}
	
	@Test
	public void SubMenu() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Main Item 1']"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Main Item 2']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).click();
	}
}
