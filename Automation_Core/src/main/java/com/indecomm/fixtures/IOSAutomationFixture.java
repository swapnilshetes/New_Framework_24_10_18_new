package com.indecomm.fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IOSAutomationFixture extends AbstractAutomationFixtures {
	
	AppiumDriver driver;
	LoginFixture loginFixture;
	
	public IOSAutomationFixture(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}
	/**
	 *  IOS Login Fixture define in LoginFixture
	 * */
	public void AppLogin() {
		 new LoginFixture(this.driver).AppLogin();
	}

}
