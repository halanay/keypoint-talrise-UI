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

      #  can be several words with spaces, and has a minimum of three characters, but a maximum at top 30 characters. An empty string shouldn't be validated
      #  (e.g. Jason, jason, jason smith, jason smith, JASON, Jason smith, jason Smith, and jason SMITH).
      #  For the last name, it should be a single word, only letters, with at least three characters, but at most 30 characters.
      #  Empty strings shouldn't be validated (e.g. lazslo, Lazslo, and LAZSLO).

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

  Scenario Outline: User should not be allowed to sign up with invalid email inputs

    When the user enters invalid "<email>" mail inputs
    And the user clicks on Create My Account button
    Then email error message should appear

    Examples:
      | email               |
      #email without @ sign
      | test.testermail.com |
      #one letter email
      | a                   |
      #special characters only
      | !!                  |
      #without Top Level Domain(.com)
      | test@testermail     |



  Scenario Outline: User should not be allowed to sign up with invalid linkedin inputs

#  Note: Linkedin custom URL must contain 3-100 letters or numbers.
  #  Please do not use spaces, symbols, or special characters.

    When the user enters invalid "<linkedin>"linkedin input
    And the user clicks on Create My Account button
    Then linkedin error message should be displayed

    Examples:
      | linkedin                                                                                                                          |
      #BVA only 2 letters
      | https://www.linkedin.com/in/te                                                                                                    |
      #BVA upper limit 101 letters or numbers
      | https://www.linkedin.com/in/1234567890abcdefghij1234567890abcdefghij1234567890abcdefghij1234567890abcdefghij1234567890abcdefghij1 |
      #without last part
      | https://www.linkedin.com/in/                                                                                                      |
      #linkedin with spaces
      | https://www.linkedin.com/in/test 12 test                                                                                          |
      #linkedin with special characters
      | https://www.linkedin.com/in/@test12345!!??                                                                                        |

  Scenario Outline: User should not be allowed to sign up with invalid password inputs

    When the user enters invalid "<password>" password inputs
    And the user clicks on Create My Account button
    Then password error message should be displayed

    Examples:
      | password  |

      #only lowercase test
      | abcdefgh  |
      #only uppercase test
      | ABCDEFGH  |
      #alphanumeric -not capitalized
      | abcd1234  |
      #alphanumeric -CAPITAL only
      | ABCD1234  |
      #only numbers test
      | 12345678  |
      #BVA 7 characters test
      | Abcd123   |
      #BVA 9 characters test
      | Abcde1234 |






