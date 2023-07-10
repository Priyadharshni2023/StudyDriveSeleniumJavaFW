package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageObjects
{
    public By EmailInputField = By.xpath("//input[@id='username']");
    public By GenderButton = By.xpath("//i[@class='mr-2 text-black-700 ml-auto w-4 h-4 icon icon-chevron-down']");
    public By GenderDropDownContainer = By.xpath("//div[@class='popover left-0']/ul/div/div[@class='py-5 leading-6 cursor-pointer pl-7 text-black-600 md:py-3 md:pl-3 selectable']");
    public  By ContinueButton = By.xpath("//div/span[text()='Continue']");
    public By UniversityNameInputField = By.xpath("//input[@placeholder='Enter university name']");
    public By FieldOfStudyInputField = By.xpath("//input[@placeholder='Select field of study']");
    public By StudyProgramInputField = By.xpath("//input[@placeholder='Select study program']");
    public By StartingSemesterInputField = By.xpath("//input[@placeholder='Select your starting semester']");
    public By UniversityFieldAfterEnteringValue = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div");
    public By FOSFieldAfterEnteringValue = By.xpath("//*[@id='vs2__combobox']/div[1]/span/div/div");
    public By StudyProgramFieldAfterEnteringValue = By.xpath("//*[@id='vs3__combobox']/div[1]/span/div/div");
    public By StartingSemFieldAfterEnteringValue = By.xpath("//*[@id='vs4__combobox']/div[1]/span/div/div");

    public By UniversityContainer = By.xpath("//li[starts-with(@id,\"vs1__option-\")]");
    public By FOSContainer = By.xpath("//li[starts-with(@id,\"vs2__option-\")]");
    public By StudyProgramContainer = By.xpath("//li[starts-with(@id,\"vs3__option-\")]");
    public By StartingsemContainer = By.xpath("//li[starts-with(@id,\"vs4__option-\")]");
    public By ContinueButtonII = By.xpath("//span[text()='Continue']");
    public WelcomePageObjects(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
}