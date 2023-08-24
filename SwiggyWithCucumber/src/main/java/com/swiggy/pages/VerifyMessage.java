package com.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyMessage {
	
    private WebDriver driver;
    private WebDriverWait wait;
	
    @FindBy(xpath = "//div[contains(text(), 'To place your order now, log in to your existing account or sign up.')]")
	private WebElement verifyTheText;
	
	public VerifyMessage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String getVerifyTheText() {
		wait.until(ExpectedConditions.visibilityOf(verifyTheText));
		String text = verifyTheText.getText();
		return text;
	}
}
