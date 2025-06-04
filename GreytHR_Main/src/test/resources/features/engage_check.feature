Feature: Login to GreytHR and verify engage option

  Scenario: User logs in and checks if engage option is visible
    Given User is on the GreytHR login page for navigation engage menu
    When User enters valid username and password for navigation engage menu
    And User clicks the login button for navigation engage menu
    And Engage option should be visible for navigation engage menu