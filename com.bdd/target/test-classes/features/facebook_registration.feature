Feature: Facebook Registration

  Scenario: User should be able to fill the registration form
    Given user is on Facebook registration page
    When user enters first name "Sagar"
    And user enters surname "Ghume"
    And user selects birth date "4", "Feb", "1997"
    And user selects gender "Male"
    And user enters email "Sagarghume01@gmail.com"
    And user enters password "Pass@123"
    Then user clicks on Sign Up button
