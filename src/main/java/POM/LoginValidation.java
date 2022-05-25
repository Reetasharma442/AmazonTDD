package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.DriverManager;
import utils.CommonMethods;

public class LoginValidation {
	WebDriver driver;
	CommonMethods common = new CommonMethods(DriverManager.getDriver());
	Actions action;
	public LoginValidation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@CacheLookup
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement accAndLst;

	@CacheLookup
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement email;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continueBtn;
	
	@CacheLookup
	@FindBy(id="ap_password")
	WebElement password;

	@CacheLookup
	@FindBy(id="signInSubmit")
	WebElement Submit;
	
	@CacheLookup
	@FindBy(id="//*[@id=\"nav-item-signout\"]/span")
	 WebElement SignOut;
	
	@CacheLookup
	@FindBy(id="//*[@id=\"auth-error-message-box\"]/div/div")
	 public WebElement errormessage;
	
   public void clickaccAndLst() {
    clickelement(accAndLst);
   }

   public void sendkeysemail(String emaildata) {
		sendkeys(email, emaildata);
   }
		
   public void clickcontinueBtn() {
		clickelement(continueBtn);
   }

   public void sendkeyspassword(String passworddata) {
		sendkeys(password, passworddata);
	}

   public void clickSubmit(){
	   clickelement(Submit);
   }
   
   public void mouseHover() throws InterruptedException {
	   driver.navigate().refresh();
	   Thread.sleep(3000);
	   action.moveToElement(accAndLst).build().perform();
	  
	   }
   
   public void clicksignOut() {
	   clickelement(SignOut);
   }
   
   public void clickaccAndLst1() {
	    clickelement(accAndLst);
	   }

   public void sendkeysemail1(String emaildata) {
	  sendkeys(email, "abc@gmail.com");
	   }
			
   public void clickcontinueBtn1() {
	   clickelement(continueBtn);
   }
   
   public void sendkeyspassword1(String passworddata) {
		sendkeys(password, "Tset@123");
	}

  public void clickSubmit1(){
	   clickelement(Submit);
  }
   
   
   

   public void clickelement(WebElement ele) {
    // common.highlightelement(ele);	
     common.waitforElement(ele);
	if (ele.isEnabled()) {
		ele.click();
		}
		else {System.out.println("the element is not enabled");
		}
	}
	

   public void sendkeys(WebElement ele,String keys) {
	//common.highlightelement(ele);
	common.waitforElement(ele);
	if (ele.isDisplayed()&& ele.isEnabled()) {
		ele.clear();
		ele.sendKeys(keys);
	}else {
		System.out.println("this is not enabled or displayed ");
	}
   }

}
