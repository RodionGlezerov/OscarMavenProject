package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheShellcoderBookPage extends AllProductsPage {

    public TheShellcoderBookPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Add to wish list')]")
    WebElement addToWishList;

    @FindBy(xpath = "//a[contains(text(),\"Add to 'Default' wish list\")]")
    WebElement addToDefaultWishList;
    public TheShellcoderBookPage clickAddToWishList() {
        click(addToWishList);
        click(addToDefaultWishList);
        return this;
    }
}
