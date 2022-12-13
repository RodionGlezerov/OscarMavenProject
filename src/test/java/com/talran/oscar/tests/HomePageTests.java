package com.talran.oscar.tests;

import com.telran.oscar.pages.AllProductsPage;
import com.telran.oscar.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test
    public void open(){
        new HomePage(driver);
        System.out.println("Is Open");
    }
    @Test
    public void openAndChangeEN(){
        new HomePage(driver).changeLanguage();
        new AllProductsPage(driver).takeScreenshotWithScrollDown();
    }


}
