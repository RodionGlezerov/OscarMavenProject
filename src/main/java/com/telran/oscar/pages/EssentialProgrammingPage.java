package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class EssentialProgrammingPage extends NonFictionBooksPage {

    public EssentialProgrammingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Essential programming')]")
    WebElement essential;
    public String  getAttributeEssential() {
        return essential.getText();
    }
    @FindBy(xpath = "//a[contains(text(),'Hacking')]")
    WebElement hacking;

    public EssentialProgrammingPage clickHacking() {
        clickWithJSExecutor(hacking,0,200);
        return new HackingPage(driver);
    }
}
