package com.telran.oscar.pages;

import com.telran.oscar.data.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
