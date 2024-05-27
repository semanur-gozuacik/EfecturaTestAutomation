
Feature: File Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    Given The user is on the File Managemenet item home page
    And   The User gets the current URL and stores it in "itemType=File"
  @regression
  Scenario:File Verify export button
    When  The user clicks on Export button
  @regression
  Scenario:File Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable
  @regression
  Scenario:File Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable
  @regression
  Scenario Outline: File  Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |

  @regression
  Scenario: File  Home Page Reset Button Control
    And The user enters "test2123" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality
  @regression
  Scenario:File  Home Page Verify Label Filter - Valid Label
    And The user enters "TEST123456" into Label field
    And the user clicks on Search button


  Scenario: File  Home Page Verify Label Filter - Invalid  Label
    And The user enters "44444" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario Outline: File  Home Page Filter "<ItemStatus>" Item Statuses
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
    And the user clicks on Search button
    # And the incoming filter for "<ItemStatus>" should contain
    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Blanks    |

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
    And The user enters "File_14222378" into Code field
    And  the user clicks on Search button
    And  The user clicks on Edit Button
    And  The user clicks "BANNER_MRP" tab
    And  The user clicks Associated status
    And  The user selects  "<Status>"
    Then The user verifies displayed "<Status>" is correct
    Examples:
      |Status|
      |Status:All|
      |Enabled   |
      |Disabled  |
