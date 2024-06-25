@regression
Feature: User Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    Given The user is on the Users item home page
    And   The User gets the current URL and stores it in "itemType=MRP"

  Scenario: Create User on Fletum with invalid family
    Then   The User waits until the createItem element is visible with a timeout of 120 seconds
    And   The User clicks on the createItem element
    Then The User waits until the uniqueCode element is visible with a timeout of 120 seconds
    And   The User inputs the value from cont into the inputCode field
    And   The User presses the down arrow key and then presses Enter in the Choose Family element
    And   The User clicks on the Categories element
    And   The User clicks on the ROOT  element
    And   The User clicks on the createButton element
    Then  The User waits until the page contains "EMPTY_FAMILY" with a timeout of 120 seconds

  Scenario:User Home Page Verify export button
    When  The user clicks on Export button
  #  Then  The user verify that the export was "Success"

  Scenario:User Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:User Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:User Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:User Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:User Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:User Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:User Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario:User Home Page Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable

  Scenario Outline: User Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|
      |250|

  Scenario: User Reset Button Control
    And The user enters "test2123" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:User Home Page Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario: User Home Page edit verify
    And The user enters "Vladov" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "Vladov" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
    #And the user clicks on unsaved change button
    #And The user enters "-------" in  comment area
   # And The user clicks cancel button
    #And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |


  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "Vladov" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
  #  And the user clicks on unsaved change button
  # # And The user enters "-------" in  comment area
   # And The user clicks save button
   # And the user verifies item status success message

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |

  Scenario:User edit -Preview tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Preview" tab

  Scenario:User edit -ItemComment tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ItemComment" tab

  Scenario:User edit -User tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "User" tab

  Scenario:User edit -PaymentTransactions tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "PaymentTransactions" tab

  Scenario:User edit -SBTransactions tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "SBTransactions" tab


  Scenario:User edit -History tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:User edit -Saha-Satış tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Saha-Satış" tab

  Scenario:Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    #And  The user verifies previous button is not clickable asset

  Scenario:Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset


  Scenario:Group Permission Verify Item next Button clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset


  Scenario: Group Permission Verify Previous Page Button clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario: Group Permission Verify Last Page Button clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario: Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is unclickable asset

  Scenario:Group Permission Verify Item next Button unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies next button is unclickable asset

  Scenario:Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
   # And  The user verifies first page button is clickable asset

  Scenario: User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies first page button is not clickable user

  Scenario:User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies previous page button is not clickable user

  Scenario:User Permission Verify Item next Button clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    And  The user verifies next button is clickable user

  Scenario:User Permission Verify Previous Page Button clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    When The user clicks next page button user
    When The user clicks previous page button user
    And  The user verifies previous button is clickable user

  Scenario:User Permission Verify Last Page Button clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is clickable user

  Scenario: User Permission Verify Last Page Button Unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is unclickable asset

  Scenario:User Permission Verify Item next Button unclickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies next button is unclickable user

  Scenario: User Permission Verify Item First Page Button Clickable Condition
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies first page button is clickable user

  Scenario:User edit -Preview Tab Export Button
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Preview" tab
    And The user clicks Export PDF button
    Then The user verifies the file is downloaded

  Scenario:User edit -Preview Tab Refresh  Button
    And  The user enters "Otomasyon" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks "Preview" tab
    And  The user clicks Refresh button
    Then The user verifies refresh button

  Scenario:User edit -Account-MRP tab- All Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:User edit -Account-MRP tab No Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario:User edit -Account-MRP tab- Valid Label Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
    #And The user enters valid label filter-"YENİTEST111111113"
    #And The user verifies that filter is displayed

  Scenario:User edit -Account-MRP tab- Invalid Label Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
     #And The user enters invalid label filter-"invalidlabel"
    #And The user verifies that filter is not displayed

  Scenario:User edit -Account-MRP tab- Reset Button
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
    And The user enters valid label filter-"YENİTEST111111113"
    And The user clicks Reset button edit item

  Scenario:User edit -Account-MRP tab- Refresh Button
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
   # And The user enters valid label filter-"YENİTEST111111113"
    #And The user clicks Refresh button edit item


  Scenario Outline: User edit -Account-MRP tab -Family Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
    And The user clicks family filter
    And The user selects "<family>"
    Examples:
    |family|
    |NEXIO |
    |DEF_ACCOUNT|
    |HOSPITALITY|

  Scenario: User Export Entity Button - Attributes
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Attributes
    Then The user dowloand Export Entity verifies

  Scenario: User Export Entity Button - Associations
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: User Export Entity Button - Permission
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario Outline:User edit -Account-MRP tab- Status Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user Assocaited All filter
    And The user selects edit item "<status>"
    Examples:
    |status|
    |Enable|
    |Disable|

  Scenario:User edit -Training-User tab Assocaited All filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Training-User" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:User edit -Training-User tab  Assocaited No filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Training-User" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario Outline:User edit -Account-MRP tab- "<status>" Filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Training-User" tab
    And The user Assocaited All filter
    And The user selects edit item "<status>"
    Examples:
      |status|
      |Enable|
      |Disable|

  Scenario:User edit -Banner-MRP tab Assocaited All filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Banner-MRP" tab
    And The user Assocaited All filter
    And The user clicks item
    And the user clicks on unsaved change button
    And The user enters "-------" in  comment area
    And The user clicks save button
    And the user verifies item status success message

  Scenario:User edit -Banner-MRP tab  Assocaited No filter
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Banner-MRP" tab
    And The user Assocaited No filter
    Then The user verify No Filter


  Scenario Outline:User edit -Account-MRP tab "<export>" button
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab
    And The user clicks export button "<export>"
    Examples:
    |export|
    |Export Current View|
    |Export Detailed View|
    |Export All          |

  Scenario:User edit -Attributes Tab
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Attributes" tab

    Scenario: User Home Page Columns - Reset Button
      And  The user enters columns button
      And  The user selected columns
      And  The user clicks cancel button columns

  Scenario: User Home Page Columns - save Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns

  Scenario: User Home Page Columns - Default Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks Default button columns



