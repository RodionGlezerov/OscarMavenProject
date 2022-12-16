package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class ShippingOfferPage extends OffersPage {

    public ShippingOfferPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Shipping offer')]")
    WebElement shippingOfferPageAlert;

    public String getAttributeShippingOfferPage() {
        return shippingOfferPageAlert.getText();
    }
}
