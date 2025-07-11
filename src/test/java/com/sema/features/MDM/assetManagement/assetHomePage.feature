@regression
Feature: Asset Management Test Cases- Asset Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Given The user is on the Asset item home page
    And   The User gets the current URL and stores it in "itemType=Asset"

  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "TEST123456" into "Code" filter text input box
#    And the user clicks on Search button
    Then The user verify "Code" text filter with value "TEST123456" in "overviewTable"

  Scenario:  Verify Code Filter -Valid Unique Code partial
    And The user enters "TEST" into "Code" filter text input box
    Then The user verify "Code" text filter with value "TEST" in "overviewTable"

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into "Code" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Verify Label Filter - Valid Label
    And The user enters "TEST12345" into "Label" filter text input box
    Then The user verify "Label" text filter with value "TEST12345" in "overviewTable"

  Scenario: Verify Label Filter - Partial Label
    And The user enters "test" into "Label" filter text input box
    Then The user verify "Label" text filter with value "test" in "overviewTable"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Create List- cancel button
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "automation-asset"
    # And  The user enters "_5458429214" Can view
   #  And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Cancel" button in create list modal
    Then The user verify list "automation-asset" do not exists

  Scenario: Create List- create button
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "automation"

  Scenario: Create List- create button-exist user
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "Sematestyeni"
   #  And  The user enters "_5458429214" Can view
     #And  The user enters "1757483988_5392786463" Can edit
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

  Scenario:Asset Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstPageTable" button is "Passive"

  Scenario:Asset Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "items_previous" button is "Passive"

  Scenario:Asset Home Page Verify Item next Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "next" button is "Passive"

  Scenario:Asset Home Page Verify Last Page Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "lastpage" button is "Passive"

  Scenario:Asset Home Page Verify First Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "firstpage" button is "Active"

  Scenario:Asset Home Page Verify Previous Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "previous" button is "Active"

  Scenario:Asset Home Page Verify Item next Button Clickable Condition
    And  The user verifies "next" button is "Active"

  Scenario:Asset Home Page Verify Last Page Button Clickable Condition
    And  The user verifies "lastpage" button is "Active"

  Scenario: Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario Outline: Asset Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |


  Scenario: Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter


