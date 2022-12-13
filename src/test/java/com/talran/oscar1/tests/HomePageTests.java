package com.talran.oscar1.tests;

import com.telran.oscar.pages.AllProductsPage;
import com.telran.oscar.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void openAndChangeEN(){
        new HomePage(driver).changeLanguageNew();
    }
}
