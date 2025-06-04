Feature: Automate GreytHR Leave Section

  Scenario: Login and navigate to Leave pages
    Given User is on the GreytHR login page for navigation leave menu
    When User enters valid login credentials for navigation leave menu
    And User logs into the portal for navigation leave menu
    Then User verify the Leave menu
    And User closed the browser for navigation leave menu