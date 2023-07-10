package TestMethods;
import BasePckage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.WelcomePageObjects;
import org.openqa.selenium.WebElement;


import java.util.List;

public class WelcomePageMethods extends BaseClass {

    String sGenderString = "Female";
    String sUserName = "Priya";
    String sUniString = "987654321";
    String sFieldOfStudy = "Engineering";
    String sStudyProg = "Engineering";
    String sStartingSem = "Summer 2023";
    WelcomePageObjects welObj = new WelcomePageObjects(driver);
    //WebDriverWait wait = new WebDriverWait(driver,30);

    @Test
    public void enterUserNameAndGenderTest()
    {

        driver.findElement(welObj.EmailInputField).sendKeys(sUserName);
        driver.findElement(welObj.GenderButton).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(welObj.GenderDropDownContainer));
        List<WebElement> GenderList = driver.findElements(welObj.GenderDropDownContainer);
        for (int i = 0; i < GenderList.size(); i++) {
            if (GenderList.get(i).getText().equals(sGenderString)) {
                GenderList.get(i).click();
                break;
            }
        }
        Assert.assertTrue(driver.findElement(welObj.ContinueButton).isDisplayed());
        driver.findElement(welObj.ContinueButton).click();
    }

    @Test
    public void enterAcademicDetailsTest()
    {
        //wait.until(ExpectedConditions.presenceOfElementLocated(welObj.UniversityNameInputField));
        driver.findElement(welObj.UniversityNameInputField).sendKeys("987654321");
        //wait.until(ExpectedConditions.presenceOfElementLocated(welObj.UniversityContainer));
        List<WebElement> UniList= driver.findElements(welObj.UniversityContainer);
        for(int i=0;i<UniList.size();i++){
            if(UniList.get(i).getText().equals(sUniString)){
                UniList.get(i).click();
                break;
            }
              }

        driver.findElement(welObj.FieldOfStudyInputField).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(welObj.FOSContainer));
        List<WebElement> FeildOfStudyList= driver.findElements(welObj.FOSContainer);
        for(int i=0;i<FeildOfStudyList.size();i++){
            if(FeildOfStudyList.get(i).getText().equals(sFieldOfStudy)){
                FeildOfStudyList.get(i).click();
                break;
            }
        }

        driver.findElement(welObj.StudyProgramInputField).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(welObj.StudyProgramContainer));
        List<WebElement> StudyProgramList= driver.findElements(welObj.StudyProgramContainer);
        for(int i=0;i<StudyProgramList.size();i++){
            if(StudyProgramList.get(i).getText().equals(sStudyProg)){
                StudyProgramList.get(i).click();
                break;
            }
        }
        driver.findElement(welObj.StartingSemesterInputField).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(welObj.StartingsemContainer));
        List<WebElement> StartingSemesterList= driver.findElements(welObj.StartingsemContainer);
        for(int i=0;i<StartingSemesterList.size();i++){
            if(StartingSemesterList.get(i).getText().equals(sStartingSem)){
                StartingSemesterList.get(i).click();
                break;
            }
        }
        driver.findElement(welObj.ContinueButtonII).click();
    }
}
