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

  Scenario:User edit -Account-MRP tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Account-MRP" tab

  Scenario:User edit -Training-User tab control
    And The user enters "Otomasyon" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Training-User" tab

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