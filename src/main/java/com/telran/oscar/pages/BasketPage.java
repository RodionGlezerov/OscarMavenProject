package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends AllProductsPage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    WebElement checkoutButton;
    public BasketPage checkout() {
        clickWithJSExecutor(checkoutButton,0,300);
        return new ShippingAddressPage(driver);
    }
}

