package in.amazon.teststeps;

import java.util.ArrayList;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

//import in.amazon.pages.AllMobileBrands;
//import in.amazon.pages.ApplePhones;
//import in.amazon.pages.BuyPhone;
//import in.amazon.pages.LandingPage;
//import in.amazon.pages.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Driver {
	//WebDriver driver;
	//AllMobileBrands allMobilesBrands;
	
	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	    // Write code here that turns the phrase above into concrete actions
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://amazon.in");
		//throw new io.cucumber.java.PendingException();
	}

	@When("he clicks on Mobiles in the navigation bar")
	public void he_clicks_on_mobiles_in_the_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
		//LandingPage landingPage = new LandingPage(driver);
		landingPage.clickMobiles();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
	    // Write code here that turns the phrase above into concrete actions
		//allMobilesBrands = new AllMobileBrands(driver);
		allMobilesBrands.hoverOverMobilesAndAccessories();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("he clicks on Apple in the sub-menu")
	public void he_clicks_on_apple_in_the_sub_menu() {
	    // Write code here that turns the phrase above into concrete actions
		allMobilesBrands.clickApple();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("he clicks on the second available phone")
	public void he_clicks_on_the_second_available_phone() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//ApplePhones applePhones = new ApplePhones(driver);
		applePhones.clickFirstMobile();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
	    // Write code here that turns the phrase above into concrete actions
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	    //throw new io.cucumber.java.PendingException();
	}

	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
	    // Write code here that turns the phrase above into concrete actions
		//BuyPhone buyPhone = new BuyPhone(driver);
		buyPhone.clickBuyNowBtn();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("he must be able to purchase the mobile phone successfully.")
	public void he_must_be_able_to_purchase_the_mobile_phone_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		//SignIn signIn = new SignIn(driver);
		String expectedText = "Sign in";
		String actualText = signIn.getSignInText();
		Assert.assertEquals(actualText, expectedText);
	    //throw new io.cucumber.java.PendingException();
		driver.quit();
	}

}
