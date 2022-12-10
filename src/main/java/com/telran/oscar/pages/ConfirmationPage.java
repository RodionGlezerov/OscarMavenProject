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
}
