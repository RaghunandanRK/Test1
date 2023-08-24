package com.swiggy.teststeps;

//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

//import com.swiggy.pages.AddFood;
//import com.swiggy.pages.HoverOverCart;
//import com.swiggy.pages.RestoSelection;
//import com.swiggy.pages.SetLocation;
//import com.swiggy.pages.VerifyMessage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceSwiggyOrderSteps extends Driver {
	
//	private SetLocation setLocation;
//	private RestoSelection restoSelection;
//	private AddFood addFood;
//	private HoverOverCart hoverOverCart;
//	private VerifyMessage verifyMessage;
	
	@Given("a user is on the Swiggy homepage")
	public void a_user_is_on_the_swiggy_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://swiggy.com");
	}

	@When("he sets the delivery location as {string}")
	public void he_sets_the_delivery_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//setLocation = new SetLocation(driver);
		//setLocation.searchLoc("hyderabad");
		
	}

	@When("he selects the first option from the auto-complete box")
	public void he_selects_the_first_option_from_the_auto_complete_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		setLocation.searchLoc("hyderabad");
	}

	@When("he clicks on the first restaurant from {string}")
	public void he_clicks_on_the_first_restaurant_from(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//restoSelection = new RestoSelection(driver);
		restoSelection.clickFirstResto();
	}

	@When("he adds the first listed dish to the cart")
	public void he_adds_the_first_listed_dish_to_the_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//addFood = new AddFood(driver);
		addFood.clickFirstFood();	
		}

	@When("he hovers over the {string} in the top right corner")
	public void he_hovers_over_the_in_the_top_right_corner(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//hoverOverCart = new HoverOverCart(driver);
	}

	@When("he clicks on {string} in the sub-menu")
	public void he_clicks_on_in_the_sub_menu(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		hoverOverCart.hoverOverCartOptn();
		hoverOverCart.clickCheckOutBtn();
	}

	@Then("he should see the text {string}")
	public void he_should_see_the_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//verifyMessage = new VerifyMessage(driver);
		String expectedText = "To place your order now, log in to your existing account or sign up.";
		String actualText = verifyMessage.getVerifyTheText();
		Assert.assertEquals(actualText, expectedText);
	}


}
