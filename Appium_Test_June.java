package com.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.functions.ExpectedCondition;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.time.Duration;

public class Appium_Test_June 
{
	WebDriverWait wait ;
	AndroidDriver driver ;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();
		
		//set URL
		URL setURL = new URL("http://localhost:4723/wd/hub");
		
		driver = new AndroidDriver(setURL,options);
		//wait = new WebDriverWait(null, null);
		
		//driver.findElement(AppiumBy.accessibilityId("Chrome")).click();
		
		 driver.get("https://www.training-support.net");
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	@Test
	public void test1()
	{
		//System.out.println("URL is launched");
		
		By appiumB = AppiumBy.xpath("//android.view.View[@text='Training Support']");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(appiumB));
		//Get the text for Training Support 
		WebElement train = driver.findElement(appiumB);
		
		System.out.println("Print the text for Training-support:- "+train.getText());
		
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']")).click();
		System.out.println("About link URL is clicked");
	   // System.out.println("Print text for Training Support:- "+pageHeading);
	}

}
