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
#    And the user clicks on Star items
    And The user reset the basic filters

    Examples:
      | Code                 |
      | testcontact2322      |
      | testforDIAGEOcontact |

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
    And The user select "<ItemStatus>" in "ItemStatus" select filter
 #    And the incoming filter for "<ItemStatus>" should contain
    Examples:
      | ItemStatus |
      | Draft      |
      | Passive    |
      | Approved   |

  Scenario: Reset Button Control
#    When The user clicks My Contact button
    And The user enters "Test2123" into "Code" filter text input box
#    And The user clicks on Ekosystem Filtre
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario: Deleting an item and declining the popup message
    When The user clicks My Contact button
    And The user enters "2904TEST" into "Code" filter text input box
    And The User clicks on delete button in table
    And The user clicks cancel button in overview delete popup
    Then The user verify that "2904TEST" is visible

  Scenario: My Contact page edit verify
    When The user clicks My Contact button
    And The user enters "0058950138" into "Code" filter text input box
    And The user clicks on edit button in table
    Then The user verify Edit Page

  Scenario:My Contact Verify First Page Button Unclickable Condition
    And  The user verifies "firstPageTable" button is "Passive"

  Scenario:My Contact Verify Previous Page Button Unclickable Condition
    And  The user verifies "items_previous" button is "Passive"

  Scenario:My Contact Verify Item next Button Unclickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "items_next" button is "Passive"

  Scenario:My Contact Verify Last Page Button Unclickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "lastPageTable" button is "Passive"

  Scenario:My Contact Verify First Page Button Clickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "firstPageTable" button is "Active"

  Scenario:My Contact Verify Previous Page Button Clickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "items_previous" button is "Active"

  Scenario:My Contact Verify Item next Button Clickable Condition
    And  The user verifies "items_next" button is "Active"

  Scenario:My Contact Verify Last Page Button Clickable Condition
    And  The user verifies "lastPageTable" button is "Active"


  Scenario Outline: Contact Home Page User selects different options for show entries
    When The user clicks My Contact button
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |


  Scenario Outline:My Count Delete Star Item Functionality
    And The user enters "<Code>" into "Code" filter text input box
#    And the user clicks on Star items
    And The user reset the basic filters

    Examples:
      | Code                 |
      | testcontact2322      |
      | testforDIAGEOcontact |

  Scenario: My Count Verify export button
    When The user clicks My Contact button
    And The user waits ten seconds
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears