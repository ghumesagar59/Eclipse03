Feature: Automate GreytHR Attendance Section

  Scenario: Login and navigate to Attendance Info and Regularization & Permission pages
    Given User is on the GreytHR login page for navigation Attendance menu
    When User enters valid login credentials for navigation Attendance menu
    And User logs into the portal for navigation Attendance menu
    Then User verify the Attendance menu
    And User closed the browser for navigation Attendance menu