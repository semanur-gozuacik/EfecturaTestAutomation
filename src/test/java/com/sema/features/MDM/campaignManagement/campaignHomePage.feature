@regression
Feature: Campaign Management Test Cases- Campaign Home Page
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
    Given The user is on the Campaign item home page
    And   The User gets the current URL and stores it in "itemType=Campaign"

  Scenario: Verify Code Filter -Valid Unique Code
    And The user enters "welcometestgeneric122" into "Code" filter text input box
    Then The user verify "Code" text filter with value "welcometestgeneric122" in "overviewTable"

  Scenario:  Verify Code Filter -Valid Unique Code partial
    And The user enters "TEST" into "Code" filter text input box
    Then The user verify "Code" text filter with value "TEST" in "overviewTable"

  Scenario: Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into "Code" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario: Verify Label Filter - Valid Label
    And The user enters "testbirthday1561" into "Label" filter text input box
    Then The user verify "Label" text filter with value "testbirthday1561" in "overviewTable"

  Scenario: Verify Label Filter - Partial Label
    And The user enters "test" into "Label" filter text input box
    Then The user verify "Label" text filter with value "test" in "overviewTable"

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario Outline: Filter "<ItemStatus>" Item Statuses7
    And The user select "<ItemStatus>" in "ItemStatus" select filter
#     And the incoming filter for "<ItemStatus>" should contain
    Examples:
       |ItemStatus |
       |Active     |
       |Passive    |
       |On Hold    |
       |Draft      |

  Scenario: Reset Button Control
    And The user enters "sema12345" into "Label" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Label" text filter

  Scenario: Deleting an item and declining the popup message
    And The user enters "TESTSETSET123123" into "Code" filter text input box
    And The User clicks on delete button in table
    And The user clicks cancel button in overview delete popup
    Then The user verify "Code" text filter with value "TESTSETSET123123" in "overviewTable"

  Scenario: Verify My Count Star Item Functionality- One Contact
    And The user enters "TestWelcomeCampaignSecondPreview" into "Code" filter text input box
    And the user clicks on Star items

  Scenario: Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario: Verify Item Previous Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario: Verify Item next Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "next" button is "Passive"

  Scenario: Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario: Verify Last Page Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "lastpage" button is "Passive"

  Scenario Outline: Campaign Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |


  Scenario: Campaign Create List- cancel button
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "automation-campaign"
   #  And  The user enters "_5458429214" Can view
    # And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Cancel" button in create list modal
    Then The user verify list "automation-campaign" do not exists

  Scenario:Campaign Create List- create button
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "campaign-list"
   # And  The user enters "_5458429214" Can view
    #And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verify list "campaign-list" exists

  Scenario:Campaign Create List- create button-exist user
    And The user clicks add list button
    Then The user verifies New List popup is open
    When The user enters list name as "Sematestyeni"
   # And  The user enters "_5458429214" Can view
   # And  The user enters "1757483988_5392786463" Can edit
    And The user clicks "Save" button in create list modal
    Then The user verifies info "USER_LIST_ALREADY_EXISTS" appears

  Scenario:Campaign Create List- delete list-cancel button
    And The user clicks delete button in "campaign-list" list
    And The user clicks "Cancel" button in delete list modal
    Then The user verify list "campaign-list" exists

  Scenario:Campaign Create List- delete list
    And The user clicks delete button in "campaign-list" list
    And The user clicks "Delete" button in delete list modal
    Then The user verifies info "USER_LIST_DELETED" appears
    Then The user verify list "campaign-list" do not exists

  Scenario:Campaign edit -Attributes Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Attributes" tab

  Scenario:Campaign edit -Preview Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Preview" tab
   #  Then The user verifies preview tab details is displayed

  Scenario:Campaign edit -Item Comment Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab
    #Then The user verifies itemComment tab details is displayed

  Scenario:Campaign edit - AbstractPreview Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "AbstractPreview" tab
   # Then The user verifies My Account tab details is displayed

  Scenario:Campaign edit - Campaign-Account Tab export
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Campaign-Account" tab
   # When  The user clicks on Export button ediitem
    #Then  The user verify that the export was "Success"

  Scenario:Campaign edit - RealtimeList Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "RealtimeList" tab

  Scenario:Campaign edit - Categories Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:Campaign edit - History Tab
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button-Campaign
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
    And The user clicks save button in edit item
    And The user enters "automation" in comment area
    And The user clicks cancel button in edit item save modal
    And The user verify item status is not "<ItemStatus>" on item with code "TestAutomation"
    Examples:
      | ItemStatus |
      | Passive    |
      | Active     |

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
    And The user clicks save button in edit item
    And The user enters "automation" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears
    And The user verify item status is "<ItemStatus>" on item with code "TestAutomation"
    Examples:
      | ItemStatus |
      | Passive    |
      | Active     |

  Scenario:Campaign edit - Campaign-point Associated
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Campaign Points" tab

  Scenario:Campaign edit - Campaign-Account Associated
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "CAMPAIGN_ACCOUNT" tab
    And The user Assocaited All filter


  Scenario:Campaign edit - Campaign-Account Tab Associated Filter No
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "CAMPAIGN_ACCOUNT" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario: Campaign Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns

  Scenario: Campaign Home Page Columns - Default Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks Default button columns

  Scenario:Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "LastPage" button is "Passive"

  Scenario:Group Permission Verify Item next Button unclickable Condition
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
    And  The user verifies "Group" "_next" button is "Passive"

  Scenario:Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "LastPage" page button
#    And  The user verifies first page button is clickable asset

  Scenario:User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "FirstPage" button is "Passive"

  Scenario:User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "TestAutomation" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And  The user verifies "User" "_previous" button is "Passive"
