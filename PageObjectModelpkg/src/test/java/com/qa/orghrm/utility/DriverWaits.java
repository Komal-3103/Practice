package com.qa.orghrm.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverWaits {
	
	public static void getimpWaitTime(WebDriver driver,int timeUnitMins) {
		driver.manage().timeouts().implicitlyWait(timeUnitMins, TimeUnit.MINUTES);
	}

}

