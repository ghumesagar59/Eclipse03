Feature: Automate GreytHR My Worklife Section

  Scenario: Login and navigate to My Worklife pages
    Given User is on the GreytHR login page for navigation My Worklife menu
    When User enters valid login credentials for navigation My Worklife menu
    And User logs into the portal for navigation My Worklife menu
    Then User verify the My Worklife menu
    And User closed the browser for navigation My Worklife menu