@regression
Feature: Currencies Test Cases
  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds
    When  The user on the currencies page

  Scenario: Users verify reach currencies page
    Then  The user verifies that reached the "Currencies" page.

  Scenario: The user verifies that Refresh button is active in Currencies page
    Then The user verifies that Refresh button is active

  Scenario Outline: The User verify code filter works correctly
    When  The user enters "<entries>" in to code filter
    Then  The User verifies that filter results contains "<entries>"

    Examples:
      | entries |
      | l       |
      | dolar   |

  Scenario: The user verifies code values are ascending order
    Then The user verifies that code values are ascending order with no action

  Scenario: The user verifies that code values descending order
    When The user clicks data header for descending sort
    Then The user verifies that code values are descending order

  Scenario: The user verifies that status values are ascending order
    When The user clicks status header for ascending sort
    Then The user verifies that status values are ascending order


  Scenario: The user verifies that status values are descending order
    When The user clicks status header for descending sort
    Then The user verifies that status values are descending order

  Scenario: The user verifies that filter reset button works correctly
    When The user enters "abcd" in to code filter
    When The user clicks reset button
    Then The user verifies that code filter has no value

  Scenario: The user verifies that cancel button is active in EditCurrency popup
    When The user clicks first currency's edit button
    Then The user verifies that cancel button is active in EditCurrency popup

  Scenario: The user verifies that Save button is inactive without changes in EditCurrency popup
    When The user clicks first currency's edit button
    Then The user verifies that Save button is inactive without change in EditCurrency popup

  Scenario: The user verifies that closing of EditCurrency popup after clicking the cancel button
    When The user clicks first currency's edit button
    When The user clicks cancel button in EditCurrency popup
    Then The user verifies that EditCurrency popup is closed

  Scenario: The user verifies that 'Save' button is active after change CurrencyCode in EditCurrency popup
    When The user clicks first currency's edit button
    When The user enter 'a' in to CurrencyCode input box in EditCurrency popup
    Then The user verifies that Save button is active in EditCurrency popup

  Scenario: The user verifies that 'Save' button is active after change Status in EditCurrency popup
    When The user clicks first currency's edit button
    When The user clicks Status checkbox in EditCurrency popup
    Then The user verifies that Save button is active in EditCurrency popup

  Scenario: The user verifies that closing of AddCurrency popup after clicking the cancel button
    When The user clicks CreateNew button in Currencies page
    When The user clicks cancel button in AddCurrency popup
    Then The user verifies that AddCurrency popup is closed

  Scenario: The user verifies that Save button is inactive without changes in AddCurrency popup
    When The user clicks CreateNew button in Currencies page
    Then The user verifies that Save button is inactive without change in AddCurrency popup

  Scenario: The use verifies that first and previous buttons are inactive in first page of currencies table
    When The user enters '1' in to pagination input box
    Then The user verifies that first and previous pagination buttons are inactive in first page of table