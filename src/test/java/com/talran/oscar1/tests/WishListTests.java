package com.talran.oscar1.tests;

import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.data.WishListData;
import com.telran.oscar.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishListTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void CreatingNewWishListAndDelete(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new HomePage(driver).clickAccount();
        new AccountPage(driver).clickWishList().createNewWishList(WishListData.WISHLIST_NAME);
        Assert.assertTrue(new AccountPage(driver).getAttributeWishList().contains("Your wishlist has been created"));
        new AccountPage(driver).clickWishList().deleteWishList();
    }
    @Test
    public void DeleteNewWishList(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new HomePage(driver).clickAccount();
        new AccountPage(driver).clickWishList().createNewWishList(WishListData.WISHLIST_NAME);
        new AccountPage(driver).clickWishList().deleteWishList();
        Assert.assertTrue(new AccountPage(driver).getAttributeWishListDel().contains("Your 'Test' wish list has been deleted"));
    }

    @Test
    public void ViewingDefaultWishList(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new HomePage(driver).clickAccount();
        new AccountPage(driver).clickWishList().clikcViewDefault();
        Assert.assertTrue(new AccountPage(driver).getAttributeWishListDefault().contains("Your wish list is empty."));
    }
    @Test
    public void UpdatingQuantityInDefaultWishList(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).addToWishTheShellcoderBook();
        new TheShellcoderBookPage(driver).clickAddToWishList().clickAccount();
        new AccountPage(driver).clickWishList().clikcViewDefault().clikcQuantity(WishListData.QUANTITY).clikcUpdateQuantity();
        Assert.assertTrue(new AccountPage(driver).getAttributeQuantity().contains("Quantities updated."));
        new AccountPage(driver).clickViewProductDropDownButtonAndRemove();
    }


}
