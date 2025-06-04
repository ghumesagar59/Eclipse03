Feature: Greythr Login Page Functionality

  Scenario: Successful login with valid credentials
    Given I am on the Greythr login page for navigate login page
    When I entered valid username and password for navigate login page
    And I clicked on the login button for navigate login page
    Then I should be redirected to the dashboard for navigate login page

  Scenario: Login attempt with invalid credentials
    Given I am on the Greythr login page for navigate login page
    When I entered invalid username and password for navigate login page
    And I clicked on the login button for navigate login page
    Then An error message should be displayed for navigate login page
