package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestoSelection {
	
    private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(xpath = "(//div[contains(@class,'sc-dPyBCJ fJKDKr')])[1]")
    private WebElement firstresto;
    
	public RestoSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickFirstResto() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(firstresto));
		firstresto.click();
	}

}
