Feature: uploadFile


  Scenario:User can load file
    Given the user provides valid credentials
    When the user clicks on login button
    And close complete now popup
    And click on profile button
    And select upload CV
    And user uploads file by using uploadCvBox(doc,pdf,docx)
    Then user see document uploaded
  @wip
  Scenario:User can load file
    Given the user provides valid credentials
    When the user clicks on login button
    And close complete now popup
    And click on profile button
    And select upload CV
    And user uploads file by using browse(doc,pdf,docx)
    Then user see document uploaded