Feature: Add to Cart Functionality

  Scenario: Add item to Cart Successfully
    Given User Clicked on add to cart button for product index = 0
    And Choose HDD
    And Choose RAM
    And Clicked on add to cart button
    Then Successfully Cart Notification Appear
    And close Notification
    And go to Cart page
    Then Assert if product added to cart successfully

  Scenario: check Cart if its empty
    And go to Cart page
    And Assert if Cart page is empty
