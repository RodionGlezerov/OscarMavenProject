package com.talran.oscar1.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://latest.oscarcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
