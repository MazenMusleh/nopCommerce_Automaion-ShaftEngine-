Feature: Search Functionality

  Scenario: User Search Date is less than 3 Chars
    Given User type less than 3 Chars Search Data
    When User Click Search Button
    Then Search Warning Message Appear

  Scenario: User Search Date is valid and found
    Given User type valid Search Data
    When User Click Search Button
    Then Search Results Appear

  Scenario: User Search Date is not valid and not found
    Given User type invalid Search Data
    When User Click Search Button
    Then Search No Result Message Appear

  Scenario: User Search Date is valid then need to use advanced search
    Given User type valid Search Data
    When User Click Search Button
    Then Search Results Appear
    And Click Advanced Search Box
    And Choose Category
    And Choose Manufacturer
    And Click Search Button Again
    Then Search Results Appear