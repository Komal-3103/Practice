package Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderMovement {
	WebDriver driver;
	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/slider");
	}

	public void MovementOfSlider() {
		Actions act = new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		
		act.dragAndDropBy(slider,0,100).perform();
		
		
	}
}
