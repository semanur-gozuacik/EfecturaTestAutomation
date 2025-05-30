@regression
Feature: Contact Management Test Cases-My Contact Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the Persons element is visible with a timeout of 15 seconds
    Given The user is on the Contact item home page
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario Outline:  My Count Add Star Item Functionality- One Contact
    And The user enters "<Code>" into "Code" filter text input box
    And the user clicks on Star items
    And the user clicks on Reset button
    Examples:
    |Code|
    |testcontact2322|
    |testforDIAGEOcontact|

   Scenario: Verify My Contact Button
   When The user clicks My Contact button
   And   The User gets the current URL and stores it in "ItemType=Contact&isFavorite=true"
   And The user verifies its contacts is displayed

  Scenario: Verify Code Filter -Valid Unique Code
    When The user open side accordion in overview
#    When The user clicks My Contact button
#    And The user clicks on Contact  category
    And The user enters "0058950138" into "Code" filter text input box
#    And the user verify on code filter functionality "0058950138"
    Then The user verify "Code" text filter with value "0058950138" in "overviewTable"

  Scenario:  Verify Code Filter -Valid Partial Unique Code
#    When The user clicks My Contact button
    And The user enters "test" into "Code" filter text input box
#    And the user verify on code filter functionality with partial unique code "test"
    Then The user verify "Code" text filter with value "test" in "overviewTable"

  Scenario: Verify Code Filter - Invalid Unique Code
    When The user clicks My Contact button
    And The user enters "sema12345" into "Code" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Verify Label Filter - Valid Label
#    When The user clicks My Contact button
    And The user enters "denem" into "Label" filter text input box
#    And the user verify on label filter functionality with partial unique code "test_automation"
    Then The user verify "Label" text filter with value "denem" in "overviewTable"

  Scenario: Verify Label Filter - Partial Unique Code
#    When The user clicks My Contact button
    And The user enters "Test" into "Label" filter text input box
   # And the user verify on label filter functionality with partial unique code "Test"
    Then The user verify "Label" text filter with value "Test" in "overviewTable"

  Scenario: Verify Label Filter - Invalid  Label
    When The user clicks My Contact button
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Search for Ekosystem Family
    When The user clicks My Contact button
    And The user clicks on Ekosystem Filtre
    #And the user verify on family filter Ekosystem functionality

  Scenario: Search for IWSA Family
    When The user clicks My Contact button
    And The user clicks on IWSA Filtre
    And the user verify on family filter IWSA functionality

  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    When The user clicks My Contact button
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
 #    And the incoming filter for "<ItemStatus>" should contain
    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Approved   |

  Scenario: Reset Button Control
    When The user clicks My Contact button
    And The user enters "Test2123" into "Code" filter text input box
    And The user clicks on Ekosystem Filtre
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario: Deleting an item and declining the popup message
    When The user clicks My Contact button
    And The user enters "test_auto" into "Code" filter text input box
    And The user clicks on Delete
    And The user declines the popup message
    Then The user verify that "test_automation" is visible

  Scenario: My Contact page edit verify
    When The user clicks My Contact button
    And The user enters "0058950138" into "Code" filter text input box
    And The user clicks on edit button in table
    Then The user verify Edit Page

  Scenario:My Contact Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:My Contact Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:My Contact Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:My Contact Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:My Contact Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:My Contact Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:My Contact Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario:My Contact Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable


  Scenario Outline: Contact Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|


  Scenario Outline:My Count Delete Star Item Functionality
    And The user enters "<Code>" into "Code" filter text input box
    And the user clicks on Star items
    And the user clicks on Reset button
    Examples:
      |Code|
      |testcontact2322|
      |testforDIAGEOcontact|

  Scenario: My Count Verify export button
    When The user clicks My Contact button
    And The user waits ten seconds
    When  The user clicks on Export button
   # Then  The user verify that the export was "Success"