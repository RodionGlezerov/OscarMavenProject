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

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/ol[1]/li[1]/article[1]/h3[1]/a[1]")
    WebElement djangoTshirt;

    public ClothingPage clickDjangoTshirt() {
        click(djangoTshirt);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/article[1]/div[1]/div[2]/a[1]")
    WebElement djangoTshirtFirstItem;

    public ClothingPage chooseDjangoTshirtFirstItem() {
        click(djangoTshirtFirstItem);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Add to basket')]")
    WebElement addToBasket;

    public ClothingPage addToBasket() {
        click(addToBasket);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]")
    WebElement viewBasket;

    public ClothingPage clickViewBasket() {
        clickWithJSExecutor(viewBasket,0,400);
        return this;
    }

    @FindBy(xpath = "//h2[contains(text(),'Product Information')]")
    WebElement productInfo;
    public String  getAttributeProductInformation() {
        return productInfo.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'I have a voucher code...')]")
    WebElement voucherButton;
    public ClothingPage clickVoucherButton() {
        click(voucherButton);
        return this;
    }

    @FindBy(xpath = "//label[contains(text(),'Code')]")
    WebElement code;
    public String  getAttributeCodeVoucherLable() {
        return code.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    WebElement checkOutButton;
    public ClothingPage clickCheckOutButton() {
        clickWithJSExecutor(checkOutButton,0,500);
        return this;
    }
}
