@regression
Feature: File Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the File Managemenet item home page
    And   The User gets the current URL and stores it in "itemType=File"

  Scenario:File Verify export button
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario:File Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:File Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario Outline: File Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |


  Scenario: File  Home Page Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario:File  Home Page Verify Label Filter - Valid Label
    And The user enters "Unique" into "Label" filter text input box
    Then The user verify "Label" text filter with value "Unique" in "overviewTable"


  Scenario: File  Home Page Verify Label Filter - Invalid  Label
    And The user enters "596348452" into "Label" filter text input box
#    And the user clicks on Search button
    And The user verify empty data table info 'No matching records found'

  Scenario Outline: File  Home Page Filter "<ItemStatus>" Item Statuses
    And The user select "<ItemStatus>" in "ItemStatus" select filter
    # And the incoming filter for "<ItemStatus>" should contain
    Examples:
      | ItemStatus |
      | Active     |
      | Passive    |
      | Draft      |

  Scenario:ID Tab Sorting Functionality
    And  The user clicks id tab
    And  The user clicks id tab
   # Then The user verifies sort id numbers from "largest to smallest"


  Scenario: File  Home Page Columns - Cancel Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns

  Scenario: File  Home Page Columns - save Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns


  Scenario Outline: File  Home Page Associated Tab Status Fılter "<Status>"
    And The user enters "File_296034" into "Code" filter text input box
    And  the user clicks on Search button
    And The user clicks on edit button in table
    And  The user clicks "BANNER_MRP" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |

  Scenario:File edit -Event-Contact Tab
    And The user enters "File_296034" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Previeew" tab

  Scenario:File edit -Event-Contact Tab
    And The user enters "File_296034" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "ItemComment" tab

  Scenario:File edit -Event-Contact Tab
    And The user enters "File_296034" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Training-File" tab

  Scenario:File edit - Event-Contact Tab Associated
    And The user enters "File_296034" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Training-File" tab
    And The user select "No" in "IsAssociated" select filter
    And The user clicks item
    And The user clicks save button in edit item
    And The user enters "-------" in comment area
    And The user clicks save button in edit item save modal
    Then The user verifies info "Changes saved successfully." appears

  Scenario:File edit -Event-Contact Tab Associated Filter No
    And The user enters "File_296034" into "Code" filter text input box
    And the user clicks on Search button
    And The user clicks on edit button in table
    And The user clicks "Training-File" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"