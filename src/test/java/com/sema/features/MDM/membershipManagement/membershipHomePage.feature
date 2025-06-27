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
    When The user click on export "all" button in overview
    Then The user verifies info "Success" appears

  Scenario:Membership Home Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:Membership Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario:Membership Home Page Verify Item next Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "next" button is "Passive"

  Scenario:Membership Home Page Verify Last Page Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "lastpage" button is "Passive"

  Scenario:Membership Home Page Verify First Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "firstpage" button is "Active"

  Scenario:Membership Home Page Verify Previous Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "previous" button is "Active"

  Scenario:Membership Home Page Verify Item next Button Clickable Condition
    And  The user verifies "next" button is "Active"

  Scenario: Membership Reset Button Control
    And The user enters "TestMember" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario:Membership Organization  edit - Categories Tab
    And The user enters "TestMember" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Categories" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "History" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "RealtimeList" tab

  Scenario:Membership Organization edit - History Tab
    And The user enters "TestMember" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "Attributes" tab

  Scenario:Membership edit -Gifts image Tab Associated Filter No
    And The user enters "TestMember" into "Code" filter text input box
    And The user clicks on edit button in table
    And The user clicks "MEMBERSHIP_ACCOUNT" tab
    And The user select "No" in "IsAssociated" select filter
    Then The user verify "Associated" select filter with value "No" in "associationTable"

  Scenario Outline: Membership Home Page User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |

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
    And The user clicks on edit button in table
    And The user select ItemStatus as "<ItemStatus>"
      # And the user clicks on unsaved change button
      # And The user enters "-------" in  comment area
      # And The user clicks cancel button
       #And the user verifies item status not change

    Examples:
      |ItemStatus |
      |Active     |


  Scenario Outline: Filter "<ItemStatus>" Item Statuses
    And The user select "<ItemStatus>" in "ItemStatus" select filter
     #And the incoming filter for "<ItemStatus>" should contain
    Examples:
      | ItemStatus |
      | Active     |
      | Passive    |