package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreviewPage extends PageBase {

    public PreviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='place-order']")
    WebElement placeOrder;

    public PreviewPage clickPlaceOrder() {
        clickWithJSExecutor(placeOrder,0,500);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/div[2]/h3[1]/a[1]")
    WebElement changeAddress;
    public PreviewPage clickChangeAddress() {
        click(changeAddress);
        return this;
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[2]/div[2]/h3[1]/a[1]")
    WebElement changePayment;

    public PreviewPage clickChangePayment() {
        click(changePayment);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/div[3]/h3[1]/a[1]")
    WebElement changeShippingMeth;
    public PreviewPage clickChangeShippingMethod() {
        click(changeShippingMeth);
        return this;
    }
}

