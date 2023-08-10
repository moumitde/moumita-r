package com.testSel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest_1 
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
		//String url = "https://www.training-support.net/selenium/selects";
		
		String url = "https://www.training-support.net/selenium/javascript-alerts";
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@Test
	public void test_1()
	{
		//String url= "https://www.training-support.net/selenium/simple-form";
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("name");
		System.out.println(driver.getCurrentUrl());
		
		String color = driver.findElement(By.className("ui green button")).getCssValue("color");
		System.out.println(color);
	}
	
	@Test
	public void test_2()
	{
		//String url="https://www.training-support.net/selenium/target-practice";
		WebElement firstHeader = driver.findElement(By.tagName("h1"));
		System.out.println(firstHeader.getCssValue("color"));  // rgba(219, 40, 40, 1)
		
		WebElement thirdHeader = driver.findElement(By.tagName("h3"));
		System.out.println(thirdHeader.getText());
	}
	
	@Test
	public void test_3()
	{
		//String url ="https://www.training-support.net/selenium/dynamic-controls";
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear' and @type='checkbox']"));
		System.out.println(checkbox.isDisplayed());
	}
	
	@Test
	public void testWait()
	{
		WebElement element = driver.findElement(By.xpath("//input[@class='willDisappear' and @type='checkbox']"));
		
		WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		toggleButton.click();
		
		//check methods in EXPECTEDCONDITIONS class
		Boolean test = wait.until(ExpectedConditions.invisibilityOf(element));
		
		System.out.println("Print :- "+test);
		
		//WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear' and @type='checkbox']"));
		System.out.println(element.isDisplayed());
		
		ExpectedConditions.textToBePresentInElementLocated(null, null); //waiting for the text to load
	}
	
	@Test
	public void test_tables()
	{
	  WebElement table = driver.findElement(By.xpath("//table[@class='ui celled striped table']"));
	  List<WebElement> rows = table.findElements(By.xpath("//tr"));
	  System.out.println("Print number of rows:- "+rows.size());
	  
		/*
		 * for(WebElement row:rows) { WebElement element =
		 * row.findElement(By.xpath("//td[2]")); System.out.println(element.getText());
		 * }
		 */
	  
	  List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tr[1]/td"));
	  System.out.println("Print the number of columns:- "+columns.size());
	  
	 List<WebElement> ro =  driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
	 
	 System.out.println("print num of rows:- "+ro.size());
	 
	 //TEST SORTABLE TABLE
	 //Fetch all headers from sortable table
	 List<WebElement> headers = driver.findElements(By.xpath("//table[@id='sortableTable']/thead//th"));
	 for(WebElement head:headers)
	 {
		 System.out.println("Print all headers:- "+head.getText());
	 }
	 
	 List<WebElement> data = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody//tr[3]/td"));
	 
	 for(WebElement d:data)
	 {
		 System.out.println("Print all data elements:- "+d.getText());
	 }
	 
	 //print data at second  row and second column
	 WebElement secondRowData = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td[2]"));
	 System.out.println("Second row , second column data:- "+secondRowData.getText());
	  
	  //Print footer values
	 List<WebElement> footerValues = driver.findElements(By.xpath("//tfoot/tr/th"));
	 
	 for(WebElement foot:footerValues)
	 {
		 System.out.println("Print footer values:- "+foot.getText());
	 }
	 
	}
	
	@Test
	public void test_Select()
	{
		//SELECT the single dropdown
		/*
		 * WebElement sel = driver.findElement(By.id("single-select")); Select drop= new
		 * Select(sel); List<WebElement> dropOptions = drop.getOptions(); for(WebElement
		 * el : dropOptions ) { System.out.println(el.getText()); }
		 */
		
		//Select the Multi-dropdown
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select multiDrop = new Select(multi);
		//System.out.println(multiDrop.getFirstSelectedOption().getText());
		List<WebElement> multiOptions = multiDrop.getOptions();
		for(WebElement web :multiOptions)
		{
			System.out.println(web.getText());
		}
		
		multiDrop.selectByValue("css");
		
		//wait.until(ExpectedConditions.refreshed(multi));
		
		multiDrop.deselectByIndex(2);
		
		
		multiDrop.selectByValue("html");
		
		
		
	}
	
	@Test
	public void test_Alerts()
	{
		/*
		 * driver.findElement(By.cssSelector("button#simple")).click();
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * String alertText = alert.getText();
		 * 
		 * System.out.println(alertText);
		 */
		
		driver.findElement(By.cssSelector("button#confirm")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.accept();
	}
	
	@AfterMethod
	public void stopDriver()
	{
		driver.quit();
	}

}
