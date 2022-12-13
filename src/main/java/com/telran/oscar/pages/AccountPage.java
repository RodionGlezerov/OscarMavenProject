package com.telran.oscar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class AccountPage extends AllProductsPage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='delete_profile']")
    WebElement delete_profile;
    @FindBy(xpath = "//input[@id='id_password']")
    WebElement pwd;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement deleteButton;

    public AccountPage deleteAccount(String userPwd2) {
        click(delete_profile);
        pause(2000);
        type(pwd,userPwd2);
        click(deleteButton);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Wish Lists')]")
    WebElement wishList;
    public AccountPage clickWishList() {
        click(wishList);
        return this;
    }


    @FindBy(xpath = "//a[contains(text(),'Create a new wish list')]")
    WebElement newWishList;
    @FindBy(id = "id_name")
    WebElement id_name;
    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement save;
    public AccountPage createNewWishList(String text) {
        click(newWishList);
        type(id_name,text);
        click(save);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement wishAttribute;
    public String getAttributeWishList() {
        return wishAttribute.getText();
    }

    @FindBy(xpath = "//tbody/tr[3]/td[3]/div[1]/button[1]")
    WebElement wishDropDown;
    @FindBy(xpath = "//tbody/tr[3]/td[3]/div[1]/div[1]/a[2]")
    WebElement delete;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement confirmDelete;
    public AccountPage deleteWishList() {
        click(wishDropDown);
        click(delete);
        click(confirmDelete);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement delalert;
    public String getAttributeWishListDel() {
        return delalert.getText();
    }

    @FindBy(xpath = "//a[contains(text(),'View')]")
    WebElement view;
    public AccountPage clikcViewDefault() {
        click(view);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]")
    WebElement wishListStatus;
    public String getAttributeWishListDefault() {
        return wishListStatus.getText();
    }

    @FindBy(xpath = "//input[@id='id_lines-0-quantity']")
    WebElement quantity3;

    public AccountPage clikcQuantity(String quantity) {
        type(quantity3,quantity);
        return this;
    }
    @FindBy(xpath = "//button[contains(text(),'Update quantities')]")
    WebElement upadeteQuantity;

    public AccountPage clikcUpdateQuantity() {
        click(upadeteQuantity);
        return this;
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement quantitiesUpdated;

    public String getAttributeQuantity() {
        return quantitiesUpdated.getText();
    }

    @FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]/button[1]")
    WebElement dropDown;
    @FindBy(xpath = "//a[contains(text(),'Remove')]")
    WebElement remove;
    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    WebElement confirmRemove;
    public AccountPage clickViewProductDropDownButton() {
        click(dropDown);
        click(remove);
        click(confirmRemove);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Address Book')]")
    WebElement addressBook;
    public AccountPage clickAddressBook() {
        click(addressBook);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Add a new address')]")
    WebElement addNewAddress;
    public AccountPage clickAddNewAddressBook() {
        click(addNewAddress);
        return this;
    }

    @FindBy(xpath= "//input[@id='id_first_name']")
    WebElement firstName;
    public AccountPage inputFirstName(String userFirstName) {
        type(firstName,userFirstName);
        return this;
    }
    @FindBy(xpath = "//input[@id='id_last_name']")
    WebElement lastName;

    public AccountPage inputLastName(String userLastName) {
        type(lastName,userLastName);
        return this;
    }
    @FindBy(xpath = "//input[@id='id_line1']")
    WebElement line1;

    public AccountPage inputFirstLineAdd(String userFirstLineAddress) {
        type(line1,userFirstLineAddress);
        return this;
    }
    @FindBy(xpath = "//input[@id='id_line4']")
    WebElement city;

    public AccountPage inputCity(String userCity) {
        type(city,userCity);
        return this;
    }

    @FindBy(xpath = "//input[@id='id_postcode']")
    WebElement zipcode;
    public AccountPage inputZipCode(String userZipcode) {
        type(zipcode,userZipcode);
        return this;
    }



    @FindBy(id = "id_country")
    WebElement id_country;
    public AccountPage inputCountry() {
        click(id_country);
        WebElement element = driver.findElement(xpath(format("//option[contains(text(),'Germany')]")));
        click(element);
        return this;
    }

    @FindBy (xpath = "//button[contains(text(),'Save')]")
    WebElement saveAdd;
    public AccountPage clickSave() {
        click(saveAdd);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement addCreated;
    public String getAttributeAddCreated() {
        return addCreated.getText();
    }

    @FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/button[1]")
    WebElement dropDownNewAdd;
    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    WebElement deleteNewAdd;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement confirmDeleteNewAdd;
    public AccountPage deleteNewAddress() {
        click(dropDownNewAdd);
        click(deleteNewAdd);
        click(confirmDeleteNewAdd);
        return this;
    }

    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    WebElement editButton;
    public AccountPage clickEdit() {
        click(editButton);
        return this;
    }

    public AccountPage fillNewLastName(String newLastName) {
        type(lastName,newLastName);
        return this;
    }
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement deleteAlert;

    public String getAttributeDelete() {
        return deleteAlert.getText();
    }
}
