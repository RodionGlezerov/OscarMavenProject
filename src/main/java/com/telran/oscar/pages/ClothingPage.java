package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class ClothingPage extends AllProductsPage {

    public ClothingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Clothing')]")
    WebElement clothingPageHeader;
    public String getAttributeClothing() {
        return clothingPageHeader.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement books;
    public ClothingPage clickBooks() {
        click(books);
        return new BooksPage(driver);
    }
}
