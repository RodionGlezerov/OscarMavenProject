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
}

