Feature: Google Search from Mobile Browser

  Scenario: Search for Appium on Google
    Given the Chrome browser is open on the mobile device
    When I navigate to the page "https://www.google.com"
    And I search for the term "Hello Appium" in the search bar
    Then I should see search results related to the search
