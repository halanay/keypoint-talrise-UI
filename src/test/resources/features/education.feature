Feature: education

  Background: user should be logged in as a candidate
    Given the user goes to login page and enter valid inputs


  Scenario: User fills the education input fields
    Given user clicks on the completeNowPopUp button
    And user clicks on the profile button
    And user clicks on the education button and deletes all informations
    Then user enters valid inputs of education


