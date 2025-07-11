@regression
Feature: KPI Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the KPI item home page
    And   The User gets the current URL and stores it in "itemType=KPI"

  Scenario: Create KPI on Fletum with invalid family
      Then   The User waits until the createItem element is visible with a timeout of 120 seconds
      And   The User clicks on the createItem element
      Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
      And   The User inputs the value from cont into the inputCode field
     And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    And   The User clicks on the ROOT  element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario: Create KPI on Fletum without Categories-EKOSYSTEM
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User presses the down arrow key and then presses Enter  in the "KPI" element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "Please choose categories" text with a timeout of 120 seconds

  Scenario: Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario:KPI Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:KPI Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario:KPI Home Page Verify Item next Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "next" button is "Passive"

  Scenario:KPI Home Page Verify Last Page Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "lastpage" button is "Passive"

  Scenario:KPI Home Page Verify First Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "firstpage" button is "Active"

  Scenario:KPI Home Page Verify Previous Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "previous" button is "Active"

  Scenario:KPI Home Page Verify Item next Button Clickable Condition
    And  The user verifies "next" button is "Active"

  Scenario:KPI Home Page Verify Last Page Button Clickable Condition
    And  The user verifies "lastpage" button is "Active"

  Scenario: KPI Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario: Create List- create button-exist user
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "Sematestyeni"
   # And  The user enters "_5458429214" Can view
    # And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verifies info "USER_LIST_ALREADY_EXISTS" appears

  Scenario Outline: KPI Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |


  Scenario: KPI page edit verify
    And The user enters "YENİTEST1411" into "Code" filter text input box
    And The user clicks on edit button in table

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "Total Earning Points" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
       #And The user clicks cancel button
      # And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |
      # |Passive    |

  Scenario:Contact edit -History Tab
    And The user enters "Total Earning Points" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario:Contact edit -Categories Tab
    And The user enters "Total Earning Points" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:Contact edit - Transaction Tab
    And The user enters "Total Earning Points" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Transaction History" tab

  Scenario:Contact edit -ItemComment Tab
    And The user enters "Total Earning Points" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:KPI Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "FirstPage" button is "Passive"

  Scenario:KPI Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_previous" button is "Passive"

  Scenario:KPI Group Permission Verify Item next Button clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_next" button is "Active"

  Scenario:KPI Group Permission Verify Previous Page Button clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_previous" button is "Active"

  Scenario:KPI Group Permission Verify Last Page Button clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "LastPage" button is "Active"

  Scenario:KPI Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "LastPage" button is "Passive"

  Scenario:KPI Group Permission Verify Item next Button unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "_next" button is "Passive"

  Scenario:KPI Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "FirstPage" button is "Active"

  Scenario:KPI User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "FirstPage" button is "Passive"

  Scenario:KPI User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "_previous" button is "Passive"

  Scenario:KPI User Permission Verify Item next Button clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "_next" button is "Active"

  Scenario:KPI User Permission Verify Previous Page Button clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_previous" button is "Active"

  Scenario:KPI User Permission Verify Last Page Button clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "LastPage" button is "Active"

  Scenario:KPI User Permission Verify Last Page Button Unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "LastPage" button is "Passive"

  Scenario:KPI User Permission Verify Item next Button unclickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "_next" button is "Passive"

  Scenario:KPI User Permission Verify Item First Page Button Clickable Condition
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "FirstPage" button is "Active"

  Scenario:KPI edit -Item Comment Tab
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:KPI Organization  edit - Categories Tab
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:KPI Organization edit - History Tab
    And The user enters "sematest123" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab