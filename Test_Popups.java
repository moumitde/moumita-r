package com.testSel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Popups
{
	WebDriver driver = null;
	WebDriverWait wait = null ;
	
	@BeforeMethod
	public void runBeforeEachMethod() throws InterruptedException
	{
		//String url= "https://www.training-support.net/selenium/simple-form";
		
		//String url="https://www.training-support.net/selenium/target-practice";
		
		//String url ="https://www.training-support.net/selenium/dynamic-controls";
		
		//String url = "https://training-support.net/selenium/dynamic-attributes";
		
		//Practice tables
		String url = "https://www.training-support.net/selenium/popups";
		
		
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@Test
	public void test_popups()
	{
		WebElement SignIn = driver.findElement(By.xpath("//button[@onclick='openModal()']"));
		Actions actions = new Actions(driver);
	    actions.moveToElement(SignIn).build().perform();
	    
	   String innerHTML =  SignIn.getAttribute("innerHTML");
	   System.out.println(innerHTML);
	   
	   String tooltip= SignIn.getAttribute("data-tooltip");
	   System.out.println("Print tooltip text:- "+tooltip);
	   
	   //wait for element to be clickable
	   wait.until(ExpectedConditions.elementToBeClickable(SignIn));
	   
	   //Use JavascriptExecutor to click on the button
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("argument[0].click();", SignIn);
	}
}