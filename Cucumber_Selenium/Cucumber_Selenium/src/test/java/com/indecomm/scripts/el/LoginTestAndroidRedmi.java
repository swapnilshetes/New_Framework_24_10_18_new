package com.indecomm.scripts.el;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indecomm.api.AppiumDriverContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class LoginTestAndroidRedmi {

	AppiumDriver driver;

	@Given("^User is on Home Page Redmi$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("First Test REdmin ");
		driver = new AppiumDriverContext().getDriver("Android", "Android_REDME");

		System.out.println("User is on Home Page Redm");

		
	}

	@When("^User Navigate to LogIn Page Redmi$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("User Navigate to LogIn Page Redm");
	}

	@When("^User enters UserName and Password Redmi$")
	public void user_enters_UserName_and_Password() throws Throwable {
		System.out.println("User enters UserName and Password Redm");
	}

	@Then("^Message displayed Login Successfully Redmi$")
	public void message_displayed_Login_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Message displayed Login Successfully Redmi");
		// throw new PendingException();
	}
}
