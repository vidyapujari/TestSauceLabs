Feature: Add Items to SWAGLABS Cart

  Scenario: Add Items to Cart
    Given I go to the login page
    When I login as a valid user
    When Clicking on dropdown by using SELECT
    When I add items? to the cart
    When Click_Cart
    Then View_Cart
    Then Click_Continue
    Then Clicking on dropdown by using SELECT2
    When I add items? to the cart2
    When Click_Cart2
    When View_Cart2
    And Close browser




