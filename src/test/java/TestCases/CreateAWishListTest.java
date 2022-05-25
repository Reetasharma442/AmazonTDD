package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM.CreateAWishList;
import testBase.LaunchClass;

public class CreateAWishListTest extends LaunchClass{
	CreateAWishList cwl;
    
	
	  @BeforeTest
	      public void beforeTest() {
		  cwl= new CreateAWishList(getDriver());
		  //cwl= new CreateAWishList(driver);
	      }
	   
	  
	  @Test (priority=1)
	      public void mousehoveractions() {
		   cwl.mouseHoverActions();
	      }
	   
	  @Test (priority=1)
	      public void clickCreateWishLstTest() {
		  cwl.clickCreateWishLst();
		  String actualTitle= driver.getTitle();
		  String expectedTitle= "Wish List";
		  AssertJUnit.assertTrue(actualTitle.contains(expectedTitle));
		  System.out.println("The titles are matching");
	      }
	  

	  @Test (priority=3)
	      public void clickSignInBtnTest() {
	       cwl.clickSignInBtn();
	       }
	  
	  
	      @Parameters ({"validemail"})
	  @Test (priority=4)
	      public void sendKeysemailTest(String email) {
	      cwl.sendKeysemail(email);
	      }
	      
	      @Parameters ({"validpassword"})
	  @Test (priority=5)
	      public void sendKeyspasswordTest(String password) {
		  cwl.sendKeyspassword(password);
	      }
		  
	  @Test (priority=6)
		  public void clickSignInSubmitTest(){
		  cwl.clickSignInSubmit();
	      }
		
	  @Test (priority=7)
		  public void clickSelectproductTest() {
		  cwl.clickSelectproduct();
		  }
		  
	  @Test (priority=8)
		  public void clickBuyNowTest(){
		  cwl.clickBuyNow();
		  String actualTitle= driver.getTitle();
	      AssertJUnit.assertTrue(actualTitle.contains("Amazon.ca Checkout"));
	      System.out.println("The titles are matching");
		  driver.navigate().to("https://www.amazon.ca/");
	      }
	  
	  @Test (priority=9)
	      public void mousehoveractions2() {
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       cwl.mouseHoverActions2();
	          }
	   
	   @Test (priority=10)
	      public void clickSignOutTest() throws InterruptedException {
		   
		   Thread.sleep(3000);
		   cwl.clickSignOutBtn();
		   driver.navigate().to("https://www.amazon.ca/");
	   }
	   
	 //New Release link does not appear when we are signed in.
	   
	  @Test (priority=11) 
		   public void clicknewReleasesTest() throws InterruptedException {
		
			Thread.sleep(10000);
		   cwl.clicknewReleases();
		   String actualTitle= driver.getTitle();
		   AssertJUnit.assertTrue(actualTitle.contains("Amazon.ca Hot New Releases: The bestselling new & future releases on Amazon"));
		   System.out.println("The titles are matching");
		   }
}
