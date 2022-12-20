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

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement clothing;
    public AllProductsPage clickClothing() {
        click(clothing);
        return new ClothingPage(driver);
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/ol[1]/li[1]/article[1]/div[2]/form[1]/button[1]")
    WebElement shellcoder;

    public AllProductsPage addToBasketShellcoder(){
        clickWithJSExecutor(shellcoder,0,200);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement schellcoderAlert;

    public String getAttributeSchellcoder() {
        return schellcoderAlert.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]")
    WebElement viewbuttonShellcoder;
    public AllProductsPage viewBasketShellcoder() {
        click(viewbuttonShellcoder);
        return new BasketPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Checkout now')]")
    WebElement checkout;
    public AllProductsPage clickCheckOut() {
        click(checkout);
        return new ShippingAddressPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'next')]")
    WebElement nextPage;
    public AllProductsPage clickNextPage() {
        clickWithJSExecutor(nextPage,0,1000);
        return this;
    }
    @FindBy(xpath = "//a[contains(text(),'previous')]")
    WebElement previousButton;

    public String  getAttributePrevious() {
        return previousButton.getText();
    }

    public AllProductsPage clickPreviousPage() {
        clickWithJSExecutor(previousButton,0,1000);
        return this;
    }

    public String  getAttributeNext() {
        return nextPage.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeBreadCrumbs;
    public AllProductsPage clickHomeBreadCrumbs() {
        click(homeBreadCrumbs);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement fiction;
    public AllProductsPage clikcFictionOnSidePanel() {
        click(fiction);
        return new FictionBooksPage(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'All products')]")
    WebElement allproductsPageAlert;
    public String getAttributeAllproductPage() {
        return allproductsPageAlert.getText();
    }
    @FindBy(xpath = "//a[@id='navbarDropdown']")
    WebElement browseStore;

    public AllProductsPage clickBrowseStore() {
        click(browseStore);
        return this;
    }
    @FindBy(xpath = "//a[contains(text(),'Offers')]")
    WebElement offers;

    public AllProductsPage clickOffers() {
        click(offers);
        return new OffersPage(driver);
    }
    @FindBy(xpath = "//button[contains(text(),'View basket')]")
    WebElement viewBasket;

    public AllProductsPage clickViewBasketButton() {
        click(viewBasket);
        return new BasketPage(driver);
    }
}

