package TestMethods;
import BasePckage.BaseClass;
import PageObjects.* ;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePageMethods extends BaseClass {


    HomePageObjects homObj = new HomePageObjects(driver);

    @Test
    public void readTheAppGuideTest()
    {
        for(int i=0;i<3;i++)
        {
            new WebDriverWait(driver,30).
                    until(ExpectedConditions.visibilityOfElementLocated(homObj.NextButton));
            driver.findElement(homObj.NextButton).click();
        }
       new WebDriverWait(driver,30).
        until(ExpectedConditions.visibilityOfElementLocated(homObj.GotIt));
        driver.findElement(homObj.GotIt).click();
       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(homObj.GotItAgain));
        driver.findElement(homObj.GotItAgain).click();
        Assert.assertTrue(driver.findElement(homObj.ProfileIcon).isDisplayed());
    }

    @Test
    public void logoutTest()
    {
        driver.findElement(homObj.ProfileIcon).click();
        driver.findElement(homObj.LogoutButton).click();
        SignUpPageObjects sUpObj = new SignUpPageObjects(driver);
        new WebDriverWait(driver,30).
                until(ExpectedConditions.visibilityOfElementLocated(sUpObj.SignUpButton));
        Assert.assertTrue(driver.findElement(sUpObj.SignUpButton).isDisplayed());
    }

    @Test
    public void deleteAccount()
    {
        driver.findElement(homObj.ProfileIcon).click();
        driver.findElement(homObj.SettingsButton).click();
        new WebDriverWait(driver,30).
                until(ExpectedConditions.visibilityOfElementLocated(homObj.SettingsBanner));
        WebElement element = driver.findElement(homObj.PerDeleteAccount);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(homObj.PerDeleteAccount).click();
        driver.findElement(homObj.DeleteAcc).click();
}

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }
}
