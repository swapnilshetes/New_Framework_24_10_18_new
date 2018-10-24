package com.indecomm.scripts.el;

import org.openqa.selenium.WebElement;

import com.indecomm.api.AppiumDriverContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class LoginTestiOS {
	AppiumDriver driver;

	@Given("^User is on Home Page on iOS$")
	public void user_is_on_Home_Page_on_iOS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new AppiumDriverContext().getDriver("iOS", "IOS_iOS6");
		driver.wait(120000);
		driver.findElementByAccessibilityId("ALLOW").click();
		System.out.println("User is on Home Page on iOS");
		
	}

	@When("^User Navigate to LogIn Page on iOS$")
	public void user_Navigate_to_LogIn_Page_on_iOS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("User Navigate to LogIn Page on iOS");

	}

	@When("^User enters UserName and Password on iOS$")
	public void user_enters_UserName_and_Password_on_iOS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters UserName and Password on iOS");
		
	}

	@Then("^Message displayed Login Successfully on iOS$")
	public void message_displayed_Login_Successfully_on_iOS() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Message displayed Login Successfully on iOS");
		
	}

	
	
}
