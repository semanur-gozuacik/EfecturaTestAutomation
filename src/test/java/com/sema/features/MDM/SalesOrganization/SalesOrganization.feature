@regression @yeni
Feature: Sales Organization Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
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

  Scenario: Sales Organization Reset Button Control
    And The user enters "test2123" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Sales Organization Verify Label Filter - Valid Label
    And The user enters "TEST123456" into Label field
    And the user clicks on Search button

  Scenario:Sales Organization Create List- create button
    And  The user clicks plus icon
    Then The user verifies New List pop up is open
    When The user enters "otomasyon" List Name

  Scenario: Sales Organization Edit item removed list
    And  The user enters "TESTBM" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
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

  Scenario:Sales Organization Verify Code Filter - Invalid Unique Code
    And The user enters "sema12345" into Code field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario::Sales Organization Group Permission Verify Item First Page Button Unclickable Condition
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    #And  The user verifies previous button is not clickable asset

  Scenario::Sales Organization Group Permission Verify Item Previous Page Button Unclickable Condition
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    And  The user verifies previous page button is not clickable asset

  Scenario:Sales Organization Group Permission Verify Item next Button clickable Condition
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    And  The user verifies next button is clickable asset

  Scenario:Sales Organization  Group Permission Verify Previous Page Button clickable Condition
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks next page button asset
    When The user clicks next page button asset
    When The user clicks previous page button asset
    And  The user verifies previous button is clickable asset

  Scenario:Sales Organization Group Permission Verify Last Page Button clickable Condition
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And clicks group permission tab
    When The user clicks last page button asset
    And  The user verifies last button is clickable asset

  Scenario:Sales Organization edit -SO_MRP Associated
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "BM_SM" tab
    And The user Assocaited All filter

  Scenario:Sales Organization  edit - SO_MRP Tab Associated Filter No
    And The user enters "TESTBM" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "BM_SM" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario: Sales Organization Home Page Columns - Cancel Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns

  Scenario: Sales Organization Home Page Columns - save Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns

  Scenario Outline: Sales Organization Associated Tab Status Fılter "<Status>"
    And The user enters "TESTBM" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks "BM_SM" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |