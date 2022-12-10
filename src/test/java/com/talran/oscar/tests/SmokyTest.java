package com.talran.oscar.tests;

import com.telran.oscar.data.UserData;
import com.telran.oscar.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokyTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguage();
    }

    @Test
    public void smokyTask(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserData.USER_EMAIL,UserData.USER_PASSWORD);
        new HomePage(driver).logout();
        new LoginAndRegisterPage(driver).login(UserData.USER_EMAIL,UserData.USER_PASSWORD);
        Assert.assertTrue(new HomePage(driver).getAttribute().contains("Welcome back"));
        new HomePage(driver).allProducts();
        new AllProductsPage(driver).addToBasketFirstItem();
        Assert.assertTrue(new AllProductsPage(driver).getAttribute().contains("The shellcoder's handbook has been added to your basket."));
        new AllProductsPage(driver).viewBasket();
        new BasketPage(driver).checkout();
        Assert.assertTrue(new ShippingAddressPage(driver).getAttribute().contains("Shipping address"));
        new ShippingAddressPage(driver).inputTitle()
                .inputFirstName(UserData.FIRST_NAME)
                .inputLastName(UserData.LAST_NAME)
                .inputAddress(UserData.ADDRESS)
                .inputCity(UserData.CITY)
                .inputPostCode(UserData.POST_CODE)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickPlaceOrder();
        new ConfirmationPage(driver);
        Assert.assertTrue(new ConfirmationPage(driver).getAttribute().contains("The shellcoder's handbook"));

    }
    @Test
    public void smokyWithOutRegistration(){
        new LoginAndRegisterPage(driver).login(UserData.USER_EMAIL,UserData.USER_PASSWORD);
        new HomePage(driver).allProducts();
        new AllProductsPage(driver).addToBasketFirstItem();
        Assert.assertTrue(new AllProductsPage(driver).getAttribute().contains("The shellcoder's handbook has been added to your basket."));
        new AllProductsPage(driver).viewBasket();
        new BasketPage(driver).checkout();
        Assert.assertTrue(new ShippingAddressPage(driver).getAttribute().contains("Shipping address"));
        new ShippingAddressPage(driver).inputTitle()
                .inputFirstName(UserData.FIRST_NAME)
                .inputLastName(UserData.LAST_NAME)
                .inputAddress(UserData.ADDRESS)
                .inputCity(UserData.CITY)
                .inputPostCode(UserData.POST_CODE)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickPlaceOrder();
        new ConfirmationPage(driver);
        Assert.assertTrue(new ConfirmationPage(driver).getAttribute().contains("The shellcoder's handbook"));

    }
}
