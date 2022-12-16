package com.talran.oscar1.tests;

import com.telran.oscar.data.UserDataTests;
import com.telran.oscar.pages.AccountPage;
import com.telran.oscar.pages.AllProductsPage;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginAndRegisterPage;
import com.telran.oscar.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegistrationPositiveTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "register")
    public void RegistrationWithCorrectEmailAndPasswordDataProvider(String email,String password){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(email,password);
        Assert.assertTrue(new AllProductsPage(driver).getAttributeReg().contains("Thanks for registering!"));
        new AllProductsPage(driver).clickAccount();
        new AccountPage(driver).deleteAccount(password);
    }

}
