package com.simplilearn.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;


public class SwagsDemo {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @BeforeTest
    public void setup() {

        // Initialize ChromeDriver
        driver = new EdgeDriver();
        
        //Maximize it
        driver.manage().window().maximize();
        
        driver.get("https://www.saucedemo.com/");
        
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver); 
    }
    
    @Test
    public void buy() {

        // Step 1: Enter standard user as user-name and secret sauce' as password.
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();
        
        // Step 2: Add the first product in the cart.
        productsPage.addToCart();
        
        // Step 3: Click on Cart icon at the top right corner.
        productsPage.goToCart();
        
        // Step 4: Click on 'Checkout' button.
        cartPage.checkout();
        
        // Step 5: Enter your details and click 'Continue' button.
        checkoutPage.enterDetails("Raghunandan", "RK", "586101");

        // Step 6: Click 'Finish' button.
        checkoutPage.finishOrder();

        // Step 7: Verify the text 'Thank you for your order!' is visible.
        String actualText = checkoutPage.getConfirmationText();
        Assert.assertEquals(actualText, "Thank you for your order!");
        
    }
    
    @AfterTest
    public void tearDown() {
        // Step 8: Close the browser.
        driver.quit();
    }

}
