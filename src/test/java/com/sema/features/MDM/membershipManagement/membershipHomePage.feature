@regression
Feature: Membership Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Given The user is on the Membership item home page
    And   The User gets the current URL and stores it in "itemType=Membership"

  Scenario:Membership  Verify export button
    When  The user clicks on Export button
  #  Then  The user verify that the export was "Success"

  Scenario:Membership Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:Membership Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario:Membership Home Page Verify Item next Button Unclickable Condition
    When The user clicks last page button
    And  The user verifies next button is not clickable

  Scenario:Membership Home Page Verify Last Page Button Unclickable Condition
    When The user clicks last page button
   # And  The user verifies last page button is not clickable

  Scenario:Membership Home Page Verify First Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies first page button is clickable

  Scenario:Membership Home Page Verify Previous Page Button Clickable Condition
    When The user clicks last page button
    And  The user verifies previous page button is clickable

  Scenario:Membership Home Page Verify Item next Button Clickable Condition
    And  The user verifies next button is clickable

  Scenario: Membership Reset Button Control
    And The user enters "TestMember" into "Code" filter text input box
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Membership Organization  edit - Categories Tab
    And The user enters "TestMember" into "Code" filter text input box
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into "Code" filter text input box
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into "Code" filter text input box
    And  The user clicks on Edit Button
    And The user clicks "RealtimeList" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into "Code" filter text input box
    And  The user clicks on Edit Button
    And The user clicks "Attributes" tab

  Scenario:Membership edit -Gifts image Tab Associated Filter No
    And The user enters "TestMember" into "Code" filter text input box
    And  The user clicks on Edit Button
    And The user clicks "MEMBERSHIP_ACCOUNT" tab
    And The user Assocaited No filter
    Then The user verify No Filter

  Scenario Outline: Membership Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |
      |25 |
      |50 |
      |100|

  Scenario: Membership Home Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks cancel button columns

  Scenario: Membership Page Columns - Reset Button
    And  The user enters columns button
    And  The user selected columns
    And  The user clicks save button columns

  Scenario Outline: Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "TestMember" into "Code" filter text input box
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks cancel button
       #And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |


  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    And the user clicks on ItemStatuses
    And the user clicks on "<ItemStatus>"
    And the user clicks on Search button
     #And the incoming filter for "<ItemStatus>" should contain
    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |