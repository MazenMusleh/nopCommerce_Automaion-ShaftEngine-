Feature: Wishlist Functionality

  Scenario: Add item to wish list Successfully
    Given User Clicked on wishlist button for product index = 2
    Then Successfully Notification Appear
    Then go to wishlist page
    And Assert if product added successfully

  Scenario: check wishlist if its empty
    Then go to wishlist page
    And Assert if wishlist page is empty

