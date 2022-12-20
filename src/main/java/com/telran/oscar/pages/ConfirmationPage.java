package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class ConfirmationPage extends PageBase {

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[6]/div[1]/div[2]")
    WebElement row;
    public String getAttribute() {
        scrollD(0,500);
        return row.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'Continue shopping')]")
    WebElement continueShopping;
    public ConfirmationPage clikcContinueShoppingButton() {
        clickWithJSExecutor(continueShopping,0,500);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]")
    WebElement infoHeaderAlert;
    public String getAttributeConfirmation() {
        return infoHeaderAlert.getText();
    }
}
