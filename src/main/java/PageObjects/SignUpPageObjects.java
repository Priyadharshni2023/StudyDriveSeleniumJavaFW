package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects
{
    public By SignUpButton = By.xpath("//*[@id='main-container']/div[1]/div/div/nav/div/button[2]");
    public By EmailInputField = By.xpath("//input[@type='email']");
    public By PasswordInputField = By.xpath("//input[@type='password']");
    public By SignUpForFreeButton = By.xpath("//button[@class='mt-1 w-full btn btn-cta-surfaced btn-md neutral']");
    public By CookiesAcceptAllButton = By.xpath("//*[@id='uc-center-container']/div[2]/div/div[1]/div/button[2]");
    public By container = By.xpath("//div[@id='uc-center-container']");
    public By errorMessageForDuplicateMail = By.xpath("//*[text() =\"There is an account using this email address already\"]");
    public By errorMessageForInvalidMail = By.xpath("//*[text() ='Please enter a valid email address']");
    public SignUpPageObjects(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}