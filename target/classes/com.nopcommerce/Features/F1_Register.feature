Feature: Register | Make A New Account

Background:
    Given User Click On Register Button

  Scenario: Enter Valid Info To Register
    When User Choose Gender
    And User Enter First Name
    And User Enter Last Name
    And User Choose Date Of Birth
    And User Enter Email
    And User Enter Company Name
    And User Choose NewsLetter Option
    And User Enter Password
    And User Enter ConfirmPassword
    And User Click On Reg Button
    Then User Registered Successfully

  Scenario: Enter Valid Info To Register but Already Exists
    When User Choose Gender
    And User Enter First Name
    And User Enter Last Name
    And User Choose Date Of Birth
    And User Enter Email
    And User Enter Company Name
    And User Choose NewsLetter Option
    And User Enter Password
    And User Enter ConfirmPassword
    And User Click On Reg Button
    Then User Already Exist Message Appear

  Scenario: Enter less than 6 chars password To Register
    When User Choose Gender
    And User Enter First Name
    And User Enter Last Name
    And User Choose Date Of Birth
    And User Enter Email
    And User Enter Company Name
    And User Choose NewsLetter Option
    And User Enter invalid Password
    And User Enter invalid Confirm Password
    And User Click On Reg Button
    Then Password Error Appear

  Scenario: Leave 1 or 2 attributes Empty To Register
    When User Choose Gender
    And User Enter Last Name
    And User Choose Date Of Birth
    And User Enter Company Name
    And User Choose NewsLetter Option
    And User Enter Password
    And User Enter ConfirmPassword
    And User Click On Reg Button
    Then First Name and Email Error Message Appear