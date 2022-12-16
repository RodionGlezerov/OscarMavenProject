package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class FictionBooksPage extends BooksPage {

    public FictionBooksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Fiction')]")
    WebElement fiction;
    public String  getAttributeFiction() {
        return fiction.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'Computers in Literature')]")
    WebElement computers;
    public FictionBooksPage clickComputersInLiterature() {
        click(computers);
        return new ComputersInLiteraturePage(driver);
    }
}
