package com.talran.oscar1.tests;


import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.data.UserDataTests;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginAndRegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginNegativeTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void LoginWithEmptyEmailAndCorrectPassword(){
        new LoginAndRegisterPage(driver).loginEmptyEmail(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);

    }
    @Test
    public void LoginWithCorrectEmailAndEmptyPassword(){
        new LoginAndRegisterPage(driver).loginEmptyPassword(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
    }
    @Test
    public void LoginWithCorrectEmailAndWrongPassword(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, UserDataTests.USER_PWD_1);
        Assert.assertTrue(new LoginAndRegisterPage(driver).getAttributeError().contains("Please enter a correct username and password. Note that both fields may be case-sensitive."));
    }
    @Test
    public void LoginWithWrongEmailAndCorrectPassword(){
        new LoginAndRegisterPage(driver).login(UserDataTests.USER_EMAIL_1,SmokyUserData.USER_PASSWORD);
        Assert.assertTrue(new LoginAndRegisterPage(driver).getAttributeError().contains("Please enter a correct username and password. Note that both fields may be case-sensitive."));
    }

}
