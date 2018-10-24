package com.indecomm.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",glue = { "com.indecomm.scripts.el" },
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
monochrome = true)

/*@CucumberOptions(features = "src/test/java/features",glue = { "Cucumber_Selenium.Cucumber_Selenium" },
format = { "pretty","html:target/html-reports"}, 
monochrome = true) */

public class testrunner {
	
	@AfterClass
    public static void writeExtentReport() {
   //     Reporter.loadXMLConfig(new File("config/report.xml"));

}
}
