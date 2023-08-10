package com.testSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Actions 
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
		String url = "https://www.training-support.net/selenium/input-events";
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@Test
	public void testActions()
	{
		Actions actions = new Actions(driver);
		//WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		
		//build() called on Actions class object will build all the actions that have been called and return an ACTION object
		/*
		 * action.click(cube).build().perform();
		 */
		//action.sendKeys("5").build().perform();
		
		//action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//action.keyDown(Keys.)
		
		//actSeq.perform();
		
		 //Create action sequence for initials
        Action actionSequence1 = actions.sendKeys("S").build();
        actionSequence1.perform();
   //     pressedKeyText = pressedKey.getText();
     //   System.out.println("Pressed key is: " + pressedKeyText);
        
        
        //Create action sequence for Spacebar
        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        
        
        actions.dragAndDrop(null, null);
        //hover over a webelement
        actions.moveToElement(null);
	}

}
