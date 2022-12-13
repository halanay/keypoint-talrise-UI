Feature: US_1_UI
  @best
  @smoke
  Scenario: Sing Up (POSITIVE)
    * US1 User clicks on sign up button
    * US1 User verifies the Sign Up title
    * US1 User fills firstName, lastName, email, password,confirmPassword and clicks GDPR and create account button
    * US1 User verifies the success message
    * US1 User close the browser
  @best
    @smoke
  Scenario Outline: Sign Up (NEGATIVE)
    * US1 User clicks on sign up button
    * US1 User verifies the Sign Up title
    * US1 User fills "<firstName>", "<lastName>","<linkedIn>", "<email>", "<password>","<confirmPassword>" and clicks GDPR and create account button
    * US1 User verifies the warning message
    * US1 User close the browser


    Examples: Credential Table
      |firstName|lastName|linkedIn                        |email         |password       |confirmPassword|
      |         |def     |https://www.linkedin.com/in/xyz |abc@email.com |Test123456!    |Test123456!    |
      |abc      |        |https://www.linkedin.com/in/xyz |abc@email.com |Test123456!    |Test123456!    |
      |abc      |def     |                                |abc@email.com |Test123456!    |Test123456!    |
      |abc      |def     |https://www.linkedin.com/in/xyz |              |Test123456!    |Test123456!    |
      |abc      |def     |https://www.linkedin.com/in/xyz |abc@email.com |               |Test123456!    |
      |abc      |def     |https://www.linkedin.com/in/xyz |abc@email.com |Test123456!    |               |