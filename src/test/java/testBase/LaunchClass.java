package testBase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import BasePackage.DriverManager;
import utils.ReadProperties;

public class LaunchClass {
	public WebDriver driver;
	DriverManager dm = new DriverManager();
	Properties prop;
	ReadProperties readprop;
	String filename = "/Users/reetasharma/Documents/FinalProjectAmazon/src/main/java/utils/Config.Properties";

	 
	@Parameters ({"browser", "url"})
	 @BeforeTest (alwaysRun=true)
	 
	public void setup() {
	// readprop= new ReadProperties(); //these three line to comment if we are doing run for json
	// prop= readprop.readproperties(filename); 
   	// System.out.println(prop.getProperty("browser")+prop.getProperty("url"));
		
		// driver =DriverManager.getDriver();
				 //dm.setup("Chrome","https://www.amazon.ca/");
		
		
		 dm.setup("browser","url");
		 setDriver(DriverManager.getDriver());
		
		  
		 }
	 
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	@AfterTest
	public void afterTest() {
		dm.teardown();
	}
}
