package com.talran.oscar1.tests;

import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OffersTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void NormaSiteOfferSectionAddToBasketTest() {
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickBrowseStore().clickOffers();
        Assert.assertTrue(new OffersPage(driver).getAttributeNormaSiteOffer().contains("Normal site offer"));
        new OffersPage(driver).addToBasketShellcoderOfferPage();
        Assert.assertTrue(new OffersPage(driver).getAttributeSchellcoderOffersPage().contains("The shellcoder's handbook"));

    }
    @Test
    public void DeferredBenefitOfferSectionAddToBasketTest() {
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickBrowseStore().clickOffers();
        Assert.assertTrue(new OffersPage(driver).getAttributeDeferredBenefit().contains("Deferred"));
        new OffersPage(driver).addToBasketHackingExposedWirelessOfferPage();
        Assert.assertTrue(new OffersPage(driver).getAttributeHackingExposedAlert().contains("Hacking"));

    }
    @Test
    public void ShippingOfferSectionAddToBasketTest() {
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickBrowseStore().clickOffers();
        Assert.assertTrue(new OffersPage(driver).getAttributeShippingOffer().contains("Shipping"));
        new OffersPage(driver).addToBasketCodersAtWorkOfferPage();
        Assert.assertTrue(new OffersPage(driver).getAttributeCodersAtWorkAlert().contains("Coders"));
    }

    @Test
    public void BrowseProductsInOfferButtonsNormalSiteOfferTest(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickBrowseStore().clickOffers();
        new OffersPage(driver).clikcBrowseProductButtonInNormalSiteOffer();
        Assert.assertTrue(new NormalSiteOfferPage(driver).getAttributeNormalSitePage().contains("Normal"));
    }

    @Test
    public void BrowseProductsInOfferButtonsDeferredBenefitOfferTest(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickBrowseStore().clickOffers();
        new OffersPage(driver).clickBrowseProductButtonInDeferredBenefitOffer();
        Assert.assertTrue(new DeferredBenefitOfferPage(driver).getAttributeDeferredBenefitPage().contains("Deferred"));
    }
    
    @Test
    public void BrowseProductsInOfferButtonsShippingOfferTest(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickBrowseStore().clickOffers();
        new OffersPage(driver).clickBrowseProductButtonInShippingOffer();
        Assert.assertTrue(new ShippingOfferPage(driver).getAttributeShippingOfferPage().contains("Shipping"));
    }


}
