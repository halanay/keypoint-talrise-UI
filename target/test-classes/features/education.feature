@regression
Feature: education

  Background: user should be logged in as a candidate
    Given the user goes to login page and enter valid inputs

  @education
  Scenario: User fills the education input fields
    Given user clicks on the completeNowPopUp button
    And user clicks on the profile button
    And user clicks on the education button and deletes all information
    Then user should be able to save their education details with valid inputs



