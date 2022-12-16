package com.talran.oscar1.tests;

import com.telran.oscar.data.SmokyUserData;
import com.telran.oscar.pages.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SidePanelTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).changeLanguageNew();
    }

    @Test
    public void clickabilityOfSidePanelElements(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickClothing();
        Assert.assertTrue(new ClothingPage(driver).getAttributeClothing().contains("Clothing"));
        new ClothingPage(driver).clickBooks();
        Assert.assertTrue(new BooksPage(driver).getAttributeBooks().contains("Books"));
        new BooksPage(driver).clickFictionBooks();
        Assert.assertTrue(new FictionBooksPage(driver).getAttributeFiction().contains("Fiction"));
        new FictionBooksPage(driver).clickComputersInLiterature();
        Assert.assertTrue(new ComputersInLiteraturePage(driver).getAttributeCompLiter().contains("Computers in Literature"));
        new ComputersInLiteraturePage(driver).clikcNonFiction();
        Assert.assertTrue(new NonFictionBooksPage(driver).getAttributeNonFiction().contains("Fiction"));
        new NonFictionBooksPage(driver).clickEssentialProgramming();
        Assert.assertTrue(new EssentialProgrammingPage(driver).getAttributeEssential().contains("Essential"));
        new EssentialProgrammingPage(driver).clickHacking();
        Assert.assertTrue(new HackingPage(driver).getAttributeHacking().contains("Hacking"));
    }
}
