package com.indecomm.util;
//Coarse grained Utility class.
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.indecomm.dto.CustomDesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AutomationUtility {

	
	public static JSONObject readJSON(String fileName)
	{
		JSONParser parser=new JSONParser();
		JSONObject jsonObject=null;
		try
		{
		String cwd = System.getProperty("user.dir") + fileName;
		Object obj = parser.parse(new FileReader(cwd));
		jsonObject = (JSONObject) obj;
		}catch(Exception exc)
		{
			System.out.println("Reading JSON ===>>>"+exc.getMessage());
		}
		return jsonObject;
	}
	
	public static CustomDesiredCapabilities getDesiredCapabilities(JSONObject jsonObject,String platform)
	{
		DesiredCapabilities desiredCapabilities=null;
		CustomDesiredCapabilities cDesiredCapabilities=new CustomDesiredCapabilities();
		
		JSONObject jsonObj=(JSONObject)jsonObject.get(platform);
		
		if(platform.contains("Android"))
		{
			desiredCapabilities=DesiredCapabilities.android();
		//	desiredCapabilities.setVersion("1.9.1");
			
			System.out.println("JSON is  Android=====>>>"+jsonObj.toJSONString());
			desiredCapabilities.setCapability("app",(String)(((JSONObject)jsonObj.get("capabilities")).get("app")));
			desiredCapabilities.setCapability("platformName",(String)(((JSONObject)jsonObj.get("capabilities")).get("platformName")));
			desiredCapabilities.setCapability("platformVersion",(String)(((JSONObject)jsonObj.get("capabilities")).get("platformVersion")));
			desiredCapabilities.setCapability("deviceName", (String)(((JSONObject)jsonObj.get("capabilities")).get("device")));
			desiredCapabilities.setCapability("appWaitActivity",(String)(((JSONObject)jsonObj.get("capabilities")).get("appWaitActivity")));
			desiredCapabilities.setCapability("udid",(String)(((JSONObject)jsonObj.get("capabilities")).get("udid")));
		}
		else if(platform.contains("iOS"))
		{
			desiredCapabilities=new DesiredCapabilities();
			System.out.println("JSON is iOS =====>>>"+jsonObj.toJSONString());
			desiredCapabilities.setCapability("udid",(String)(((JSONObject)jsonObj.get("capabilities")).get("deviceudid")));
			desiredCapabilities.setCapability("app",(String)(((JSONObject)jsonObj.get("capabilities")).get("app")));
			desiredCapabilities.setCapability("platformName",(String)(((JSONObject)jsonObj.get("capabilities")).get("platformName")));
			desiredCapabilities.setCapability("autoAcceptAlerts", true);
			desiredCapabilities.setCapability("platformVersion",(String)(((JSONObject)jsonObj.get("capabilities")).get("platformVersion")));
			desiredCapabilities.setCapability("deviceName", (String)(((JSONObject)jsonObj.get("capabilities")).get("device")));	
			desiredCapabilities.setCapability("automationName", (String)(((JSONObject)jsonObj.get("capabilities")).get("automationName")));
			desiredCapabilities.setCapability("bundleid", (String)(((JSONObject)jsonObj.get("capabilities")).get("bundleid")));
			desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, (String)(((JSONObject)jsonObj.get("capabilities")).get("reset")));
			
		}
		cDesiredCapabilities.setDesiredCapabilities(desiredCapabilities);
		cDesiredCapabilities.setAppiumServer((String)(((JSONObject)jsonObj.get("capabilities")).get("appiumServer")));
		cDesiredCapabilities.setPort((String)(((JSONObject)jsonObj.get("capabilities")).get("port")));
		return cDesiredCapabilities;
		
	}
	


}
