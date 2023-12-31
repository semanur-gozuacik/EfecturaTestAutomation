@regression
Feature: BlackList Test Cases- Create Black List
  Background:
    When  The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then  The User waits until the System element is visible with a timeout of 120 seconds
    Given The user on the black list users page
    And   The User gets the current URL and stores it in "Settings/BlackList"

  Scenario: Adding a New User with Phone Number and Card Details-Cancel Button
    And   The User clicks on the black list create new element
    And  The user clicks a phone Number into field "89666555"
    And  The user clicks a last6DigitOfCard nto field "12877466"
    And  The User clicks on the Cancel button element

  Scenario: Adding a New User with Phone Number and Card Details-Add Button
    And   The User clicks on the black list create new element
    And  The user clicks a phone Number into field "89666555"
    And  The user clicks a last6DigitOfCard nto field "12877466"
    And  The User clicks on the Add button element



