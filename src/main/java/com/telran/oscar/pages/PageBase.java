package com.telran.oscar.pages;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class PageBase {
    public WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        element.click();

    }

    public void pause(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void type(WebElement element, String text) {
        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }

    public void clickWithJSExecutor(WebElement element, int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        click(element);
    }

    public void typeWithJSExecutor(WebElement element, String text, int x, int y) {
        if (text != null) {
            clickWithJSExecutor(element, x, y);
            element.clear();
            element.sendKeys(text);
        }
    }
    public void scrollD(int x,int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
    }



    public String takeScreenshot(String pathToFile) {

        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshot = new File(pathToFile);

        try {
            Files.copy(tmp, screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshot.getAbsolutePath();
    }

    public void hideAd() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('adplus-anchor').style.display='none'");

    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");

    }

    public void clickWithRectangle(WebElement element, int i, int j) {

        Rectangle rectangle = element.getRect();

        int offSetX = rectangle.getWidth() / i;
        int offSetY = rectangle.getHeight() / j;

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.moveByOffset(-offSetX, -offSetY).click().perform();

    }

    protected void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage() + "is a broken link");
            } else {
                System.out.println(linkUrl + " - " + httpURLConnection.getResponseMessage());
            }
        } catch (Exception e){
            System.out.println(linkUrl + " - " + e.getMessage() + " - is a broken link" );
        }
    }
    public Screenshot takeScreenshotWithScrollDown(){
        Screenshot screen = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(2.0f),1000))
                .takeScreenshot(driver);
        try {
            ImageIO.write(screen.getImage(),"png",new File("screenshot/screen"+ System.currentTimeMillis()+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return screen;
    }

}
