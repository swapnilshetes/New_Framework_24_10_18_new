package com.indecomm.fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginFixture {

	private AppiumDriver driver;
	AbstractAutomationFixtures abstractAutomationFixtures;

	/*
	 * Below xpath will get from common element component file
	 */

	@AndroidFindBy(xpath = "//*[@content-desc='CONTINUE' and @class='android.view.View']")
	@iOSFindBy(xpath = "//*[@content-desc='CONTINUE']")
	@FindBy(xpath = "//*[@content-desc='CONTINUE' and @class='android.view.View']")
	MobileElement btnContinue;

	@AndroidFindBy(xpath = "//*[@content-desc='LOG IN' and @class='android.view.View']")
	@iOSFindBy(xpath = "//*[@content-desc='LOG IN' and @class='android.view.View']")
	@FindBy(xpath = "//*[@content-desc='LOG IN' and @class='android.view.View']")
	MobileElement btnLogin;


	@AndroidFindBy(xpath = "//*[@content-desc=\"AEG\"]/android.widget.EditText[1]")
	@iOSFindBy(xpath = "//*[@content-desc=\"AEG\"]/android.widget.EditText[1]")
	@FindBy(xpath = "//*[@content-desc=\"AEG\"]/android.widget.EditText[1]")
	MobileElement txtUserName;

	@AndroidFindBy(xpath = "//*[@content-desc=\"AEG\"]/android.widget.EditText[2]")
	@iOSFindBy(xpath = "//*[@content-desc=\"AEG\"]/android.widget.EditText[2]")
	@FindBy(xpath = "//*[@content-desc=\"AEG\"]/android.widget.EditText[2]")
	MobileElement txtPassword;
	
	
	public LoginFixture(AppiumDriver<MobileElement> driver) {
		System.out.println(":: Start redirecting on login page ::");
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}

	public void AppLogin() {

		/*
		 * Click on Continue button to redirect loginpage
		 */
		abstractAutomationFixtures.waitForPageToLoad(driver, btnContinue, 10);
		abstractAutomationFixtures.click(btnContinue);

		// Wait until find Element

		abstractAutomationFixtures.waitForElement(driver, btnLogin, 10);

		/*
		 * On Login page to enter credential
		 */

		abstractAutomationFixtures.sendText(txtUserName, "devemerald@electrolux.com");
		abstractAutomationFixtures.sendText(txtPassword, "Bhasha23@");
		abstractAutomationFixtures.click(btnLogin);
	}
}
