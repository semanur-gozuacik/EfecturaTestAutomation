@regression
Feature: Contact Management Test Cases-My Contact Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    And   The User performs a mouseover on the MDM element
    And   The User performs a mouseover on the Contact Management element
    And   The User performs a mouseover on the Contact element
    And   The User clicks on the Contact element
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario Outline:  My Count Add Star Item Functionality- One Contact
    And The user clicks on Contact  category
    And The user enters "<Code>" into Code field
    And the user clicks on Search button
    And the user clicks on Star items
    And the user clicks on Reset button
    Examples:
    |Code|
    |sematestttt|
    |testforDIAGEOcontact|

   Scenario: Verify My Contact Button
   When The user clicks My Contact button
   And   The User gets the current URL and stores it in "ItemType=Contact&isFavorite=true"
   And The user verifies its contacts is displayed

  Scenario: Verify Code Filter -Valid Unique Code
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "Test2123" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality "Test2123"

  Scenario:  Verify Code Filter -Valid Partial Unique Code
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "test" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality with partial unique code "test"

  Scenario: Verify Code Filter - Invalid Unique Code
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Verify Label Filter - Valid Label
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "Test2123" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test2123"

  Scenario: Verify Label Filter - Partial Unique Code
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "Test" into Label field
    And the user clicks on Search button
    And the user verify on label filter functionality with partial unique code "Test"

  Scenario: Verify Label Filter - Invalid  Label
    When The user clicks My Contact button
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: Search for Ekosystem Family
    When The user clicks My Contact button
    And The user clicks on Ekosystem Filtre
    And the user clicks on Search button
    And the user verify on family filter Ekosystem functionality

  Scenario: Search for IWSA Family
    When The user clicks My Contact button
    And The user clicks on IWSA Filtre
    And the user clicks on Search button
    And the user verify on family filter IWSA functionality

  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    When The user clicks My Contact button
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
    And the user clicks on Search button
    And the incoming filter for "<ItemStatus>" should contain
    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Approved   |

  Scenario: Reset Button Control
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "Test2123" into Code field
    And The user clicks on Ekosystem Filtre
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario: Deleting an item and declining the popup message
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Delete
    And The user declines the popup message
    Then The user verify that "sematestttt" is visible

  #Scenario: Deleting an item and accepting the popup message
   # When The user clicks My Contact button
   # And The user clicks on Contact  category
    #And The user enters "sematestttt" into Code field
   # And the user clicks on Search button
  # And The user clicks on Delete
   # And The user accepts the popup message

  Scenario Outline: User selects different options for show entries
    When The user clicks My Contact button
    Given The user clicks show entries button
    When  The user selects "<entrie>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
    #|25 |
    #|50 |
    #|100|

  Scenario: My Contact page edit verify
    When The user clicks My Contact button
    And The user clicks on Contact  category
    And The user enters "sematestttt" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    Then The user verify Edit Page

    Scenario: Verify Item Next Button
      When The user clicks My Contact button
      And  The user clicks item next button
    #  Then The user verify next items is displayed

  Scenario: Verify Item Previous Button
    When The user clicks My Contact button
    And  The user clicks item previous button
 #   Then The user verify previous items is displayed

  Scenario: Verify Item Previous Button Unclickable Condition
    When The user clicks My Contact button
   # And  The user verifies previous button is not clickable

  Scenario: Verify Item Left Previous Button Unclickable Condition
    When The user clicks My Contact button
    And  The user verifies left previous button is not clickable

  Scenario: Verify Item next Button Unclickable Condition
    When The user clicks My Contact button
    And  The user verifies next button is not clickable

  Scenario: Verify Item Right Last Button Unclickable Condition
    When The user clicks My Contact button
    And  The user verifies left previous button is not clickable

  Scenario Outline:My Count Delete Star Item Functionality
    And The user clicks on Contact  category
    And The user enters "<Code>" into Code field
    And the user clicks on Search button
    And the user clicks on Star items
    And the user clicks on Reset button
    Examples:
      |Code|
      |sematestttt|
      |testforDIAGEOcontact|
