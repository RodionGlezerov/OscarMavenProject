package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OffersPage extends AllProductsPage {

    public OffersPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h2[contains(text(),'Normal site offer')]")
    WebElement normalSiteOfferAlert;

    public String  getAttributeNormaSiteOffer() {
        return normalSiteOfferAlert.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/article[1]/div[2]/form[1]/button[1]")
    WebElement addToBasketShellCoder;
    public OffersPage addToBasketShellcoderOfferPage() {
        click(addToBasketShellCoder);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]")
    WebElement shellcoderOffersPageAlert;
    public String  getAttributeSchellcoderOffersPage() {
        return shellcoderOffersPageAlert.getText();
    }
    @FindBy(xpath = "//h2[contains(text(),'Deferred benefit offer')]")
    WebElement deferredBenefitOfferAlert;

    public String  getAttributeDeferredBenefit() {
        return deferredBenefitOfferAlert.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/ul[2]/li[2]/article[1]/div[2]/form[1]/button[1]")
    WebElement hackingExposedBookOffersPage;
    public OffersPage addToBasketHackingExposedWirelessOfferPage() {
        clickWithJSExecutor(hackingExposedBookOffersPage,0,400);
        return this;
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]")
    WebElement getHackingExposedBookOffersPageAlert;

    public String  getAttributeHackingExposedAlert() {
        return getHackingExposedBookOffersPageAlert.getText();
    }

    @FindBy(xpath = "//h2[contains(text(),'Shipping offer')]")
    WebElement shippingfOfferAlert;
    public String getAttributeShippingOffer() {
        return shippingfOfferAlert.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/ul[3]/li[3]/article[1]/div[2]/form[1]/button[1]")
    WebElement codersAtWorkOfferPageShippingSection;
    public OffersPage addToBasketCodersAtWorkOfferPage() {
        clickWithJSExecutor(codersAtWorkOfferPageShippingSection,0,600);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]")
    WebElement codersAtWorkAlert;
    public String  getAttributeCodersAtWorkAlert() {
        return codersAtWorkAlert.getText();
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/p[2]/a[1]")
    WebElement browseProductNormaSite;

    public OffersPage clikcBrowseProductButtonInNormalSiteOffer() {
        clickWithJSExecutor(browseProductNormaSite,0,300);
        return new NormalSiteOfferPage(driver);
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/p[4]/a[1]")
    WebElement browseProductDeferredBenefit;

    public OffersPage clickBrowseProductButtonInDeferredBenefitOffer() {
        clickWithJSExecutor(browseProductDeferredBenefit,0,500);
        return new DeferredBenefitOfferPage(driver);
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/p[6]/a[1]")
    WebElement browseProductShippingOffer;

    public OffersPage clickBrowseProductButtonInShippingOffer() {
        clickWithJSExecutor(browseProductShippingOffer,0,1000);
        return new ShippingOfferPage(driver);
    }
}
