
@bestami
@smoke
@position
Feature: US_7_UI
  Background:
    * US2 Candidate user fills the email and password and clicks login button
    * US2 Candidate user verifies the success message
    * US7 User clicks on Position button
    * US7 User verifies the Position and text titles

  Scenario: Position (Happy path)
    * US7 User clicks on selected position to close it
    * US7 User types "QA" on the search box and clicks on required position button
    * US7 User verifies that selected position appeared
    * US7 User clicks on save button
    * US7 User verifies the success message
    * US1 User close the browser

#  It is not able to close selected position item
  Scenario: Position (Negative 1)
    * US7 User clicks on selected position to close it
    * US7 User clicks on save button
    * US7 User verifies the failure message
    * US1 User close the browser

  Scenario: Position (Negative 2)
    * US7 User types "QA" on the search box and clicks on required position button
    * US7 User verifies that selected position appeared
    * US7 User clicks on cancel button
    * US7 User types "QA" again on the search box and clicks on required position button
    * US7 User verifies that selected position appeared
    * US7 User clicks on save button
    * US7 User verifies the success message
    * US1 User close the browser

