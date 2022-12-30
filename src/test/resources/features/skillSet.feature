@regression
Feature: skillSet Tests

  Background: candidate log in
    Given User should be logged in as candidate
    # And positions "tester" should have been selected
    # Note: this background option had to be saved manually from UI till positions page has been automated

  Scenario: User should be bale to see auto suggestions when typed into searchbox
    When user types a random letter in the search box
    Then user should see the results starting with that letter



  Scenario Outline: User should be able to choose one of the skill Sets for the chosen Position

    When user chooses "<skill>"
    And user clicks on Save button
    Then user will be able to see the skills added to the profile


    Examples:
      | skill      |
      | CSS        |
      | Html       |
      | JavaScript |
      | ReactJs    |
      | Java       |
      | Redux      |




  Scenario Outline: user should be able to choose experience years for the skill selected

    When user chooses "<skill>"
    And user chooses one of the "<experience years>" from the dropdown
    And user clicks on the save button
    Then user should be able to see the experience years has been modified


    Examples:
      | skill      |experience years |
      | CSS        |0-1              |
      | Html       |1-3              |
      | JavaScript |3-5              |
      | ReactJs    |5-7              |
      | Java       |7-10             |
      | Redux      |10+              |

  Scenario: user should be able to delete the skill selected beforehand

    When user chooses "CSS" skill and saves
    And user clicks on the cross sign on skill button
    Then verify that "CSS" skill has been deleted from the chosen column


    @ToBeConfirmed
  Scenario: user should not allowed to choose more than 5 skill sets











