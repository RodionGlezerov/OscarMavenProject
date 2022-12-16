package com.talran.oscar1.tests;

import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BooksPagesTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void FunctionalSmokyTest_1(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).addToBasketShellcoder();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeSchellcoder().contains("The shellcoder's handbook has been added to your basket."));
        new AllProductsPage(driver).viewBasketShellcoder();
        Assert.assertTrue(new BasketPage(driver).getAttributeBasket().contains("Basket"));
        new BasketPage(driver).removeShellcoder().clickHomeBreadCrumbs();
        new AllProductsPage(driver).addToBasketShellcoder();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeSchellcoder().contains("The shellcoder's handbook has been added to your basket."));
        new AllProductsPage(driver).clickCheckOut();
        Assert.assertTrue(new ShippingAddressPage(driver).getAttributeShippingPage().contains("Shipping address"));
    }
    @Test
    public void FunctionalSmokyTest_2(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickNextPage();
        Assert.assertTrue(new AllProductsPage(driver).getAttributePrevious().contains("previous"));
        new AllProductsPage(driver).clickPreviousPage();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeNext().contains("next"));
        new AllProductsPage(driver).clikcFictionOnSidePanel().clickHomeBreadCrumbs();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeAllproductPage().contains("All products"));
    }
}
