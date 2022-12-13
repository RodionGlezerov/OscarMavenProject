package com.talran.oscar1.tests;

import com.telran.oscar.data.UserDataTests;
import com.telran.oscar.pages.HomePage;
import com.telran.oscar.pages.LoginAndRegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegistrationNegativeTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void RegistrationWithEmptyEmailField() {
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_5, UserDataTests.USER_PWD_5);
//        Assert.assertTrue(new LoginAndRegisterPage(driver).alertGetText().contains("Заполните это поле."));
    }
    @Test
    public void RegistrationWithEmptyFirstPasswordField() {
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registrationPasswordFirstEmpty(UserDataTests.USER_EMAIL_6, UserDataTests.USER_PWD_6);

    }
    @Test
    public void RegistrationWithInvalidEmailAndValidPassword() {
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_INVALID_EMAIL_7, UserDataTests.USER_PWD_6);
    }
    @Test
    public void RegistrationWithValidEmailAndInvalidPassword(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_8, UserDataTests.INVALID_USER_PWD_7);
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_8, UserDataTests.INVALID_USER_PWD_8);
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_8, UserDataTests.INVALID_USER_PWD_9);
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_8, UserDataTests.INVALID_USER_PWD_10);
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_8, UserDataTests.INVALID_USER_PWD_11);
    }
    @Test
    public void RegistrationWithExistedUserEmail(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registration(UserDataTests.USER_EMAIL_9, UserDataTests.USER_PWD_12);
    }

    @Test
    public void RegistrationWithDifferentValuesInPasswordAndConfirmPasswordFields(){
        new HomePage(driver).registration();
        new LoginAndRegisterPage(driver).registrationTwoDiffPassword(UserDataTests.USER_EMAIL_6, UserDataTests.USER_PWD_12,UserDataTests.USER_PWD_12_2);
    }

}
