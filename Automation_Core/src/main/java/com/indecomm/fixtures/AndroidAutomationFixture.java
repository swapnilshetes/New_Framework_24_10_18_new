package com.indecomm.fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidAutomationFixture extends AbstractAutomationFixtures {

	AppiumDriver driver;
	LoginFixture loginFixture;
	
	public AndroidAutomationFixture(AppiumDriver<MobileElement> driver)
	{
		this.driver=driver;
	}
	public void click(String xPath)
	{
		WebElement element=driver.findElement(By.xpath(xPath));
		element.click();
	}
	/**
	 *  Android Login Fixture define in LoginFixture
	 * */
	public void AppLogin() {
		 new LoginFixture(this.driver).AppLogin();
	}
	
	
}
