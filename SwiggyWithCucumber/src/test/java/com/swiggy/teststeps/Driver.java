package com.swiggy.teststeps;

import org.openqa.selenium.edge.EdgeDriver;

import com.swiggy.pages.AddFood;
import com.swiggy.pages.HoverOverCart;
import com.swiggy.pages.RestoSelection;
import com.swiggy.pages.SetLocation;
import com.swiggy.pages.VerifyMessage;

public class Driver extends Tools {
	
	protected static SetLocation setLocation;
	protected static RestoSelection restoSelection;
	protected static AddFood addFood;
	protected static HoverOverCart hoverOverCart;
	protected static VerifyMessage verifyMessage;
	
	public static void init() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://swiggy.com");
		setLocation = new SetLocation(driver);
		restoSelection = new RestoSelection(driver);
		addFood = new AddFood(driver);
		hoverOverCart = new HoverOverCart(driver);
		verifyMessage = new VerifyMessage(driver);
	}

}
