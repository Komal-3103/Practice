package PageObjectModelproj.PageObjectModelpkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

import com.qa.orghrm.utility.DriverWaits;
import com.qa.orghrm.utility.ReadConfigProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	BasePage basepage;
	LoginPage loginPage;
	
	
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		String browserName=ReadConfigProperties.getConfigProp("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		String waitTime = ReadConfigProperties.getConfigProp("implicitWaitTime");
		int time = Integer.parseInt(waitTime);
		DriverWaits.getimpWaitTime(driver, time);
		
	    
	    driver.get(ReadConfigProperties.getConfigProp("appurl"));
	    basepage = new BasePage(driver);
	    loginPage = new LoginPage(driver);
	    
	    
	}

}
