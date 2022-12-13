package com.talran.oscar1.tests;

import com.telran.oscar.data.UserDataTests;
import com.telran.oscar.pages.AccountPage;
import com.telran.oscar.pages.AllProductsPage;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginAndRegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegistrationPositiveTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void RegistrationWithCorrectEmailAndPassword_1(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_1,UserDataTests.USER_PWD_1);
        Assert.assertTrue(new AllProductsPage(driver).getAttributeReg().contains("Thanks for registering!"));
        Assert.assertTrue(new AllProductsPage(driver).getAttributeLogout().contains("Logout"));
        new AllProductsPage(driver).clickAccount();
        new AccountPage(driver).deleteAccount(UserDataTests.USER_PWD_1);
    }

    @Test
    public void RegistrationWithCorrectEmailAndPassword_2(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_2,UserDataTests.USER_PWD_2);
        Assert.assertTrue(new AllProductsPage(driver).getAttributeReg().contains("Thanks for registering!"));
        Assert.assertTrue(new AllProductsPage(driver).getAttributeLogout().contains("Logout"));
        new AllProductsPage(driver).clickAccount();
        new AccountPage(driver).deleteAccount(UserDataTests.USER_PWD_2);
    }
    @Test
    public void RegistrationWithCorrectEmailAndPassword_3(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_3,UserDataTests.USER_PWD_3);
        Assert.assertTrue(new AllProductsPage(driver).getAttributeReg().contains("Thanks for registering!"));
        Assert.assertTrue(new AllProductsPage(driver).getAttributeLogout().contains("Logout"));
        new AllProductsPage(driver).clickAccount();
        new AccountPage(driver).deleteAccount(UserDataTests.USER_PWD_3);

    }
    @Test
    public void RegistrationWithCorrectEmailAndPassword_4(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_4,UserDataTests.USER_PWD_4);
        Assert.assertTrue(new AllProductsPage(driver).getAttributeReg().contains("Thanks for registering!"));
        Assert.assertTrue(new AllProductsPage(driver).getAttributeLogout().contains("Logout"));
        new AllProductsPage(driver).clickAccount();
        new AccountPage(driver).deleteAccount(UserDataTests.USER_PWD_4);
    }
}
