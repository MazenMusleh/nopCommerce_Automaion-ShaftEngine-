Feature: login functionality

Background:
    Given User Click On Login Button

  Scenario: user could login with valid data (happy case)

    When user enter valid Email and password
    And user click on login button
    Then user logged in successfully

  Scenario: user couldn't login with invalid Email

    When user enter invalid Email and valid password
    And user click on login button
    Then user cant log in successfully

  Scenario: user couldn't login with invalid password

    When user enter valid Email and invalid password
    And user click on login button
    Then user cant log in successfully

  Scenario: user couldn't login with invalid Email and invalid password

    When user enter invalid Email and invalid password
    And user click on login button
    Then user cant log in successfully