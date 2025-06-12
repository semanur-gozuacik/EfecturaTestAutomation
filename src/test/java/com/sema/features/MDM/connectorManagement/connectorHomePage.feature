@regression
Feature: Connector Management Test Cases- Connector Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Given The user is on the Connector item home page
    And   The User gets the current URL and stores it in "itemType=Connector"

  #Scenario: Verify ID Filter - Unique ıd
   # And The user enters "53778" into ıd field
    #And the user clicks on Search button
   # And the user verify on ıd filter functionality "53778"

  Scenario:Connector Verify Label Filter - Valid Label
    And The user enters "JSONFile" into "Label" filter text input box
    Then The user verify "Label" text filter with value "JSONFile" in "overviewTable"

  Scenario: Connector Verify Label Filter - Partial Unique Label
    And The user enters "JSON" into "Label" filter text input box
    Then The user verify "Label" text filter with value "JSON" in "overviewTable"

  Scenario:Connector Verify Code Filter -Valid Unique Code
    And The user enters "test212129" into "Code" filter text input box
    Then The user verify "Code" text filter with value "test212129" in "overviewTable"

  Scenario:Connector Verify Code Filter -Valid partial Code
    And The user enters "test" into "Code" filter text input box
    Then The user verify "Code" text filter with value "test" in "overviewTable"

  Scenario: Reset Button Control
    And The user enters "test212129" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

   # And   The user
   #  Scenario: Verify export button
   #    When  The user clicks on Export button
   #    Then  The user verify that the export was "Success" verify that the file is located in the downloads folder
#    And   The user verify that the file is in the correct format


  # You can write button names like these in future file:
  # firstPageTable, items_previous, items_next, lastPageTable

  Scenario:Connector Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstPageTable" button is "Passive"

  Scenario:Connector Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "items_previous" button is "Passive"

  Scenario:Connector Page Verify Item next Button Unclickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "items_next" button is "Passive"

  Scenario: Connector Page Verify Last Page Button Unclickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "lastPageTable" button is "Passive"

  Scenario:Connector Page Verify First Page Button Clickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "firstPageTable" button is "Active"

  Scenario:Connector Page Verify Previous Page Button Clickable Condition
    When The user clicks 'lastPageTable' pagination button
    And  The user verifies "items_previous" button is "Active"

  Scenario:Connector Page Verify Item next Button Clickable Condition
    And  The user verifies "items_next" button is "Active"

  Scenario: Connector Page Verify Last Page Button Clickable Condition
    And  The user verifies "lastPageTable" button is "Active"

  Scenario Outline: Connector Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries |
      | 100     |
      | 50      |
      | 25      |
      | 10      |


  Scenario: Create List- create button
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "automation-connector"
    #And  The user enters "_5458429214" Can view
   # And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verifies info "USER_LIST_ADDED" appears
    Then The user verify list "automation-connector" exists

  Scenario: Create List- create button-exist user
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "Sematestyeni"
  #  And  The user enters "_5458429214" Can view
   # And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verifies info "USER_LIST_ALREADY_EXISTS" appears

  Scenario: Create List- delete list-cancel button
    And The user clicks delete button in "automation-connector" list
    And The user clicks "Cancel" button in delete list modal
    Then The user verify list "automation-connector" exists

  Scenario: Create List- delete list
    And The user clicks delete button in "automation-connector" list
    And The user clicks "Delete" button in delete list modal
    Then The user verifies info "USER_LIST_DELETED" appears
    Then The user verify list "automation-connector" do not exists

  Scenario: Connector page edit verify
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    Then The user verify Edit Page-Connector

  Scenario: Verify Connector Star Item Functionality- One Contact
    And The user enters "1connector1" into "Code" filter text input box
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario: Verify Connector  Items Functionality- more than One Contact
    And The user enters "1connector1" into "Code" filter text input box
    And the user clicks on Star items
    And the user verify My Count badge count is correct

  Scenario:Connector edit -Attributes Tab
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Attributes" tab

  Scenario:Connector edit -ItemComment Tab
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:Connector edit -Categories Tab
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario: Connector Edit item added list
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks list drop down button
    And  The user clicks new list item-connector
    Then The user verifies item is added

  Scenario: Connector Edit item removed list
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks removed button
    Then The user verifies item is removed

  Scenario:Connector Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "FirstPage" button is "Passive"

  Scenario:Connector Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_previous" button is "Passive"

  Scenario:Connector Group Permission Verify Item next Button clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_next" button is "Active"

  Scenario:Connector Group Permission Verify Previous Page Button clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_previous" button is "Active"

  Scenario:Connector Group Permission Verify Last Page Button clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "LastPage" button is "Active"

  Scenario:Connector Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "LastPage" button is "Passive"

  Scenario:Connector Group Permission Verify Item next Button unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "_next" button is "Passive"

  Scenario:Connector Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "FirstPage" button is "Active"

  Scenario:Connector User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "FirstPage" button is "Passive"

  Scenario:Connector User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "_previous" button is "Passive"

  Scenario:Connector User Permission Verify Item next Button clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_next" button is "Active"

  Scenario:Connector User Permission Verify Previous Page Button clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_previous" button is "Active"

  Scenario:Connector User Permission Verify Last Page Button clickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "LastPage" button is "Active"

  Scenario:Connector User Permission Verify Last Page Button Unclickable Condition
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "LastPage" button is "Passive"

  Scenario:Connector Edit item status Passive Item Status-cancel button
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "Passive"
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks cancel button in edit item save modal

  Scenario:Connector Edit item status Passive  Item Status- save button
    And The user enters "1connector1" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "Passive"
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  #Scenario:Connector Edit item status Passive Item Status-cancel button
    #And The user enters "randomSKU" into Code field
   # And the user clicks on Search button
    #And The user clicks on Edit Button
  #  And the user selects "Active"
   # And the user clicks on unsaved change button
   # And The user enters "-------" in  comment area
   # And The user clicks cancel button
   # And the user verifies item status not change

  #Scenario:Connector Edit item status Passive  Item Status- save button
   # And The user enters "randomSKU" into Code field
  #  And the user clicks on Search button
   # And The user clicks on Edit Button
   # And the user selects "Active"
   # And the user clicks on unsaved change button
   # And The user enters "-------" in  comment area
  #  And The user clicks save button
   # And the user verifies item status success message
