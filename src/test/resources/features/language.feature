Feature: Language feature

  Background: user should be logged in as a candidate
    Given the user is logged in with valid credentials

  Scenario:Complete Profile pop up

    Given user clicks on the completeNowPopUp button
    And user clicks on the profile button
    And user clicks on the language button
    When user clicks on the search box
    Then user  is able to type or enter in the search box or not
