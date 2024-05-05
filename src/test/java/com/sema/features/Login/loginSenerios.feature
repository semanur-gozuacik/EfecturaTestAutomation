@regression
Feature: MDM Session Verification

  Background:
    Given I am on the MDM login page

  Scenario Outline: Attempt to Open a Session
    When I enter the username "<username>" and password "<password>"
    And click on the login button
    Then I should see the message "<expectedResult>"

    Examples:
      | username           | password         | expectedResult       |
      | invalidUsername    | validPassword    | session opening error |
      | validUsername      | invalidPassword  | session opening error |
      | validUsername      |                  | session opening error |
      |                    | invalidPassword  | session opening error empty|
      |                    | validPassword    | session opening error empty|
      |                    |                  | session opening error empty|
      | invalidUsername    | invalidPassword  | session opening error |
      | invalidUsername    | validPassword    | session opening error |
      | invalidUsername    |                  | session opening error |
      | validUsername      | validPassword    | successful login      |
  @login
    Scenario: Verify Forgot Your Password Button Functionality- return to login page
      When The user clicks forgot your password button
      Then  The User gets the current URL and stores it in "Account/ForgotPassword"
      When  The user clicks return to login page
      Then The User gets the current URL and stores it in "Account/Login"
  @login
  Scenario: Verify Forgot Your Password Button Functionality- invalid email
    When The user clicks forgot your password button
    Then  The User gets the current URL and stores it in "Account/ForgotPassword"
    When The user enters "invalid email"
    And  The user clicks send button
    Then The user verifies "Account cannot be found, please contact your system administrator." text
  @login
  Scenario: Verify Forgot Your Password Button Functionality- invalid format email
    When The user clicks forgot your password button
    Then  The User gets the current URL and stores it in "Account/ForgotPassword"
    When The user enters "invalid format email"
    And  The user clicks send button
   Then  The User gets the current URL and stores it in "Account/ForgotPassword"

  Scenario: Verify sign in with Microsoft button functionality
    When The user clicks sign in with microsoft button
    Then  The User gets the current URL and stores it in "sandbox.efectura.com/Account/AzureADAuth"

