Feature: Automate GreytHR Salary Section

  Scenario: Login and navigate to Salary pages
    Given User is on the GreytHR login page for navigation Salary menu
    When User enters valid login credentials for navigation Salary menu
    And User logs into the portal for navigation Salary menu
    Then User verify the Salary menu
    And User closed the browser for navigation Salary menu