package PageObjectModelproj.PageObjectModelpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	private By welcmLink = By.id("welcome");
	private By logOutLink = By.linkText("Logout");
	private By dashBrdHeading = By.xpath("//h1[contains(text(),'Dashboard')]");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getWelcmLink() {
		return getElement(welcmLink);
	}

	public WebElement getLogOutLink() {
		return getElement(logOutLink);
	}
	

	public String homePageHeading() {
		return pageHeading(dashBrdHeading).getText();
	}
	

	public void logOut() {
		getWelcmLink().click();
		getLogOutLink().click();
	}

}
