Feature: Product selection from Men's Jeans category

  Scenario: Select 3 jeans products and print their name and price
    Given User is on the homepage
    When User navigates to Men category and then Jeans section
    And User selects 3 products
    Then User prints the name and price of selected products