package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class HackingPage extends EssentialProgrammingPage {

    public HackingPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h1[contains(text(),'Hacking')]")
    WebElement hacking;
    public String getAttributeHacking() {
        return hacking.getText();
    }
}
