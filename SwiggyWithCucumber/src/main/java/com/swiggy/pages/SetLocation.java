package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetLocation {
	
    private WebDriver driver;
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(id = "location")
	private WebElement locationBox;
	
    public SetLocation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    
	@FindBy(xpath = "//div[contains(@class,'_1oLDb')]")
	private WebElement autoCompleteBox;
    
	public void searchLoc(String searchQuery) throws InterruptedException {
		locationBox.sendKeys(searchQuery);
		wait.until(ExpectedConditions.visibilityOfAllElements(autoCompleteBox));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
    
    

}
