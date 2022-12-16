package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class BasketPage extends AllProductsPage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
    WebElement checkoutButton;
    public BasketPage checkout() {
        clickWithJSExecutor(checkoutButton,0,300);
        return new ShippingAddressPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Remove')]")
    WebElement remove;
    public BasketPage removeShellcoder() {
        click(remove);
        return this;
    }
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeBreadCrumbs;

    public BasketPage clickHomeBreadCrumbs() {
        click(homeBreadCrumbs);
        return this;
    }

    @FindBy(xpath = "//h1[contains(text(),'Basket')]")
    WebElement basket;
    public String  getAttributeBasket() {
        return basket.getText();
    }
}

