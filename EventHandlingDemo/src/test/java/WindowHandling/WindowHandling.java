package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	WebDriver driver;
	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	}
	
	@Test
	public void NewWindow() {
		driver.findElement(By.id("windowButton")).click();
	
	
	
	//to get parent window
	String parentWin = driver.getWindowHandle();
	
	//to get parent and child window
	Set<String> handles = driver.getWindowHandles();
	
	//to remove the parent window
	handles.remove(parentWin);
	System.out.println(handles);
	

	}
	
}
