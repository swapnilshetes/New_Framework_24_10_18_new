package com.indecomm.scripts.el;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.indecomm.api.AppiumDriverContext;

import io.appium.java_client.AppiumDriver;

public class RunMe {

	public static void main(String[] args) throws IOException {
		System.out.println("Hi");
		// TODO Auto-generated method stub
		AppiumDriver driver = new AppiumDriverContext().getDriver("iOS" , "Ios1");
		WebElement continueButton=driver.findElementByXPath("//android.view.View[@text =\"CONTINUE\"]");
		continueButton.click();

	}

}
