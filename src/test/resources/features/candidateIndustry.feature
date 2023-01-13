Feature: US_3_UI
  @best
  @smoke
  @industry
  Scenario: Industry (Happy Path)
    * US2 Candidate user fills the email and password and clicks login button
    * US2 Candidate user verifies the success message
    * US3 Candidate user clicks on industry title
    * US3 Candidate user verifies the industry title
    * US3 When the candidate user types any industry on search box verifies that it appears in dropdown
    * US3 When candidate clicks on an industry from dropdown verifies that it is selected
    * US3 User chooses first option from the experience dropdown
    * US3 User closes industries which are selected
    * US3 User clicks on save button
    * US3 User verifies the success message
    * US1 User close the browser


