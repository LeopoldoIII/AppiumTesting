package test_cases;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase01 {


    public AndroidDriver<MobileElement> driver;


    @BeforeTest
    public void setUp() throws MalformedURLException {

        String appiumServerURL = "http://localhost:4723/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();


        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.citibanamex.banamexmobile");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.citibanamex.banamexmobile.splashscreen.presentation.view.SplashActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AndroidDriver<MobileElement>(new URL(appiumServerURL), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void fistTestCase(){

        PageExample pageExample = new PageExample(driver);
        pageExample.fuctionExample(driver);


    }



}
