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
        Assert.assertTrue(new NonFictionBooksPage(driver).getAttributeNonFiction().contains("Non-Fiction"));
        new NonFictionBooksPage(driver).clickEssentialProgramming();
        Assert.assertTrue(new EssentialProgrammingPage(driver).getAttributeEssential().contains("Essential"));
        new EssentialProgrammingPage(driver).clickHacking();
        Assert.assertTrue(new HackingPage(driver).getAttributeHacking().contains("Hacking"));
    }

    @Test
    public void clickabilityClothing(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new AllProductsPage(driver).clickClothing();
        Assert.assertTrue(new ClothingPage(driver).getAttributeClothing().contains("Clothing"));
    }
    @Test
    public void clickabilityBooks(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new ClothingPage(driver).clickBooks();
        Assert.assertTrue(new BooksPage(driver).getAttributeBooks().contains("Books"));
    }
    @Test
    public void clickabilityFiction(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new BooksPage(driver).clickFictionBooks();
        Assert.assertTrue(new FictionBooksPage(driver).getAttributeFiction().contains("Fiction"));
    }
    @Test
    public void clickabilityComputersInLiterature(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new FictionBooksPage(driver).clickComputersInLiterature();
        Assert.assertTrue(new ComputersInLiteraturePage(driver).getAttributeCompLiter().contains("Computers in Literature"));
    }
    @Test
    public void clickabilityNonFiction(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new ComputersInLiteraturePage(driver).clikcNonFiction();
        Assert.assertTrue(new NonFictionBooksPage(driver).getAttributeNonFiction().contains("Non-Fiction"));
    }
    @Test
    public void clickabilityEssentialProgramming(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new NonFictionBooksPage(driver).clickEssentialProgramming();
        Assert.assertTrue(new EssentialProgrammingPage(driver).getAttributeEssential().contains("Essential"));
    }
    @Test
    public void clickabilityHacking(){
        new LoginAndRegisterPage(driver).login(SmokyUserData.USER_EMAIL, SmokyUserData.USER_PASSWORD);
        new EssentialProgrammingPage(driver).clickHacking();
        Assert.assertTrue(new HackingPage(driver).getAttributeHacking().contains("Hacking"));
    }

}
