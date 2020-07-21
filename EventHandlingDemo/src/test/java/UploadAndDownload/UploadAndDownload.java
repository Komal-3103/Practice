package UploadAndDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadAndDownload {

	WebDriver driver;
	@BeforeClass
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
	}
	
	@Test
	public void UploadDownload() {
	
		//  for click the download button
		//	driver.findElement(By.id("downloadButton")).click();
		
		//  for click the upload file
		driver.findElement(By.id("//input[@id='uploadFile']")).sendKeys("E:\\MCA-III\\graphics");
	}
}
