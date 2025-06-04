Feature: Automate GreytHR To DO Section

  Scenario: Login and navigate to To Do pages
    Given User is on the GreytHR login page for navigation To Do menu
    When User enters valid login credentials for navigation To Do menu
    And User logs into the portal for navigation To Do menu
    Then User verify the TO Do menu
    And User closed the browser for navigation To Do menu