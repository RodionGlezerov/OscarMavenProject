package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

import static java.lang.String.format;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class ShippingAddressPage extends BasketPage {

    public ShippingAddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]")
    WebElement subHeader;
    public String getAttribute() {
        return subHeader.getText();
    }

    @FindBy(id = "id_title")
    WebElement id_title;

    public ShippingAddressPage inputTitle() {
        click(id_title);
        WebElement element = driver.findElement(xpath(format("//option[contains(text(),'Mr')]")));
        click(element);
        return this;
    }
    @FindBy(id = "id_first_name")
    WebElement firstName;

    public ShippingAddressPage inputFirstName(String text) {
        type(firstName,text);
        return this;
    }

    @FindBy(id = "id_last_name")
    WebElement lastName;
    public ShippingAddressPage inputLastName(String text) {
        type(lastName,text);
        return this;
    }

    @FindBy(id = "id_line1")
    WebElement address;
    public ShippingAddressPage inputAddress(String text) {
        type(address,text);
        return this;
    }

    @FindBy(id = "id_line4")
    WebElement city;
    public ShippingAddressPage inputCity(String text) {
        typeWithJSExecutor(city,text,0,200);
        return this;
    }
    @FindBy(id = "id_postcode")
    WebElement postcode;

    public ShippingAddressPage inputPostCode(String text) {
        typeWithJSExecutor(postcode,text,0,200);
        return this;
    }

    @FindBy(id = "id_country")
    WebElement id_country;
    public ShippingAddressPage inputCountry() {
        click(id_country);
        WebElement element = driver.findElement(xpath(format("//option[contains(text(),'Germany')]")));
        click(element);
        return this;
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement cont;

    public ShippingAddressPage clickContinue() {
        click(cont);
        return this;
    }

    @FindBy(xpath = "//h1[contains(text(),'Shipping address')]")
    WebElement shippingAddressPage;
    public String  getAttributeShippingPage() {
        return shippingAddressPage.getText();
    }
}
