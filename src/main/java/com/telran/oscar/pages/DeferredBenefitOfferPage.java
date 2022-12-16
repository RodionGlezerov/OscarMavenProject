package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class DeferredBenefitOfferPage extends OffersPage {

    public DeferredBenefitOfferPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[contains(text(),'Deferred benefit offer')]")
    WebElement deferredBenefitAlert;
    public String  getAttributeDeferredBenefitPage() {
        return deferredBenefitAlert.getText();
    }
}
