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
    @FindBy(xpath = "//input[@id='id_form-0-quantity']")
    WebElement formQuantity;

    @FindBy(xpath = "//button[contains(text(),'Update')]")
    WebElement updateButton;
    public BasketPage updateQuantity(String quantity) {
        type(formQuantity,quantity);
        click(updateButton);
        return this;
    }

    @FindBy(css = ".alert.alert-dismissible.fade.show.alert-info")
    WebElement infoMessages;
    public String getAttributeTotal() {
        return infoMessages.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'Remove')]")
    WebElement removeQuantity;
    public BasketPage removeQuantity() {
        clickWithJSExecutor(removeQuantity,0,300);
        return this;
    }


    public BasketPage clikcHomeInBreadCrumbs() {
        click(homeBreadCrumbs);
        return this;
    }
    @FindBy(xpath = "//a[contains(text(),'Continue shopping')]")
    WebElement continueShopping;

    public BasketPage clickContinueShopping() {
        click(continueShopping);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement imageDjangoTshirt;
    public BasketPage clickImageDjangoTshirt() {
        click(imageDjangoTshirt);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Django T-shirt (Size: Medium)')]")
    WebElement djangoTshirtLable;
    public BasketPage clickItemLabelDjangoTshirt() {
        click(djangoTshirtLable);
        return this;
    }
}

