@regression
Feature: Campaign Management Test Cases- Campaign Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a  mouseover on the Campaign Management element
    And   The User performs a  mouseover on the Campaign element
    And   The User clicks on the Campaign element
    And   The User gets the current URL and stores it in "itemType=Campaign" Asset page

  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "welcometestgeneric1" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality "welcometestgeneric1"-Campaign

  Scenario:  Verify Code Filter -Valid Unique Code partial
    And The user enters "TEST" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality with partial unique code "TEST"- Campaign

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Verify Label Filter - Valid Label
    And The user enters "testbirthday1561" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "testbirthday1561"- Campaign

  Scenario: Verify Label Filter - Partial Label
    And The user enters "test" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test"- Campaign

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
    And the user clicks on Search button
    And the incoming filter for "<ItemStatus>" should contain
    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |On Hold    |
       #|Draftt    |
@sema
  Scenario: Reset Button Control
    And The user enters "welcometestgeneric1" into Code field
    And The user enters "testbirthday1561" into Label field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario: Deleting an item and declining the popup message
    And The user enters "TESTSETSET123123" into Code field
    And the user clicks on Search button
    And The user clicks on Delete
    And The user declines the popup message
    Then The user verify that "TESTSETSET123123" is visible-campaign