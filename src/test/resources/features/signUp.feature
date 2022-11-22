Feature: SignUp


  Background:
    Given User is on the sign up page


  Scenario: Try to signup with empty form

    Given the user clicks on sign up link
    When the user clicks the Create My Account button
    Then error message should appear


  Scenario: Sign up with valid credentials.
    When User enters valid inputs
    Then User should be able to sign up.



  Scenario Outline: User should not be allowed to sign up with blank required inputs
    When the user leaves blank user information "<firstName>" "<lastName>""<linkedin>""<email>""<password>""<confirmPassword>""<gdpr>"
    Then error message should appear
#    And create my account button should not be enabled ?? the button is still enabled *******TBC*********

    Examples:
      | firstName | lastName     | linkedin                         | email          | password    | confirmPassword | gdpr  |
      |           | TestLastName | https://www.linkedin.com/in/test | name@gmail.com | Test123456! | Test123456!     | true  |
      | Testname  |              | https://www.linkedin.com/in/test | name@gmail.com | Test123456! | Test123456!     | true  |
      | Testname  | TestLastName |                                  | name@gmail.com | Test123456! | Test123456!     | true  |
      | Testname  | TestLastName | https://www.linkedin.com/in/test |                | Test123456! | Test123456!     | true  |
      | Testname  | TestLastName | https://www.linkedin.com/in/test | name@gmail.com |             | Test123456!     | true  |
      | Testname  | TestLastName | https://www.linkedin.com/in/test | name@gmail.com | Test123456! |                 | true  |
      | Testname  | TestLastName | https://www.linkedin.com/in/test | name@gmail.com | Test123456! | Test123456!     | false |


  Scenario Outline: User should not be allowed to sign up with invalid first name and last name inputs

    When the user enters invalid "<firstName>" name inputs
    Then warning message is displayed

    Examples:
      | firstName                                           |

      #BVA only one letter
      | a                                                   |
      #BVA 50+1 characters test TBC
      | abcdefghijabcdefghijabcdefghijabcdefghijabcdefghija |
      #numeric characters
      | 12345678                                            |
      #special characters only
      | !!??!!??                                            |
      #alphanumeric characters
      | abcd1234                                            |
