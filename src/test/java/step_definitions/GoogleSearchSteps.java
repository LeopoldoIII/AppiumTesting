package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DriverFactory;

public class GoogleSearchSteps {

    private WebDriver driver;

    public GoogleSearchSteps() {
        this.driver = DriverFactory.getDriver();
    }

    @Given("the Chrome browser is open on the mobile device")
    public void the_chrome_browser_is_open_on_the_mobile_device() {
        Assert.assertNotNull(driver, "WebDriver is not initialized.");
    }

    @When("I navigate to the page {string}")
    public void i_navigate_to_the_page(String url) {
        driver.get(url);
    }

    @When("I search for the term {string} in the search bar")
    public void i_search_for_the_term_in_the_search_bar(String term) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(term + "\n");
    }

    @Then("I should see search results related to the search")
    public void i_should_see_search_results_related_to_the_search() {
        Assert.assertTrue(driver.getTitle().contains("Hello Appium") || driver.getPageSource().contains("Appium"));
    }
}
