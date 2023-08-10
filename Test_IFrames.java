package com.testSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_IFrames {
	
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
		//String url = "https://www.training-support.net/selenium/tables";
		
		//Practice Select Dropdown
		String url = "https://www.training-support.net/selenium/iframes";
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@Test
	public void test_Iframe()
	{
		//Switch to the 1st IFRAME and print the header
		driver.switchTo().frame(0);
		String frameName = driver.findElement(By.className("content")).getText();
		System.out.println(frameName);
		
		//click on the button inside the 1st frame - 
		WebElement actionButton = driver.findElement(By.id("actionButton"));
		actionButton.click();
		//get the button text after clicking on it
		System.out.println("Get the button text after clicking on it:- "+actionButton.getText());
		
		//Switch to the parent window
		driver.switchTo().defaultContent();
		
		//Switch to the second iFrame from the original window
		driver.switchTo().frame(0);
		WebElement iframe2 = driver.findElement(By.xpath("//*[contains(text(),'Frame 2')]"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.id("actionButton")).click();
		
	}

}
