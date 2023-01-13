@regression
Feature: Login Feature


  Scenario: Login with Valid Credentials
    Given the user provides valid credentials
    When the user clicks on login button
    Then the user should be able to logged in successfully


  Scenario: Login with invalid Credentials

  Scenario: User tries special characters

  Scenario: User tries empty credentials

  @login
    Scenario: Login with Image based automation
      Given the user provides valid credentials into textbox images
      When the user clicks on login button image
      Then the user should be able to logged in successfully
