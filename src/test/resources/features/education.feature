@regression
Feature: education
# Sign Up ile education kismi bos bir user create edilip sonra ona candidate rolu veriliyor burda
  Background: an user should be sign up and choose candidate role
    Given User is on the sign up page
    Given user clicks on the completeNowPopUp button

  Scenario: Sign up with valid credentials.
    When User enters valid inputs
    Then User should be able to sign up.

  @EduTag1
  Scenario:Happy Path Fill the Education Information
    Given User should not add education information  before
    And   user clicks on the profile button
    And   user clicks on the education button
    And   User clicks related box and put information about University, Degree, Department,Start Year and End Year
    And   User click plus ADD education button to add extra other education information
    And   user clicks Certificate box and add his her certificates
    When  user clicks save button
    Then  user should see "Your education info has been added successfully