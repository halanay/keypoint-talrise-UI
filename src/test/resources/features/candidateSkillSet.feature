Feature: US_08
  @best
  @regression
  @skillSet
  Scenario: Skill Set 1
    * US2 Candidate user fills the email and password and clicks login button
    * US2 Candidate user verifies the success message
    * US8 Candidate User clicks on Profile button
    * US8 Candidate user clicks on Skill Set link
    * US8 User verifies the Skill Set Title
    * US8 User verifies that a position from previous step is shown
    * US8 User verifies that suggested skill list is contains "Cucumber" and "Cypress" skills
    * US8 User verifies that when the "Cypress" is typed in the search box it should be seen with experience year
    * US8 User verifies that when Experience Year dropdown is clicked options are visible
    * US8 User clicks on save button and verifies the success message
    * US1 User close the browser
