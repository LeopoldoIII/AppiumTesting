package test_cases;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageExample;
import pages.PageWebBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ScriptWebBrowser {


    private AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        String appiumServerURL = "http://localhost:4723/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability("chromedriverExecutable", "/usr/local/bin/chromedriver");
        capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AndroidDriver<MobileElement>(new URL(appiumServerURL), capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void TestCase01(){

        String baseURL = "https://www.guru99.com/mobile-testing.html";

        PageWebBrowser pageWebBrowser = new PageWebBrowser(driver);
        pageWebBrowser.webRequest(driver, baseURL);

    }

}
