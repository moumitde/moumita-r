package com.testSel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_WindowSwitching 
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
		//String url = "https://www.training-support.net/selenium/tables";
		
		//Practice Select Dropdown
		String url = "https://www.training-support.net/selenium/tab-opener";
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@Test
	public void test()
	{
		//1st WINDOW
		String currentWindow = driver.getWindowHandle();
		System.out.println("Print the current window handle:- "+currentWindow);
	
		
		//Open 2nd WINDOW and switch to it
		WebElement clickButton = driver.findElement(By.id("launcher"));
		clickButton.click();	
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle:windowHandles)
		{
			if(!currentWindow.equals(windowHandle))
				driver.switchTo().window(windowHandle);
		}	
		System.out.println("Print the window title:- "+driver.getTitle());
		
		
		//Window handle of 2nd window
		String newTab = driver.getWindowHandle();	
		By action = By.id("actionButton");
		WebElement clickAnotherButton = driver.findElement(action);   
		wait.until(ExpectedConditions.presenceOfElementLocated(action));
		
		
		//Open 3rd WINDOW and switch to it
		clickAnotherButton.click();
		windowHandles = driver.getWindowHandles();
		System.out.println("number of opened windows:- "+windowHandles.size());	
		for(String win:windowHandles)
		{
			if(!win.equals(newTab))
				driver.switchTo().window(win);
		}
		System.out.println("Get title of the last window opened:- "+driver.getTitle());
		
        wait.until(ExpectedConditions.titleIs("Newtab2"));	
        
        //Switch to the most parent window - 
		driver.switchTo().defaultContent();
		
		System.out.println("Get title of the last active window opened:- "+driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
