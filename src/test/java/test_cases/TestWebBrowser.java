package test_cases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestWebBrowser {

    public static AndroidDriver driver;

    public static  void main(String[] args) throws MalformedURLException {

      /*
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable
                (new File("C:\\Program Files\\nodejs\\node.exe")).withAppiumJS
                (new File("C:\\Users\\natha\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")));

        service.start();

        */

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");


        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);


        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Hello Appium");

        driver.quit();
        //service.stop();



    }






}
