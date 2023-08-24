package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddFood {
	
    private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(xpath = "(//div[contains(@class,'_3L1X9 _211P0 main_buttonInner__z6Jz0 main_button__3gpqi')])[1]")
    private WebElement firstfood;
    
	public AddFood(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickFirstFood() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(firstfood));
		firstfood.click();
	}
}
