package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BasePackage.DriverManager;

public class URLValidationTest {
	
	WebDriver driver;
	DriverManager dm= new DriverManager();
	
	@BeforeTest
  public void BeforeTest() {
		 dm.setup("browser","https://www.amzn.com/");
		 setDriver(DriverManager.getDriver());
		 //driver =DriverManager.getDriver();
		 
	 }
  


@Test
  public void getTitle() {
	  
	 String actualTitle= driver.getTitle();		  
	 String expectedTitle=  "Amazon.com. Spend less. Smile more";
	 AssertJUnit.assertTrue(actualTitle.contains(expectedTitle));
	 System.out.println("The URL was redirected to amazon.com");
			
	  }	 

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

@AfterTest
  public void AfterTest() {
	  dm.teardown();
  
   }
}
