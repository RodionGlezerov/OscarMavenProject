package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class ComputersInLiteraturePage extends FictionBooksPage {

    public ComputersInLiteraturePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers in Literature')]")
    WebElement compLiter;
    public String  getAttributeCompLiter() {
        return compLiter.getText();
    }
    @FindBy(xpath = "//a[contains(text(),'Non-Fiction')]")
    WebElement nonFiction;

    public ComputersInLiteraturePage clikcNonFiction() {
        click(nonFiction);
        return new NonFictionBooksPage(driver);
    }
}
