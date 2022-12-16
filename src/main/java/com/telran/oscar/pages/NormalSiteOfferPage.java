package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class NormalSiteOfferPage extends OffersPage {

    public NormalSiteOfferPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h1[contains(text(),'Normal site offer')]")
    WebElement normalSitePageAlert;
    public String getAttributeNormalSitePage() {
        return normalSitePageAlert.getText();
    }
}
