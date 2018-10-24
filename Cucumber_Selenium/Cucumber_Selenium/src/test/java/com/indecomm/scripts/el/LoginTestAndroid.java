package com.indecomm.scripts.el;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.indecomm.api.AppiumDriverContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class LoginTestAndroid {
	
	AppiumDriver driver;
	
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("First Test ");
		driver=new AppiumDriverContext().getDriver("Android" , "Android_virtualdevice");
		System.out.println("User is on Home Page virual device");
	
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("User Navigate to LogIn Page virual device");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		System.out.println("User enters UserName and Password virual device");
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Message displayed Login Successfully");
	}
}
