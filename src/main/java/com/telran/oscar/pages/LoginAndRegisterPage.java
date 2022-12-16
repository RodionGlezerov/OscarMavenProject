package com.telran.oscar.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class LoginAndRegisterPage extends PageBase {

    public LoginAndRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_registration-email")
    WebElement emailElement;

    @FindBy(id = "id_registration-password1")
    WebElement pwdElement;

    @FindBy(id = "id_registration-password2")
    WebElement confirmPwd;
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton;


    public LoginAndRegisterPage registration(String email,String pwd) {
        type(emailElement,email);
        type(pwdElement,pwd);
        type(confirmPwd,pwd);
        click(registerButton);
        return this;
    }

    @FindBy(id = "id_login-username")
    WebElement login_username;
    @FindBy(id = "id_login-password")
    WebElement  login_password;
    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    WebElement loginButton;
    @FindBy(xpath = "//a[@id='login_link']")
    WebElement login_link;

    public LoginAndRegisterPage login(String email,String pwd) {
        click(login_link);
        type(login_username,email);
        type(login_password,pwd);
        click(loginButton);
        pause(2000);
        return this;
    }


    public String alertGetText() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        return alert.getText() ;
    }

    public LoginAndRegisterPage registrationPasswordFirstEmpty(String email, String pwd) {
        type(emailElement,email);
        type(confirmPwd,pwd);
        click(registerButton);
        return this;
    }

    public void registrationTwoDiffPassword(String email, String pwd1,String pwd2) {
        type(emailElement,email);
        type(pwdElement,pwd1);
        type(confirmPwd,pwd2);
        click(registerButton);
        pause(2000);
    }

    public LoginAndRegisterPage loginEmptyEmail(String email, String pwd) {
        click(login_link);
        type(login_password,pwd);
        click(loginButton);
        pause(2000);
        return this;
    }

    public LoginAndRegisterPage loginEmptyPassword(String email, String pwd) {
        click(login_link);
        type(login_username,email);
        click(loginButton);
        pause(2000);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]")
    WebElement error;
    public String getAttributeError() {
        return error.getText();
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]")
    WebElement oops;
    public String getAttributeErrorPwd() {
        return oops.getText();
    }

    @FindBy(xpath = "//li[contains(text(),'Login or register')]")
    WebElement loginOrRegister;
    public String getAttributeLoginOrRegister() {
        return loginOrRegister.getText();
    }


}
