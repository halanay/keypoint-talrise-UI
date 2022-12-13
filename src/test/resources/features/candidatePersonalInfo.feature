Feature: US_2_UI
  @best
  @smoke
  @personal_Info
  Scenario: Personal Info (Happy Path)
    * US2 Candidate user fills the email and password and clicks login button
    * US2 Candidate user verifies the success message
    * US2 Candidate clicks the complete now button
    * US2 Candidate user verifies the Profile title
    * US2 Candidate user clicks the Personal Information button
    * US2 Candidate user fills the Country City Country_Code Mobile
    * US2 Candidate user clicks the Save button and verifies success message
    * US1 User close the browser


