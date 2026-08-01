package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ApiClient;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setUp() {
        String platform = System.getProperty("platform", "android").toLowerCase();

        // 1. Execute an API pre-configuration call (e.g. setting up user data, clearing test environment)
        System.out.println("[Hook] Executing pre-configuration API call...");
        try {
            // Simulated call to a mock endpoint to demonstrate hooks API setup functionality
            ApiClient.get("https://jsonplaceholder.typicode.com", "/posts/1", null);
            System.out.println("[Hook] Pre-configuration API call completed successfully.");
        } catch (Exception e) {
            System.err.println("[Hook] Warning: API pre-configuration failed: " + e.getMessage());
        }

        // 2. Initialize the platform driver (unless it's an API-only run)
        if (!platform.equals("api")) {
            System.out.println("[Hook] Initializing driver for platform: " + platform);
            DriverFactory.getDriver();
        } else {
            System.out.println("[Hook] Skipping driver initialization (API execution target).");
        }
    }

    @After
    public void tearDown() {
        String platform = System.getProperty("platform", "android").toLowerCase();
        if (!platform.equals("api")) {
            System.out.println("[Hook] Cleaning up driver.");
            DriverFactory.quitDriver();
        }
    }
}
