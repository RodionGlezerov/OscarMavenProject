package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonFictionBooksPage extends ComputersInLiteraturePage {

    public NonFictionBooksPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h1[contains(text(),'Non-Fiction')]")
    WebElement nonFiction;

    public String  getAttributeNonFiction() {
        return nonFiction.getText();
    }
    @FindBy(xpath = "//a[contains(text(),'Essential programming')]")
    WebElement essential;

    public NonFictionBooksPage clickEssentialProgramming() {
        click(essential);
        return new EssentialProgrammingPage(driver);
    }
}
