package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PageBase {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='view_preview']")
    WebElement cont;
    public PaymentPage clickContinue() {
        click(cont);
        return this;
    }
    @FindBy(xpath = "//h1[contains(text(),'Enter payment details')]")
    WebElement paymentDetailsLable;

    public String getAttributePaymentDetails() {
        return paymentDetailsLable.getText();
    }
}
