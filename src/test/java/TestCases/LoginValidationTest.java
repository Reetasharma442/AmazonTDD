package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import POM.LoginValidation;
import testBase.LaunchClass;

public class LoginValidationTest extends LaunchClass{
	 LoginValidation lv;

	 @BeforeTest(alwaysRun=true)
	  public void beforeSuite() {	
	  lv = new LoginValidation(getDriver());
	//  lv = new LoginValidation(driver);
	 }

	 
	  @Test 
	  public void Loginbutton() {		
	  lv.clickaccAndLst();
	  }
	  
	  
	  @Parameters({"validemail"})
	  @Test
	  public void sendkeysemailTest(String email) {
	  lv.sendkeysemail("email");
	   }
	  
	  @Test 
	  public void clickcontinueBtnTest() {		
	  lv.clickcontinueBtn();
	  }
	  
	  
	  @Parameters({"validpassword"})
	  @Test
	  public void sendkeyspassword() {
	  	lv.sendkeyspassword("password");
	  }
	  

	  @Test
	  public void clickSubmitTest() { 
	  lv.clickSubmit();

	  String actualTitle= driver.getTitle();
	  String expectedTitle="Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
	  AssertJUnit.assertTrue(actualTitle.contains(expectedTitle));
	  System.out.println("The Valid Credential testing is passed");	
	  }
	  
	  @Test
	  public void mouseHoverTest() throws InterruptedException {
		  driver.navigate().refresh();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		   lv.mouseHover();
	  }
	  
	  @Test 
	  public void clicksignOutTest() throws InterruptedException {
		  Thread.sleep(1000);
		  lv.clicksignOut();
	   }
	  
	  @Test  
	  public void clickaccAndLst1() {
			
	 driver.navigate().to("www.amazon.ca");
	 try { Thread.sleep(8000); } catch
			  (InterruptedException e)
	 { e.printStackTrace();
	 }
			 
	  lv.clickaccAndLst();
	  }
	  
	  
	  @Parameters({"Invalidemail"})
	  @Test 
	  public void sendkeysemail1(String email) {
	  	 lv.sendkeysemail("email");
	   }
	  
	  @Test  
	  public void clickcontinueBtn1() {		
	  lv.clickcontinueBtn();
	  }
	  
	  @Parameters({"invalidpassword"})
	  @Test 
	  public void sendkeyspassword1Test(String password) {
			lv.sendkeyspassword1("password");
		}
	  
     @Test 
	  public void clickSubmit1() throws InterruptedException{
   	  Thread.sleep(0);
   	  lv.clickSubmit1();
   	  String expected= "Your password is incorrect";
         String actual= lv.errormessage.getText();
         AssertJUnit.assertTrue(actual.contains(expected));
         System.out.println("Error message is:" + "Your password is incorrect");
     }
	

	  @AfterSuite(alwaysRun=true)
	  public void afterclass() {
	  driver.quit();
	  	}


}

