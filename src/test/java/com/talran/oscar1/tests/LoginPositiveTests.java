package com.talran.oscar1.tests;

import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.data.UserDataTests;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginAndRegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPositiveTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void loginPositiveTest(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        Assert.assertTrue(new HomePage(driver).getAttributePositive().contains("Welcome back"));
    }

}
