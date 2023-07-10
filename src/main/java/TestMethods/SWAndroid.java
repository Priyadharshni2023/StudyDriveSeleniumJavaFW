package Android_TestMethods;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;

public class SWAndroid {
    public static void main(String[] args)  throws  MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Priya's Pixel");
        options.autoGrantPermissions();
        options.setApp(System.getProperty("/Users/freshworks/IdeaProjects/StudyDriveSekeniumJavaFW/src/main/resources/AndroidApps/de.veedapp.veed_4.1.6-690.apk"));
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        //Clicking on Continue with email button
        driver.findElement(By.xpath("//*[@resource-id=\"de.veedapp.veed.login_registration:id/button_email_login”]”"));
        //Entering email id in email input text
        driver.findElement(By.xpath("//*[@resource-id = “//*[@resource-id=\"de.veedapp.veed:id/textInputEditText\"]"));
        //Clicking on continue button
        driver.findElement(By.xpath("//*[@resource-id = 'de.veedapp.veed.login_registration:id/loadingButtonView']"));
    }
}
