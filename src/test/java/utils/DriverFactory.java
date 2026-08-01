package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

    private static void initializeDriver() {
        String platform = System.getProperty("platform", "android").toLowerCase();
        String env = System.getProperty("env", "local").toLowerCase();

        if (platform.equals("api")) {
            // API tests do not require browser/mobile driver initialization
            return;
        }

        try {
            DesiredCapabilities capabilities = loadCapabilities(platform, env);

            if (env.equals("saucelabs")) {
                String username = System.getenv("SAUCE_USERNAME");
                String accessKey = System.getenv("SAUCE_ACCESS_KEY");
                if (username == null || accessKey == null) {
                    throw new RuntimeException("SAUCE_USERNAME and SAUCE_ACCESS_KEY must be set in the environment.");
                }

                // Inject credentials and build metadata dynamically
                @SuppressWarnings("unchecked")
                Map<String, Object> sauceOptions = (Map<String, Object>) capabilities.getCapability("sauce:options");
                if (sauceOptions != null) {
                    sauceOptions.put("username", username);
                    sauceOptions.put("accessKey", accessKey);
                    
                    String githubRunNumber = System.getenv("GITHUB_RUN_NUMBER");
                    if (githubRunNumber != null) {
                        sauceOptions.put("build", "GHA Run #" + githubRunNumber);
                        sauceOptions.put("name", System.getenv("GITHUB_WORKFLOW"));
                    }
                }

                String sauceUrl = "https://" + username + ":" + accessKey + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
                driver = new RemoteWebDriver(new URL(sauceUrl), capabilities);
            } else {
                // Local execution
                if (platform.equals("android")) {
                    String appiumServerURL = "http://127.0.0.1:4723/";
                    driver = new AndroidDriver<WebElement>(new URL(appiumServerURL), capabilities);
                } else if (platform.equals("ios")) {
                    String appiumServerURL = "http://127.0.0.1:4723/";
                    driver = new IOSDriver<WebElement>(new URL(appiumServerURL), capabilities);
                } else if (platform.equals("web")) {
                    driver = new ChromeDriver(capabilities);
                } else {
                    throw new IllegalArgumentException("Unsupported platform: " + platform);
                }
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize driver", e);
        }
    }

    public static DesiredCapabilities loadCapabilities(String platform, String env) throws IOException {
        String configPath = "src/test/resources/config/" + env + "-" + platform + ".json";
        if (!Files.exists(Paths.get(configPath))) {
            throw new IllegalArgumentException("Configuration file not found: " + configPath);
        }

        try (FileReader reader = new FileReader(configPath)) {
            Map<String, Object> map = new Gson().fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
            DesiredCapabilities capabilities = new DesiredCapabilities();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    capabilities.setCapability(entry.getKey(), entry.getValue());
                }
            }
            return capabilities;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Setter for testing purposes (allows injecting mocks)
    public static void setDriver(WebDriver mockDriver) {
        driver = mockDriver;
    }
}
