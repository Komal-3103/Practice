package PageObjectModelproj.PageObjectModelpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	By loginUsername=By.id("txtUsername");
	By loginPassword=By.id("txtPassword");
	By loginButton=By.id("btnLogin");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Encapsulation


	public WebElement getLoginUsername() {
		return getElement(loginUsername);
	}


	public WebElement getLoginPassword() {
		return getElement(loginPassword);
	}


	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	public HomePage doLogin(String username,String password) {
		getLoginUsername().sendKeys(username);
		getLoginPassword().sendKeys(password);
		getLoginButton().click();
		return new HomePage(driver);
		
	}
	
	
	

	
}
