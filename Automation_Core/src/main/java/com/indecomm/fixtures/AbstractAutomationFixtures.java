package com.indecomm.fixtures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

//Class will contain the default implementation which is common to both the platforms.
public abstract class AbstractAutomationFixtures {

	public void click(WebElement element) {
		element.click();
	}

	public void sendText(WebElement element, String paraminfo) {
		element.sendKeys(paraminfo);
	}

	public void wait(AppiumDriver driver, String elementId, int waitforsecond) {
		WebDriverWait wait = new WebDriverWait(driver, waitforsecond);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
	}
	
	
	public void waitForPageToLoad(AppiumDriver driver, WebElement elementId, int waitforsecond) {
		WebDriverWait wait = new WebDriverWait(driver, waitforsecond);
		wait.until(ExpectedConditions.elementToBeClickable(elementId));
	}

	public void waitForElementToDisAppear(AppiumDriver driver, String elementId, int waitforsecond) {
		WebDriverWait wait = new WebDriverWait(driver, waitforsecond);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(elementId)));
	}

	public void waitForElementsToAppear(AppiumDriver driver, List<WebElement> id, int waitforsecond) {
		WebDriverWait wait = new WebDriverWait(driver, waitforsecond);
		wait.until(ExpectedConditions.visibilityOfAllElements(id));
	}

	public WebElement waitForElement(AppiumDriver driver,WebElement arg, int waitforsecond) {
		waitForPageToLoad(driver, arg, waitforsecond);
		WebElement el = arg;
		return el;
	}

	
}
