package TestMethods;
import BasePckage.BaseClass;
import PageObjects.* ;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SignUpPageMethods extends BaseClass
{
    SignUpPageObjects sUpObj = new SignUpPageObjects(driver);
    WelcomePageObjects welObj = new WelcomePageObjects(driver);
    String sExpectedError = "There is an account using this email address already";
    String sInvalidEmailError = "Please enter a valid email address";
    String sValidEmail = "rpd15996@gmail.com";
    String sValidPassword = "praveenk5858";
    String sExistingEmail = "dharsh15996@gmail.com";
    String sExistingPwd = "test@123";
    String sInvalidEmail = "dharsh15996@gmail.co";

    @BeforeTest
    public void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/freshworks/IdeaProjects/StudyDriveSekeniumJavaFW/src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        String baseUrl = "https://www.studydrive.net/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
    @Test
    public void acceptCookiesTest()
    {
        SignUpPageObjects sUpObj = new SignUpPageObjects(driver);
        WelcomePageObjects welObj = new WelcomePageObjects(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement AcceptAll = (WebElement) js.executeScript("return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"#uc-center-container > div.sc-ikJyIC.gpszuz > div > div.sc-dlVxhl.bEDIID > div > button.sc-gsDKAQ.iXaGJM\")");
        AcceptAll.click();
        Assert.assertTrue(driver.findElement(sUpObj.SignUpButton).isDisplayed());
    }

    @Test
    public void enterSignUpCredentialsTest()
    {
        driver.findElement(sUpObj.SignUpButton).click();
        driver.findElement(sUpObj.EmailInputField).sendKeys(sValidEmail);
        driver.findElement(sUpObj.PasswordInputField).sendKeys(sValidPassword);
        boolean elementDisplayed= driver.findElement(sUpObj.SignUpForFreeButton).isDisplayed();
        Assert.assertTrue(elementDisplayed);
        driver.findElement(sUpObj.SignUpForFreeButton).click();
    }

    @Test
    public void enterExistingCredentialsTest()
    {
        driver.findElement(sUpObj.SignUpButton).click();
        driver.findElement(sUpObj.EmailInputField).sendKeys(sExistingEmail);
        driver.findElement(sUpObj.PasswordInputField).sendKeys(sExistingPwd);
        boolean elementDisplayed= driver.findElement(sUpObj.SignUpForFreeButton).isDisplayed();
        Assert.assertTrue(elementDisplayed);
        driver.findElement(sUpObj.SignUpForFreeButton).click();
        Assert.assertTrue(driver.findElement(sUpObj.errorMessageForDuplicateMail).isDisplayed());
        WebElement ele = driver.findElement(sUpObj.errorMessageForDuplicateMail);
        String sActualError = ele.getText();
        Assert.assertEquals(sActualError,sExpectedError);
    }

    @Test
    public void enterInvalidEmailTest()
    {
        driver.findElement(sUpObj.EmailInputField).clear();
        driver.findElement(sUpObj.EmailInputField).sendKeys(sInvalidEmail);
        boolean elementDisplayed= driver.findElement(sUpObj.SignUpForFreeButton).isDisplayed();
        Assert.assertTrue(elementDisplayed);
        driver.findElement(sUpObj.SignUpForFreeButton).click();
        Assert.assertTrue(driver.findElement(sUpObj.errorMessageForInvalidMail).isDisplayed());
        WebElement ele = driver.findElement(sUpObj.errorMessageForInvalidMail);
        String sActualError = ele.getText();
        Assert.assertEquals(sActualError,sInvalidEmailError);
    }
}
