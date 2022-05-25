package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
	public static WebDriver driver;
	
	 public void setup(String browser,String url) { // setting the driver
	    	
	         String path= System.getProperty("user.dir");
	    
	         System.out.println("returning the loction my dr>> "+path);
	    	
	    	 
	    	 if (browser.equalsIgnoreCase("chrome")) {
			        
			        System.setProperty("webdriver.chrome.driver","/Users/reetasharma/Documents/FinalProjectAmazon/Drivers/chromedriver");
			        driver = new ChromeDriver();
			        System.out.println("this is the launched br>>"+ browser);
			      
			        
			} else if (browser.equalsIgnoreCase("FF")) {
			        
			        System.setProperty("webdriver.gecko.driver", "/Users/reetasharma/Documents/FinalProjectAmazon/Drivers/geckodriver");
			        driver = new FirefoxDriver();
			        System.out.println("this is the launched br>>"+ browser);
			        
			}else if (browser.equalsIgnoreCase("Safari")) {
			        	
			        	driver = new SafariDriver();
			        }
			else {System.out.println("this is not correct choice of browser>>"+ browser);
			
			}
      
			
	     if (url!="") {
			driver.get(url);
			System.out.println("the url is >>"+url);
		} else {
    	driver.get("about:blank");
		System.out.println("the url is blank or not as expected>>"+url);
		}
		
	     
	     driver.manage().window().maximize(); 
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}

	   
	      public void teardown() {
	    	 driver.quit();	
	     }


		public static WebDriver getDriver() {
			return driver;
		}


}
