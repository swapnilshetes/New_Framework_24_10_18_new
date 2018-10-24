/**
 * 
 */
/**
 * @author navjot
Decorator/Wrapper Class by Aggregation
 *
 */
package com.indecomm.dto;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CustomDesiredCapabilities 
{
	DesiredCapabilities desiredCapabilities;
	String appiumServer;
	String port;
	public DesiredCapabilities getDesiredCapabilities() {
		return desiredCapabilities;
	}
	public void setDesiredCapabilities(DesiredCapabilities desiredCapabilities) {
		this.desiredCapabilities = desiredCapabilities;
	}
	
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getAppiumServer() {
		return appiumServer;
	}
	public void setAppiumServer(String appiumServer) {
		this.appiumServer = appiumServer;
	}
	
	
}