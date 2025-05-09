@regression @yeni
Feature: Sales Organization Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the SalesOrganization item home page
    And   The User gets the current URL and stores it in "itemType=SalesOrganization"

  Scenario:Sales Organization Verify export button
    When  The user clicks on Export button

  Scenario:Sales Organization Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Sales Organization Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario Outline: Sales Organization Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|

  Scenario: Sales Organization Reset Button Control
    And The user enters "test2123" into "Code" filter text input box
    And the user clicks on Reset button
   # And the user verify Reset button functionality

  Scenario:Sales Organization Verify Label Filter - Valid Label
    And The user enters "TEST123456" into "Label" filter text input box

  Scenario: Verify Label Filter - Invalid  Label
    And The user enters "44444" into "Label" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario:Sales Organization Create List- create button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name

  Scenario: Sales Organization Edit item removed list
    And The user enters "TESTBM" into "Code" filter text input box
    And  the user clicks on Search button
    And The user clicks on edit button in table
    And  The user clicks removed button
    Then The user verifies item is removed

  Scenario Outline: Sales Organization Filter "<ItemStatus>" Item Statuses
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
    And the user clicks on Search button
    # And the incoming filter for "<ItemStatus>" should contain
    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Blanks    |

  Scenario:Sales Organization Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into "Code" filter text input box
    And The user verify empty data table info 'No matching records found'

  Scenario::Sales Organization Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "User" "FirstPage" button is "Passive"

  Scenario::Sales Organization Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    And  The user verifies "Group" "_previous" button is "Passive"

  Scenario:Sales Organization Group Permission Verify Item next Button clickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_next" button is "Active"

  Scenario:Sales Organization  Group Permission Verify Previous Page Button clickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "Group" "_next" page button
    And  The user verifies "Group" "_previous" button is "Active"

  Scenario:Sales Organization Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Group Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "LastPage" button is "Passive"

  Scenario:Sales Organization  User Permission Verify Previous Page Button clickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "_next" page button
    And  The user verifies "User" "_previous" button is "Active"

  Scenario:Sales Organization  User Permission Verify Last Page Button clickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    And The user clicks "User" "_next" page button
    And The user verifies "User" "LastPage" button is "Active"

  Scenario:Sales Organization  User Permission Verify Last Page Button Unclickable Condition
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "User Permissions" tab
    When The user clicks "User" "LastPage" page button
    And  The user verifies "User" "LastPage" button is "Passive"

  Scenario:Sales Organization edit -SO_MRP Associated
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "BM_SM" tab
    And The user Assocaited All filter

  Scenario:Sales Organization  edit - SO_MRP Tab Associated Filter No
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "BM_SM" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:Sales Organization  edit -SO_MRP  tab- All Filter
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "BM_SM" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario: Sales Organization Home Page Columns - Cancel Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns

  Scenario: Sales Organization Home Page Columns - save Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns

  Scenario Outline: Sales Organization Associated Tab Status Fılter "<Status>"
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And  The user clicks "BM_SM" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |

  Scenario: Sales Organization  Export Entity Button - Attributes
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: Sales Organization  Export Entity Button - Associations
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: Sales Organization Export Entity Button - Permission
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario:Sales Organization  edit - Categories Tab
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:Sales Organization edit - History Tab
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "TESTBM" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
       #And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks save button
       #And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |

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

  Scenario: Create Asset on Fletum without Categories
    And   The User clicks on the createItem element
    Given The user waits until the element with id  Infoitem is visible.
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User clicks on the createButton element



