package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.DriverManager;
import utils.CommonMethods;

public class CreateAWishList {
	WebDriver driver;
	Actions action;
	CommonMethods common= new CommonMethods(DriverManager.getDriver());

	public CreateAWishList(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		action=new Actions (driver);
	}
	
	  @CacheLookup
	  @FindBy (xpath="//*[@id=\"nav-link-accountList\"]")
	  WebElement accAndLst;
	 
	  @CacheLookup
	  @FindBy (xpath= "//*[@id=\"nav-al-wishlist\"]/a[1]/span")
	  WebElement createWishLst;
	  
	  @CacheLookup
	  @FindBy (xpath= "//*[@id=\"a-autoid-0-announce\"]")
	  WebElement signInBtn;
	  
	  @CacheLookup
	  @FindBy (id="ap_email")
	  WebElement email;
	  
	  @CacheLookup
	  @FindBy (id="ap_password")
	  WebElement password;
	  
	  @CacheLookup
	  @FindBy (id=("signInSubmit"))
	  WebElement signInsubmit;
	  
	  @CacheLookup
	  @FindBy (xpath= "//*[@id=\"itemName_I2V79V6JUB03DD\"]")
	  WebElement selectproduct;
	  
	  @CacheLookup
	  @FindBy (xpath= "//*[@id=\"buy-now-button\"]")
	  WebElement buyNowBtn;
	  
	  @CacheLookup
	  @FindBy (xpath="//*[@id=\"nav-link-accountList\"]")
	  WebElement accAndLst1;
	  
	  @CacheLookup
	  @FindBy (xpath= "//*[@id=\"nav-item-signout\"]/span")
	  WebElement signout;
	  
	  @CacheLookup
	  @FindBy (xpath="//*[@id=\"nav-xshop\"]/a[4]")
	  WebElement newRelease;
	 
	
	
	
	  
	  public void mouseHoverActions() {
		  action.moveToElement(accAndLst).build().perform();
	  }
	  
	  public void clickCreateWishLst() {
	      clickelement(createWishLst);
	  }
	  
	  public void clickSignInBtn(){
		  clickelement(signInBtn);
		  }
	  
	  public void sendKeysemail(String emaildata){
		  sendKeys(email, emaildata);
		  }
	  
	  public void sendKeyspassword(String passworddata){
		  sendKeys(password, passworddata);
		  }
	  
	  public void clickSignInSubmit(){
		  clickelement(signInsubmit);
		  }
	  
	  public void clickSelectproduct(){
		  clickelement(selectproduct);
		  }
	  
	  public void clickBuyNow(){
		  clickelement(buyNowBtn);
	  }
	  public void mouseHoverActions2() {
		  action.moveToElement(accAndLst1).build().perform();
	  }
	  
	  public void clickSignOutBtn() {
		  clickelement(signout);
	  }
	  
	  public void clicknewReleases() {
			clickelement(newRelease);
		}
	 
	
	public void clickelement(WebElement ele) {
		common.waitforElement(ele);
		if (ele.isEnabled()) {
			ele.click();}
		else {
			System.out.println("The element is not enabled");
		}
			
	}
		
	public void sendKeys(WebElement ele, String keys) {
	    common.waitforElement(ele);
		if (ele.isDisplayed() && ele.isEnabled()) {
			ele.sendKeys(keys);
			}
		else {
			System.out.println("The element is not displayed nor enabled");
		}		
		
		}

}
