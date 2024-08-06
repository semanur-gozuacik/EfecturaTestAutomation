@regression
Feature: Membership Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 150 seconds
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
    And The user enters "TestMember" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:Membership Organization  edit - Categories Tab
    And The user enters "TestMember" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "RealtimeList" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Attributes" tab

  Scenario:Membership edit -Gifts image Tab Associated Filter No
    And The user enters "TestMember" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "MEMBERSHIP_ACCOUNT" tab
    And The user Assocaited No filter
    Then The user verify No Filter