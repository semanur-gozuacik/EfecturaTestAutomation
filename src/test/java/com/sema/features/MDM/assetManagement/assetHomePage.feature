@regression
Feature: Asset Management Test Cases- Asset Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a    mouseover on the Asset Management element
    And   The User performs a    mouseover on the Asset element
    And   The User clicks on the Asset element
    And   The User gets the current URL and stores it in "itemType=Asset" Asset page

  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "TEST123456" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality "TEST123456"

  Scenario:  Verify Code Filter -Valid Unique Code partial
    And The user enters "TEST" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality with partial unique code "TEST"

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Verify Label Filter - Valid Label
    And The user enters "TEST123456" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "TEST123456"

  Scenario: Verify Label Filter - Partial Label
    And The user enters "test" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Create List- cancel button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    And  The user enters "_5458429214" Can view
    And  The user enters "1757483988_5392786463" Can edit
    And The user clicks cancel button-New List
    Then The user verifies "otomasyon" is not visible

  Scenario: Create List- create button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    And  The user enters "_5458429214" Can view
    And  The user enters "1757483988_5392786463" Can edit
    And The user clicks create button-New List
    Then The user verifies "otomasyon" is visible

  Scenario: Create List- create button-exist user
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name
    And  The user enters "_5458429214" Can view
    And  The user enters "1757483988_5392786463" Can edit
    And  The user clicks create button-New List
    Then The user verifies error message "USER_LIST_ALREADY_EXISTS" is displayed

  Scenario: Create List- delete list-cancel button
    And The user selects deleted element
    And The user clicks cancel button in delete popup
    Then The user verifies "otomasyon" is visible

  Scenario: Create List- delete list
    And The user selects deleted element
    And The user clicks delete button in delete popup
    Then The user verifies "otomasyon" is not visible