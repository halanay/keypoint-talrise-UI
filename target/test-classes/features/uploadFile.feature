@regression
@uploadFilePage
Feature: uploadFile

  Background: User is on Upload Page
    Given the user provides valid credentials
    When the user clicks on login button
    And close complete now popup
    And click on profile button
    And select upload file


  Scenario:User can load cv file using CvBox
    And user uploads "cv" by using uploadCvBox(doc,pdf,docx)
    Then user see uploaded file name contains "cv"

  Scenario:User can load cv file using Browse button
    And user uploads "cv" by using browseCvBox(doc,pdf,docx)
    Then user see uploaded file name contains "cv"

  Scenario:User can load cover using CoverBox
    And user uploads "cover" by using uploadCoverBox(doc,pdf,docx)
    Then user see uploaded file name contains "cover"

  Scenario:User can load cover using Browse button
    And user uploads "cover" by using browseCoverBox(doc,pdf,docx)
    Then user see uploaded file name contains "cover"

  Scenario:User can change uploaded cv file by using uploadCvBox
    And user uploads "cv" by using uploadCvBox(doc,pdf,docx)
    And user can delete uploaded file
    And user uploads "anotherCv" by using uploadCvBox(doc,pdf,docx)
    Then user see uploaded file name contains "anotherCv"

  Scenario:User can change uploaded cv file by using browseCvBox
    And user uploads "cv" by using browseCvBox(doc,pdf,docx)
    And user can delete uploaded file
    And user uploads "anotherCv" by using browseCvBox(doc,pdf,docx)
    Then user see uploaded file name contains "anotherCv"

  Scenario:User can change uploaded cv file by using uploadCvBox
    And user uploads "cover" by using uploadCoverBox(doc,pdf,docx)
    Then user see uploaded file name contains "cover"
    And user uploads "anotherCover" by using uploadCoverBox(doc,pdf,docx)
    Then user see uploaded file name contains "anotherCover"

  Scenario:User can change uploaded cv file by using browseCvBox
    And user uploads "cover" by using browseCoverBox(doc,pdf,docx)
    Then user see uploaded file name contains "cover"
    And user uploads "anotherCover" by using browseCoverBox(doc,pdf,docx)
    Then user see uploaded file name contains "anotherCover"

  Scenario: User can save cv in uploadFile Page
    And user uploads "cv" by using uploadCvBox(doc,pdf,docx)
    When  user clicks save button in uploadFile Page
    Then  user should see "Your Cv has been uploaded successfully." for "cv"
    And user can delete uploaded file

  Scenario: User can save cover in uploadFile Page
    And user uploads "cover" by using uploadCoverBox(doc,pdf,docx)
    When  user clicks save button in uploadFile Page
    Then user should see "Your Cover Letter has been uploaded successfully." for "cover"
    And user can delete uploaded file

  Scenario: User can use cancel button to clear changes
    And user uploads "cv" by using browseCvBox(doc,pdf,docx)
    And user uploads "cover" by using uploadCoverBox(doc,pdf,docx)
    When user clicks cancel button in uploadFile Page
    Then user see file boxes empty



