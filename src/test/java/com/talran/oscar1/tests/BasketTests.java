package com.talran.oscar1.tests;

import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.pages.*;
import com.telran.oscar.utils.DataProviders;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasketTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).changeLanguageNew();
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "BasketQuantityOfCloathing")
    public void CheckIfNumbersCanBeEnteredInFieldQuantity(String quantity) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem().addToBasket().clickViewBasket();
        new BasketPage(driver).updateQuantity(quantity);
        Assert.assertTrue(new BasketPage(driver).getAttributeTotal().contains("Your basket total"));
        new BasketPage(driver).removeQuantity();
    }

    @Test
    public void CheckHomeLinksInEmptyBasket() {
        new AllProductsPage(driver).clickViewBasketButton();
        new BasketPage(driver).clikcHomeInBreadCrumbs();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeAllproductPage().contains("All products"));
    }

    @Test
    public void CheckContinueShoppingLinksInEmptyBasket() {
        new AllProductsPage(driver).clickViewBasketButton();
        new BasketPage(driver).clickContinueShopping();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeAllproductPage().contains("All products"));
    }

    @Test
    public void CheckHomeLinksInBasket() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem().addToBasket().clickViewBasket();
        new BasketPage(driver).clikcHomeInBreadCrumbs();
        Assert.assertTrue(new AllProductsPage(driver).getAttributeAllproductPage().contains("All products"));
    }

    @Test
    public void CheckContinueShoppingLinksInBasket() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem().addToBasket().clickViewBasket();
        Assert.assertFalse(new BasketPage(driver).isElementPresent(By.xpath("//a[contains(text(),'Continue shopping')]")));
        new BasketPage(driver).removeQuantity();
    }

    @Test
    public void CheckWhetherTheItemImageWorksAsALink() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket();
        new BasketPage(driver).clickImageDjangoTshirt();
        Assert.assertTrue(new ClothingPage(driver).getAttributeProductInformation().contains("Product Information"));
    }

    @Test
    public void CheckWhetherTheItemLabelWorksAsALink() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket();
        new BasketPage(driver).clickItemLabelDjangoTshirt();
        Assert.assertTrue(new ClothingPage(driver).getAttributeProductInformation().contains("Product Information"));
    }

    @Test(enabled = false)
    public void CheckQuantityChangeBlockButtonsAndLinks() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket();
    }

    @Test
    public void CheckIHaveAVoucherCodeButton() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickVoucherButton();
        Assert.assertTrue(new ClothingPage(driver).getAttributeCodeVoucherLable().contains("Code"));
    }

    @Test
    public void CheckProceedToCheckoutButton() {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        Assert.assertTrue(new ShippingAddressPage(driver).getAttributeShippingPage().contains("Shipping"));
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckAddressFormFieldsWithValidData(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        Assert.assertTrue(new PaymentPage(driver).getAttributePaymentDetails().contains("Enter payment details"));
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressInvalidData")
    public void CheckAddressFormFieldsWithInvalidData(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        Assert.assertTrue(new ShippingAddressPage(driver).getAttributeErrorAlert().contains("We found some error"));
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckEditAddressButton(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickPlaceOrder();
        new ConfirmationPage(driver).clikcContinueShoppingButton();
        new AllProductsPage(driver).addToBasketShellcoder();
        new AllProductsPage(driver).clickCheckOut();
        new ShippingAddressPage(driver).clickEditAddress();
        Assert.assertTrue(new EditAddressPage(driver).getAttributeEdit().contains("Edit"));

    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckShipToThisAddressButton(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickPlaceOrder();
        new ConfirmationPage(driver).clikcContinueShoppingButton();
        new AllProductsPage(driver).addToBasketShellcoder();
        new AllProductsPage(driver).clickCheckOut();
        new ShippingAddressPage(driver).clickShipToThisAddress();
        Assert.assertTrue(new PaymentPage(driver).getAttributePaymentDetails().contains("Enter payment details"));

    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckChangeLinkAddress(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickChangeAddress();
        Assert.assertTrue(new ShippingAddressPage(driver).getAttributeShippingPage().contains("Shipping address"));
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckChangeLinkPayment(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickChangePayment();
        Assert.assertTrue(new PaymentPage(driver).getAttributePaymentDetails().contains("Enter payment details"));

    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckChangeLinkShippingMethod(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickChangeShippingMethod();
        Assert.assertTrue(new PaymentPage(driver).getAttributePaymentDetails().contains("Enter payment details"));
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "addressValidData")
    public void CheckPlaceOrderButton(String name, String lastName, String add, String city, String zip) {
        new AllProductsPage(driver).clickClothing();
        new ClothingPage(driver).clickDjangoTshirt().chooseDjangoTshirtFirstItem()
                .addToBasket().clickViewBasket().clickCheckOutButton();
        new ShippingAddressPage(driver)
                .inputFirstName(name)
                .inputLastName(lastName)
                .inputAddress(add)
                .inputCity(city)
                .inputPostCode(zip)
                .inputCountry()
                .clickContinue();
        new PaymentPage(driver).clickContinue();
        new PreviewPage(driver).clickPlaceOrder();
        Assert.assertTrue(new ConfirmationPage(driver).getAttributeConfirmation().contains("confirmation"));
    }


}
