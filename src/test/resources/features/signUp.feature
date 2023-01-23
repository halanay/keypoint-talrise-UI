@regression
@signup
Feature: SignUp


  Background:
    Given User clicks on Sign Up link


  Scenario: Try to signup with empty form
    When the user clicks the Create My Account button
    Then Create My Account button should be disabled


  Scenario: Sign up with valid credentials.
    When User enters valid inputs
    Then User should be able to sign up.

  Scenario Outline: User should not be allowed to sign up with blank required inputs
    When the user leaves blank user information "<firstName>" "<lastName>""<linkedin>""<email>""<password>""<confirmPassword>""<gdpr>"
    Then Create My Account button should be disabled
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
    Then Create My Account button should be disabled

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
    Then Create My Account button should be disabled

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
    Then Create My Account button should be disabled

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
    Then Create My Account button should be disabled

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

  ##################################################################################################################
#   THE SCENARIOS BELOW CANNOT BE TESTED FOR NOW, BECAUSE OF THE CONFIRM EMAIL PROCESS. THEY SHOULD BE UPDATED TO ALLOW AUTOMATION PROCESS
  ##################################################################################################################
#  Scenario Outline: User should be able to register as one of the roles
#
#    When User enters valid inputs
#    And user clicks one of the "<role>" at roles page
#   # Then user should see the success message
#
#
#    Examples:
#
#      | role      |
#      | candidate |
#      | client    |
#      | partner   |
#
#
#Scenario: User registers as role candidate
#
#  When User enters valid inputs and registers as "candidate"
#  Then user should see sign up success message
#  And user should land to dashboard page






