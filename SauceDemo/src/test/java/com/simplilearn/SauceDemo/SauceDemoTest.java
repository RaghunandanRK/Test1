package com.simplilearn.SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemoTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        driver = new EdgeDriver();
        
        //Maximize it
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://www.saucedemo.com/");
        
    }

    @Test
    public void testCheckout() {
    	
    	// Enter username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click the login button
        driver.findElement(By.id("login-button")).click();

        // Add the first product to the cart
        driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .btn_inventory")).click();

        // Click on the cart icon at the top right corner
        driver.findElement(By.className("shopping_cart_link")).click();
        
        // Click on the 'Checkout' button
        driver.findElement(By.id("checkout")).click();

        // Enter details (name, postal code)
        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("postal-code")).sendKeys("12345");

        // Click the 'Continue' button
        driver.findElement(By.id("continue")).click();

        // Click the 'Finish' button
        driver.findElement(By.id("finish")).click();

        // Verify the text 'Thank you for your order!' is visible
        WebElement orderConfirmation = driver.findElement(By.cssSelector(".complete-header"));
        Assert.assertEquals("Thank you for your order!", orderConfirmation.getText());
    }

////    @After
////    public void teardown() {
////        // Close the browser
////        driver.quit();
//    }
}
