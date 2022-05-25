package TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.SamsungPage;
import testBase.LaunchClass;

public class SamsungPageTest extends LaunchClass {

	SamsungPage sp;

	@BeforeTest
	public void beforeSuite() {
		sp = new SamsungPage(getDriver());
		//sp = new SamsungPage(driver);
	}

	@Test(priority = 1)
	public void sendKeysSearchbarTest() throws InterruptedException {
		// Thread.sleep(3000);
		sp.sendKeysSearchbar();
	}

	@Test(priority = 2)
	public void clicksubmitTest() throws InterruptedException {
		Thread.sleep(3000);
		sp.clicksubmit();
		String actualmessage=sp.phoneResults.getText();
		AssertJUnit.assertTrue(actualmessage.contains("$samsung galaxy s10"));
		System.out.println("The message result of the phonepage is>>>" + "1-48 of 325 results for \"samsung galaxy s10");
		 

	}

	@Test(priority = 3)
	public void clickSelectPhoneTest() {
		sp.clickSelectPhone();
	}

	@Test
	public void verifyPhonePrice() throws InterruptedException {
		Thread.sleep(2000);
	    String actualPrice=sp.phoneprice.getAttribute("phoneprice"); //getText();
		AssertJUnit.assertTrue(actualPrice.contains("$799.00"));
		System.out.println("The actual price of the phone is"+ "$799.00");
	
	}

	@Test
	public void clickdeliverylocation() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sp.clickdeliverylocation();
	}

	@Test
	public void sendKeyszipCode1Test() {
		sp.sendKeyszipCode1("zipCode1");
	}

	@Test
	public void sendKeyszipCode2Test() {
		sp.sendKeyszipCode2("zipCode2");
	}

	@Test
	public void clickApplyTest() throws InterruptedException {
		sp.clickApply();
        String newDeliverylocation = sp.newDelivery.getText();
		AssertJUnit.assertTrue(newDeliverylocation.contains("Deliver to L6X 5N"));
		 
	}

	@Test
	public void clickaddToCartTest() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sp.clickaddToCart();
		String actualmessage = sp.addToCartMessage.getText();
		AssertJUnit.assertTrue(actualmessage.contains("Added to cart")); 
	}

	@Test
	public void clickcheckoutTest() throws InterruptedException {
		Thread.sleep(2000);
		sp.clickcheckout();
		String actualTitle = driver.getTitle();
		AssertJUnit.assertTrue(actualTitle.contains("Amazon Sign in"));
		System.out.println("The Sign in title is validated");
		 
	}

}

