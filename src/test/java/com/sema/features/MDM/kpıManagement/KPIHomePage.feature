@regression
Feature: KPI Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 150 seconds
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
    When  The user clicks on Export button
  #  Then  The user verify that the export was "Success"

  Scenario:KPI Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:KPI Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:KPI Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:KPI Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:KPI Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:KPI Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:KPI Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario:KPI Home Page Verify Last Page Button Clickable Condition
    And  The user verifies last page button is clickable

  Scenario: KPI Reset Button Control
    And The user enters "test2123" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario: Create List- create button-exist user
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "Sematestyeni" List Name
   # And  The user enters "_5458429214" Can view
    # And  The user enters "1757483988_5392786463" Can edit
   # And  The user clicks create button-New List
   # Then The user verifies error message "USER_LIST_ALREADY_EXISTS" is displayed

  Scenario Outline: KPI Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|
      |250|

  Scenario: KPI page edit verify
    And The user enters "YENİTEST1411" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "Montly Point Sum" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
       #And The user clicks cancel button
      # And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |
      # |Passive    |

  Scenario:Contact edit -History Tab
    And The user enters "Montly Point Sum" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:Contact edit -Categories Tab
    And The user enters "Montly Point Sum" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab

  Scenario:Contact edit - Transaction Tab
    And The user enters "Montly Point Sum" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Transaction History" tab

  Scenario:Contact edit -ItemComment Tab
    And The user enters "Montly Point Sum" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "ItemComment" tab

  Scenario:KPI Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    #And  The user verifies previous button is not clickable asset

  Scenario:KPI Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:KPI Group Permission Verify Item next Button clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset

  Scenario:KPI Group Permission Verify Previous Page Button clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario:KPI Group Permission Verify Last Page Button clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario:KPI Group Permission Verify Last Page Button Unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is unclickable asset

  Scenario:KPI Group Permission Verify Item next Button unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies next button is unclickable asset

  Scenario:KPI Group Permission Verify Item First Page Button Clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
   # And  The user verifies first page button is clickable asset

  Scenario:KPI User Permission Verify Item First Page Button Unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies first page button is not clickable user

  Scenario:KPI User Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    And  The user verifies previous page button is not clickable user

  Scenario:KPI User Permission Verify Item next Button clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    And  The user verifies next button is clickable user

  Scenario:KPI User Permission Verify Previous Page Button clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks next page button user
    When The user clicks next page button user
    When The user clicks previous page button user
    And  The user verifies previous button is clickable user

  Scenario:KPI User Permission Verify Last Page Button clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is clickable user

  Scenario:KPI User Permission Verify Last Page Button Unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies last button is unclickable asset

  Scenario:KPI User Permission Verify Item next Button unclickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies next button is unclickable user

  Scenario:KPI User Permission Verify Item First Page Button Clickable Condition
    And The user enters "sematest123" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks user permission tab
    When The user clicks last page button user
    And  The user verifies first page button is clickable user