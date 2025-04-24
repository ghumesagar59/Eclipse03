Feature: Type DOB and set format

  Scenario: Type Date of birth and change the format
    Given user go to the website
    When click on formate date
    And user entered date of birth
    And user change the format options
    Then user close the website