package com.testSel;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class Test_Tables
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
		String url = "https://www.training-support.net/selenium/tables";
		
		
		
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
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
	public void countNumofValuesinFirstColumn()
	{
		/*
		 * WebElement sortable = driver.findElement(By.id("sortableTable"));
		 * 
		 * //Row (tr) under the thead only List<WebElement> rows =
		 * sortable.findElements(By.xpath("./thead/tr"));
		 * 
		 * //List<WebElement> rows = sortable.findElements(By.xpath(".//tr"));
		 * 
		 * //print all the contents in each of the rows for(WebElement row:rows) {
		 * System.out.println(row.getText()); }
		 */
		
		//print all contents in a coulmn
		//WebElement sortable2 = driver.findElement(By.id("sortableTable"));
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='sortableTable']/thead/tr/th"));
		
		for(WebElement col:columns)
		{
			System.out.println("Print all the coulmn values:- "+col.getText());
		}
		
		driver.findElement(By.xpath(null));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
