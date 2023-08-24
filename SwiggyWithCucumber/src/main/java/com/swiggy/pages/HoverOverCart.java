package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoverOverCart {
	
    private WebDriver driver;
    private WebDriverWait wait;
	private Actions actions;
	
	public HoverOverCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	@FindBy(xpath = "//div[contains(@class,'_1fmVk _30y3a')]")
	private WebElement cartOptn;
	
	
	@FindBy(xpath = "//div[contains(@class,'_55uP6')]")
	private WebElement checkoutbtn;
	
	public void hoverOverCartOptn() {
		//wait.until(ExpectedConditions.elementToBeClickable(cartOptn));
	    wait.until(ExpectedConditions.and(
	            ExpectedConditions.elementToBeClickable(cartOptn),
	            ExpectedConditions.not(ExpectedConditions.attributeContains(cartOptn, "aria-label", "empty"))
	    ));
		actions.moveToElement(cartOptn).build().perform();
	}
	
	public void clickCheckOutBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(checkoutbtn));
		checkoutbtn.click();
	}

}
