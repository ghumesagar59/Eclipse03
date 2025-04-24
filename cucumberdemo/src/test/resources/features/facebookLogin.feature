Feature: Facebook Login

  Scenario: Login with valid credentials
    Given User is on Facebook login page
    When User enters valid username and password
    Then Clicks on login button
    Then I Close the browser
