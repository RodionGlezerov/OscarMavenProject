package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductsPage extends HomePage {

    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ol[1]/li[1]/article[1]/div[2]/form[1]/button[1]")
    WebElement firstBookAddToBasket;

    public AllProductsPage addToBasketFirstItem() {
        click(firstBookAddToBasket);
        return this;

    }
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement addToBasketAlert;
    public String getAttribute() {
        return addToBasketAlert.getText();
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/p[2]/a[1]")
    WebElement viewBasketButton;
    public AllProductsPage viewBasket() {
        clickWithJSExecutor(viewBasketButton,0,200);
        return new BasketPage(driver);
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement alert;
    public String getAttributeReg() {
        return alert.getText();
    }

    @FindBy(xpath = "//nav[@id='top_page']")
    WebElement navbar;
    public String getAttributeLogout() {
        return navbar.getText();
    }
    @FindBy(xpath = "//body/nav[@id='top_page']/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement account;

    public AllProductsPage clickAccount() {
        click(account);
        return new AccountPage(driver);
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/ol[1]/li[1]/article[1]/h3[1]/a[1]")
    WebElement theShellcoderBook;
    public AllProductsPage addToWishTheShellcoderBook() {
        click(theShellcoderBook);

        return new TheShellcoderBookPage(driver);
    }
}

