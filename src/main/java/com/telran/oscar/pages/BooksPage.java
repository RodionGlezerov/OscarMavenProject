package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class BooksPage extends ClothingPage {

    public BooksPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement books;

    public String getAttributeBooks() {
        return  books.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement fiction;
    public BooksPage clickFictionBooks() {
        click(fiction);
        return new FictionBooksPage(driver);
    }
}
