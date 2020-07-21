package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertBoxHandling {
	
	public static WebDriver driver;
	@BeforeClass
	public void browserLaunch() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
	}
	@Test
	public void alertBox() throws InterruptedException {
		driver.findElement(By.id("alertButton")).click();
		Alert alt =  driver.switchTo().alert();
		
		// to get the message of Alert
		String actualAltMsg = alt.getText();
		String expectedAltMsg = "You clicked a button";
		Assert.assertEquals(actualAltMsg, expectedAltMsg);
		
		Thread.sleep(2000);
		alt.accept();//Click on OK button
	}
	
	@Test
	public void confirmBox() throws InterruptedException {
		driver.findElement(By.id("confirmButton")).click();
		Alert alt =  driver.switchTo().alert();
		
		// to get the message of Alert
		String actualAltMsg = alt.getText();
		String expectedAltMsg = "Do you confirm action?";
		Assert.assertEquals(actualAltMsg, expectedAltMsg);
		
		Thread.sleep(2000);
		alt.dismiss();//Click on Cancel button
	}
	
	@Test
	public void promptBox() throws InterruptedException {
		driver.findElement(By.id("promtButton")).click();
		Alert alt =  driver.switchTo().alert();
		
		// to get the message of Alert
		String actualAltMsg = alt.getText();
		String expectedAltMsg = "Please enter your name";
		Assert.assertEquals(actualAltMsg, expectedAltMsg);
		
		Thread.sleep(2000);
		alt.sendKeys("PromptBox");
		alt.accept();
	}

}
