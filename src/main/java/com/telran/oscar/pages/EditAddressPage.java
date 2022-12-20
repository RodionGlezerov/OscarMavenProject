package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.ObjectFactory;

import java.util.Collection;

public class EditAddressPage extends PageBase {

    public EditAddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Edit address')]")
    WebElement editAddressLable;
    public String getAttributeEdit() {
        return editAddressLable.getText();
    }
}
