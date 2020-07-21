package IframeHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandling {

    public static WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
	}
	
	@Test
	public void iFrameHandle() {
		//By index
		//driver.switchTo().frame(0);
		
		//By id or name
		//driver.switchTo().frame("frame1");
		
		//By webElement
		WebElement elm = driver.findElement(By.xpath("//iframe[contains(@src,'sample')]"));
		driver.switchTo().frame(elm);
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
	}
}
