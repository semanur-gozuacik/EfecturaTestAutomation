@regression @somokıı
Feature: BlackList Test Cases- Create Black List
  Background:
    When  The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then  The User waits until the System element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the System element symbol
    And   The User performs a mouseover on the System element
    And   The User performs a mouseover on the BlackList element
    And   The User clicks on the BlackList element
    And   The User gets the current URL and stores it in "Settings/BlackList"
    Then   The User waits until the black list create element is visible with a timeout of 120 seconds

  Scenario: Adding a New User with Phone Number and Card Details-Cancel Button
    And   The User clicks on the black list create new element
    And  The user clicks a phone Number into field "456789"
    And  The user clicks a last6DigitOfCard nto field "123456"
    And  The User clicks on the Cancel button element

  Scenario: Adding a New User with Phone Number and Card Details-Add Button
    And   The User clicks on the black list create new element
    And  The user clicks a phone Number into field "456789"
    And  The user clicks a last6DigitOfCard nto field "123456"
    And  The User clicks on the Add button element

  Scenario: Delete Button Functionality Control - Delete Button- CardNumber
    When The user enters "123456" into the passive card number field
    And  The user clicks on active button
    And  The user clicks active button in popup
    Then The user verify the number "123456" is activated



