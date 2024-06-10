@regression
Feature: Financial Account Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    Given The user is on the Financial Account item home page
    And   The User gets the current URL and stores it in "itemType=FinancialAccount"

  Scenario:Financial Account Verify export button
    When  The user clicks on Export button


  Scenario:Financial Account Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Financial Account Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario Outline: Financial Account Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |

  Scenario:Financial Account Reset Button Control
    And The user enters "NoMask" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Financial Account Verify Label Filter - Valid Label
    And The user enters "FinancialAccount_06" into Label field
    And the user clicks on Search button

  Scenario: Financial Account Verify Label Filter - Invalid  Label
    And The user enters "44444" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario::Sales Organization Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "FinancialAccount_06" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Sales Organization  User Permission Verify Previous Page Button clickable Condition
    And The user enters "FinancialAccount_06" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    When The user clicks next page button user
    When The user clicks previous page button user
    And  The user verifies previous button is clickable user