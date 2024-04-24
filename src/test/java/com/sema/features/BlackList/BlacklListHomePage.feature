@regression
Feature: BlackList Test Cases- Black List Home Page
  Background:
    When  The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then  The User waits until the System element is visible with a timeout of 120 seconds
    Given The user on the black list users page
    And   The User gets the current URL and stores it in "Settings/BlackList"

  Scenario Outline: Verify a Phone Number Field - "<phoneNumber>"
    When  The user enters "<phoneNumber>" into the phone number field
    Then  The user verifies that "<phoneNumber>" is visible in blackList
    Examples:
    |phoneNumber|
    |fullNumber |
    |partialNumber|
    |invalidNumber|

  Scenario: Reset Button Control
    When  The user enters "fullNumber" into the phone number field
    And the user clicks on Reset button
    And the user verify Reset button functionality in blackList

  Scenario: Delete Button Functionality Control - Cancel Button
    When  The user enters "fullNumber" into the phone number field
    And  The user clicks on delete button
    And  The user clicks on cancel button in popup
    Then The user verify the number "fullNumber" is visible

  Scenario: Delete Button Functionality Control - Delete Button
    When  The user enters "fullNumber" into the phone number field
    And  The user clicks on delete button
    And  The user clicks on delete button in popup
    Then The user verify the number "fullNumber" is deleted

  Scenario: Active Black List Button Functionality Control - Cancel Button
    When  The user enters "fullNumber" into the passive phone number field
    And  The user clicks on active button
    And  The user clicks on cancel button in active popup
    #Then The user verify the number "fullNumber" is visible

  Scenario: Delete Button Functionality Control - Delete Button
    When  The user enters "fullNumber" into the passive phone number field
    And  The user clicks on active button
    And  The user clicks active button in popup
    Then The user verify the number "fullNumber" is activated

  Scenario Outline: Verify a Card Number Field - "<cardNumber>"
    When  The user enters "<cardNumber>" into the card number field
    Then  The user verifies that "<cardNumber>" is visible in blackList
    Examples:
      |cardNumber|
      |fullNumber |
      |partialNumber|
      |invalidNumber|

  Scenario: Reset Button Control-CardNumber
    When  The user enters "fullNumber" into the card number field
    And the user clicks on Reset button
    And the user verify Reset button functionality in blackList

  Scenario: Delete Button Functionality Control - Cancel Button-CardNumber
    When  The user enters "fullNumber" into the card number field
    And  The user clicks on delete button
    And  The user clicks on cancel button in popup
    Then The user verify the number "fullNumber" is visible

  Scenario: Delete Button Functionality Control - Delete Button- CardNumber
    When The user enters "fullNumber" into the card number field
    And  The user clicks on delete button
    And  The user clicks on delete button in popup
    #Then The user verify the number "fullNumber" is deleted

  Scenario: Active Black List Button Functionality Control - Cancel Button- CardNumber
    When The user enters "fullNumber" into the passive card number field
    And  The user clicks on active button
    And  The user clicks on cancel button in active popup
    Then The user verify the number "fullNumber" is visible-cancel

  Scenario: Delete Button Functionality Control - Delete Button- CardNumber
    When The user enters "fullNumber" into the passive card number field
    And  The user clicks on active button
    And  The user clicks active button in popup
    Then The user verify the number "fullNumber" is activated

