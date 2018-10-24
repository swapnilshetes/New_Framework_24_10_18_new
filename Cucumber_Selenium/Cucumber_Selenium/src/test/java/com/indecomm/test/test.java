package com.indecomm.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class test {
	//System.out.println("First Test ");
    public static WebDriver driver1;
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {  
   
    	/*System.setProperty("webdriver.chrome.driver","MentionPathtothisdriver/chromedriver");*/
    	System.setProperty("webdriver.gecko.driver","/usr/local/Cellar/geckodriver"); 
        driver1 = new FirefoxDriver();
        driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver1.get("http://www.gmail.com");
    }
    
    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
        driver1.findElement(By.linkText("Sign in")).click();
    }
    
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
    	driver1.findElement(By.id("email")).sendKeys("blog.cucumber@gmail.com");
        driver1.findElement(By.id("passwd")).sendKeys("Cucumber@blog");
        driver1.findElement(By.id("SubmitLogin")).click();   
    }
    
    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
    	String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
    	String Stringactual = driver1.findElement(By.cssSelector(".info-account")).getText();
        Object actual = null;
		Assert.assertEquals(exp_message, actual);
        driver1.quit();  
    }      
}


