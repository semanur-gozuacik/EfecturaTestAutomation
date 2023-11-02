@semaa
Feature: Event Management Test Cases- Event Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 120 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Event Management element
    And   The User performs a mouseover on the Event element
    And   The User clicks on the Event element
    And   The User gets the current URL and stores it in "itemType=Event"

  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "TransferTest" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality "TransferTest"

  Scenario:  Verify Code Filter -Valid Unique Code
    And The user enters "Transfer" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality with partial unique code "Transfer"

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Verify Label Filter - Valid Label
    And The user enters "Event-51332" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Event-51332"

  Scenario: Verify Label Filter - Partial Unique Code
    And The user enters "Event" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Event"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Search for Ekosystem Family
    And The user clicks on Ekosystem Filtre
    And the user clicks on Search button
    And the user verify on family filter Ekosystem functionality

  Scenario: Search for IWSA Family
    And The user clicks on IWSA Filtre
    And the user clicks on Search button
    And the user verify on family filter IWSA functionality

  Scenario: Search for IWSA Family
    And The user clicks on WSET Filtre
    And the user clicks on Search button
    And the user verify on family filter WSET functionality