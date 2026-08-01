package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class DriverFactoryTest {

    @Test
    public void testLoadCapabilitiesLocalAndroid() throws IOException {
        DesiredCapabilities caps = DriverFactory.loadCapabilities("android", "local");
        Assert.assertNotNull(caps, "Capabilities should not be null");
        Assert.assertEquals(caps.getCapability("browserName"), "Chrome");
        Assert.assertEquals(caps.getCapability("platformName"), "Android");
        Assert.assertEquals(caps.getCapability("automationName"), "UiAutomator2");
    }

    @Test
    public void testLoadCapabilitiesSauceLabsAndroid() throws IOException {
        DesiredCapabilities caps = DriverFactory.loadCapabilities("android", "saucelabs");
        Assert.assertNotNull(caps, "Capabilities should not be null");
        Assert.assertEquals(caps.getCapability("platformName"), "Android");
        Assert.assertEquals(caps.getCapability("browserName"), "Chrome");
    }

    @Test
    public void testGetAndSetDriverWithMock() {
        WebDriver mockDriver = Mockito.mock(WebDriver.class);
        DriverFactory.setDriver(mockDriver);

        WebDriver driver = DriverFactory.getDriver();
        Assert.assertNotNull(driver, "Driver should not be null");
        Assert.assertSame(driver, mockDriver, "Should return the mocked driver instance");

        // Clean up
        DriverFactory.setDriver(null);
    }
}
