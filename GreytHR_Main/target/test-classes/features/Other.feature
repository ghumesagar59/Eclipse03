Feature: Automate GreytHR Other Section

  Scenario: Login and navigate to Other pages
    Given User is on the GreytHR login page for navigation Other menu
    When User enters valid login credentials for navigation Other menu
    And User logs into the portal for navigation Other menu
    Then User verify the Other menu
    And User closed the browser for navigation Other menu