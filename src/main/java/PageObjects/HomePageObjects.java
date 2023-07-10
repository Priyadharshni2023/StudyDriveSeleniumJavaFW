
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects
{
    //This element is used to locate the Next Button on onboarding guide pop-up
    public By NextButton = By.xpath("//button[text()='Next']");
    //This element is used to locate the Got It Button on onboarding guide pop-up
    public By GotIt = By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[4]/button");
    //This element is used to locate the Got It Button on onboarding guide pop-up
    public By GotItAgain =By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div[3]/button");
    //This element is used to locate the Profile Icon in Home Page
    public By ProfileIcon = By.xpath("//div[@id=\"profile-button\"]");
    //This element is used to locate the settings option in profile menu
    public By SettingsButton = By.xpath("//*[@id=\"the-top-bar-logged\"]/div/nav/div[2]/div[1]/div[2]/ul/li[2]/a");
    //This element is used to locate the Permenant delete button in settings
    public By PerDeleteAccount = By.xpath("//*[@id=\"main-container\"]/div[3]/div[2]/div/div/div[8]/div[2]/button");
    //This element is used to locate the delete account button in the pop up
    public By DeleteAcc = By.xpath("//*[@id=\"modal-container\"]/div[2]/div/div[2]/div[2]/button[2]");
    public By SettingsBanner = By.xpath("//*[@class='mb-6 text-6xl mt-5 md:text-8xl md:mt-7 md:mb-10 p-7 md:p-0']");
    public By LogoutButton = By.xpath("//i[@class ='icon-logout icon']");
    public HomePageObjects(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}

