package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	WebDriver driver;
	
	public  CommonMethods(WebDriver driver) {//driver constructor.
		this.driver=driver;
		
		//explicit wait , element level wait, highligting etc.
	}
    public void waitforElement(WebElement ele) {
   	 WebDriverWait wait = new WebDriverWait(driver, 5);
   	 
   	 wait.until(ExpectedConditions.visibilityOf(ele));
    }
	public void highlightelement (WebElement ele) {
		
		JavascriptExecutor jsexe =(JavascriptExecutor) driver;
		jsexe.executeScript("arguments[0].style.border='2px soild yellow'", ele);
	}

	public void ScrolleleClick(WebElement ele) {
		
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		jsexe.executeScript("arguments[0].scrollIntoview();",ele);
		}
	public void jsClick(WebElement ele) {
		
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		jsexe.executeScript("arguments[0].click();", ele);
	}

}
