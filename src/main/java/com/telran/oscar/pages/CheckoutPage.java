package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.Collection;

public class CheckoutPage extends AllProductsPage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Who are you?')]")
    WebElement whoareyou;
    public String getAttributeCheckoutPage() {
        return whoareyou.getText();
    }
}
