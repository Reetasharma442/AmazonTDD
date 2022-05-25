package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.DriverManager;
import utils.CommonMethods;

public class SamsungPage {
	WebDriver driver;
	CommonMethods common= new CommonMethods(DriverManager.getDriver());
	
	
	public SamsungPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@CacheLookup
	@FindBy(id="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchbar;
	
	@CacheLookup
	@FindBy(id="nav-search-submit-button")
	WebElement submitText;
	
	@CacheLookup
	@FindBy (xpath="//div[@class=\"a-section a-spacing-small a-spacing-top-small\" and .//span[contains(.,\"samsung galaxy s10\")]]")
	public WebElement phoneResults;

	@CacheLookup
	@FindBy(xpath="//*[contains(text(),'Samsung Galaxy S10 6GB 128GB - Unlocked Phone - (Prism Black)')]")
	WebElement selectPhone;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"corePriceDisplay_desktop_feature_div\"]//*[contains(text(), '$799.00')]")
	public WebElement phoneprice;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"contextualIngressPtLabel_deliveryShortLine\"]")
	WebElement deliverylocation;
	
	@CacheLookup
	@FindBy(id="GLUXZipUpdateInput_0")
	WebElement zipCode1;
	
	@CacheLookup
	@FindBy(id="GLUXZipUpdateInput_1")
	WebElement zipCode2;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"GLUXZipUpdate\"]/span/input")
	WebElement clickApply;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"contextualIngressPtLabel_deliveryShortLine\"]")
	public WebElement newDelivery;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addToCart;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"sw-atc-details-single-container\"]//*[contains(text(), 'Added to Cart')]")
	public WebElement addToCartMessage;
	
	@CacheLookup
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement checkout;
	
	
	public void sendKeysSearchbar() {
		sendKeys(searchbar, "samsung galaxy s10");
	}
	
	public void clicksubmit() {
		clickelement(submitText);
		}
	
	public WebElement getphoneResults() {
		return phoneResults;
	}
	
	public void clickSelectPhone() {
		clickelement(selectPhone);
	}
	
	public WebElement verifyPhonePrice() {
		return phoneprice;
	}
	
	public void clickdeliverylocation() {
		clickelement(deliverylocation);
	}

	
	public void sendKeyszipCode1(String data) {
		sendKeys(zipCode1, "L6X");
	}
	
	public void sendKeyszipCode2(String keys) {
		sendKeys(zipCode2, "5N7");
	}
	public void clickApply() {
		clickelement(clickApply);
	}
	
	public void clickaddToCart() {
		clickelement(addToCart);
	}
	
	public void clickcheckout() {
		clickelement(checkout);
	}
	
	
	
	//common methods;
	
	
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
