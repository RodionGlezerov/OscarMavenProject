package com.telran.oscar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.AuthProvider;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[@id='top_page']/div[2]/div[1]/form[1]/div[1]")
    WebElement lang;
    @FindBy(xpath = "//button[contains(text(),'Выполнить')]")
    WebElement change;

    public HomePage changeLanguage() {
        click(lang);
        WebElement element = driver.findElement(xpath(format("//option[contains(text(),'British English')]")));
        click(element);
        pause(2000);
        click(change);
        return this;

    }


    @FindBy(xpath = "//a[@id='login_link']")
    WebElement loginlink;

    public LoginAndRegisterPage registration() {
        click(loginlink);
        return new LoginAndRegisterPage(driver);
    }

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement registration_submit;
    public String getAttribute() {
        return registration_submit.getText();
    }

    @FindBy(id = "logout_link")
    WebElement logout_link;
    public HomePage logout() {
        click(logout_link);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'All products')]")
    WebElement allProducts;
    public HomePage allProducts() {
        click(allProducts);
        return new AllProductsPage(driver);
    }
}
