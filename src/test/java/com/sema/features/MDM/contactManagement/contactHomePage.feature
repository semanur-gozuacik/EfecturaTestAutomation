@regression
Feature: Contact Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Contact item home page
    And   The User gets the current URL and stores it in "itemType=Contact"

  Scenario: Contact category functionality check
    And The user clicks on Contact  category
    And The user verifies that the codes shown in the Contact label filter are contact categories

   Scenario:Contact category - subcategory New Node functionality check
     And The user clicks on New node
     And The user verifies that the codes shown in the New Node label filter are contact categories

  Scenario: Contact category - subcategory Unassigned Records functionality check
    And The user clicks on Unassigned Records Category category
    And The user verifies that the codes shown in the Unassigned label filter are contact categories

  Scenario: Verify Code Filter -Valid Unique Code
#    And The user clicks on Contact  category
    And The user enters "semaotomasyon" into "Code" filter text input box
#    And the user verify on code filter functionality "test_automation"
    Then The user verify "Code" text filter with value "semaotomasyon" in "overviewTable"

  Scenario:Verify Code Filter -Valid partial Code
#    And The user clicks on Contact  category
    And The user enters "test" into "Code" filter text input box
#    And the user verify on code filter functionality with partial unique code "test"
    Then The user verify "Code" text filter with value "test" in "overviewTable"

  Scenario: Verify Code Filter - Invalid Unique Code
#    And The user clicks on Contact  category
    And The user enters "sema12345" into "Code" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Verify Label Filter - Valid Label
#    And The user clicks on Contact  category
    And The user enters "semaotoma" into "Label" filter text input box
#    And the user verify on label filter functionality with partial unique code "semaotomasyon"
    Then The user verify "Label" text filter with value "semaotoma" in "overviewTable"

  Scenario: Verify Label Filter - Partial Unique Code
#    And The user clicks on Contact  category
    And The user enters "test" into "Label" filter text input box
#    And the user verify on label filter functionality with partial unique code "test"
    Then The user verify "Label" text filter with value "test" in "overviewTable"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Search for Ekosystem Family
    And The user clicks on Ekosystem Filtre
     #And the user verify on family filter Ekosystem functionality

  Scenario: Search for IWSA Family
    And The user clicks on IWSA Filtre
     #And the user verify on family filter IWSA functionality

  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    And The user select "<ItemStatus>" in "ItemStatus" select filter
     #And the incoming filter for "<ItemStatus>" should contain
    Examples:
      | ItemStatus |
      | Draft      |
      | Passive    |
      | Approved   |

  Scenario: Reset Button Control
      And The user clicks on Contact  category
      And The user enters "test2123" into "Code" filter text input box
#      And The user clicks on Ekosystem Filtre
#      And the user clicks on Reset button
#      And the user verify Reset button functionality
      And The user reset the basic filters
      And The user verify Reset button func for "Code" text filter

  Scenario: Deleting an item and declining the popup message
    And The user clicks on Contact  category
    And The user enters "semaotomasyon" into "Code" filter text input box
    And The User clicks on delete button in table
    And The user clicks cancel button in overview delete popup
    Then The user verify that "semaotomasyon" is visible

  Scenario: Contact page edit verify
    And The user clicks on Contact  category
    And The user enters "sematestttt" into "Code" filter text input box
    And The user clicks on edit button in table
    Then The user verify Edit Page

    Scenario Outline: Verify "<starFeature>" visibility and badge count
      Then The user verifies that "<starFeature>" is visible
      Given The user clicks "<starFeature>"
      And The user verifies that the badge count for feature is correct
      Examples:
      |starFeature   |
    #|My Partners   |
     |My Events     |
      |My Contacts   |

  Scenario: Verify My Count Star Item Functionality- One Contact
    And The user clicks on Contact  category
    And The user enters "sematestttt" into "Code" filter text input box
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario: Verify My Count Star Items Functionality- more than One Contact
    And The user clicks on Contact  category
    And The user enters "test" into "Code" filter text input box
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario: Verify export button
    When  The user clicks on Export button


  Scenario:Contact Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstPageTable" button is "Passive"

  Scenario:Contact Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "items_previous" button is "Passive"

  Scenario:Contact Page Verify Item next Button Unclickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "items_next" button is "Passive"

  Scenario: Contact Page Verify Last Page Button Unclickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "lastPageTable" button is "Passive"

  Scenario:Contact Page Verify First Page Button Clickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "firstPageTable" button is "Active"

  Scenario:Contact Page Verify Previous Page Button Clickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "items_previous" button is "Active"

  Scenario:Contact Page Verify Item next Button Clickable Condition
    And  The user verifies "items_next" button is "Active"

  Scenario: Contact Page Verify Last Page Button Clickable Condition
    And  The user verifies "lastPageTable" button is "Active"


  Scenario Outline: Contact Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |


  Scenario: Verify the redirection to the My Contacts page
    Then The user verifies that "My Contacts" is visible
    Given The user clicks "My Contacts"
    And   The User gets the current URL and stores it in "ItemType=Contact&isFavorite=true"

  Scenario: Verify the redirection to the My Event page
    Then The user verifies that "My Events" is visible
    Given The user clicks "My Events"
    And   The User gets the current URL and stores it in "ItemType=Event&isFavorite=true"

  Scenario: Create List- create button
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "automation-contact"
  # And  The user enters "_5458429214" Can view
    # And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verifies info "USER_LIST_ADDED" appears
    Then The user verify list "automation-contact" exists

  Scenario: Create List- create button-exist user
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "Sematestyeni"
    # And  The user enters "_5458429214" Can view
   #  And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verifies info "USER_LIST_ALREADY_EXISTS" appears

  Scenario: Create List- delete list-cancel button
    And The user clicks delete button in "automation-asset" list
    And The user clicks "Cancel" button in delete list modal
    Then The user verify list "automation-asset" exists

  Scenario: Create List- delete list
    And The user clicks delete button in "automation-asset" list
    And The user clicks "Delete" button in delete list modal
    Then The user verifies info "USER_LIST_DELETED" appears
    Then The user verify list "automation-asset" do not exists

  Scenario:Update On Tab DateTime Sorting Functionality
    And The user clicks update on tab
    And The user clicks update on tab
  #   Then The user verifies that dates are sorted from "near to distant"

  Scenario:Create On Tab DateTime Sorting Functionality
    And The user clicks create on tab
    And The user clicks create on tab
  #  Then The user verifies that dates are sorted from "near to distant" create on

  Scenario:ID Tab Sorting Functionality
    And  The user clicks id tab
    And  The user clicks id tab
   # Then The user verifies sort id numbers from "largest to smallest"

  Scenario:Birthdate Sorting Functionality
    And The user clicks birthdate on tab
    And The user clicks birthdate on tab
    #Then The user verifies that birthdate are sorted from "near to distant"

  Scenario: Contact Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns