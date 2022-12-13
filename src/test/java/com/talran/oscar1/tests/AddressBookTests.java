package com.talran.oscar1.tests;

import com.telran.oscar.data.AddressBookData;
import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.pages.AccountPage;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginAndRegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddressBookTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void AddingNewAddressInAddressBook(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new HomePage(driver).clickAccount();
        new AccountPage(driver).clickAddressBook().clickAddNewAddressBook()
                .inputFirstName(AddressBookData.USER_FIRST_NAME)
                .inputLastName(AddressBookData.USER_LAST_NAME)
                .inputFirstLineAdd(AddressBookData.USER_FIRST_LINE_ADDRESS)
                .inputCity(AddressBookData.USER_CITY)
                .inputZipCode(AddressBookData.USER_ZIPCODE)
                .inputCountry()
                .clickSave();
        Assert.assertTrue(new AccountPage(driver).getAttributeAddCreated().contains("created"));
//        new AccountPage(driver).deleteNewAddress();
    }

    @Test
    public void EditingAddressInTheAddressBook(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new HomePage(driver).clickAccount();
        new AccountPage(driver).clickAddressBook()
                .clickEdit().fillNewLastName(AddressBookData.USER_LAST_NAME_NEW).clickSave();
        Assert.assertTrue(new AccountPage(driver).getAttributeAddCreated().contains("updated"));
    }

    @Test
    public void DeletingAddressFromAddressBook(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new HomePage(driver).clickAccount();
        new AccountPage(driver).clickAddressBook().deleteNewAddress();
        Assert.assertTrue(new AccountPage(driver).getAttributeDelete().contains("deleted"));
    }
}
