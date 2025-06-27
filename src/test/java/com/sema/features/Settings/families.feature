@regression
Feature: Families Management Test Cases
  Background:
    When   The User opens the browser with the given url
    And    The User inputs a valid username "validUsername"
    And    The User inputs a valid password "validPassword"
    And    The User clicks the Submit button
#    Then  The User waits until the System element is visible with a timeout of 120 seconds
#    And   The User performs a mouseover on the System element symbol
    Given The user on the settings families page
    And   The User gets the current URL and stores it in "Settings/Families"

    Scenario: Families pages tables verification
      Then The User verifies Families page table is displayed
  @test
  Scenario: Reset Button Control
    And The user enters "ACCOUNT_TEST" into "Code" filter text input box
    And The user reset the basic filters
    And The user verify Reset button func for "Code" text filter

  Scenario Outline:Families Page-User selects different options for show entries
    When The user select "<entry>" in table show entry select
    Then The user verifies that table contains right rows according to "<entry>"
    Examples:
      | entry       |
      | 100 Entries |
      | 50 Entries  |
      | 25 Entries  |
      | 10 Entries  |

  Scenario:Families Page Verify First Page Button Unclickable Condition
    And  The user verifies "firstpage" button is "Passive"

  Scenario:Families Page Verify Previous Page Button Unclickable Condition
    And  The user verifies "previous" button is "Passive"

  Scenario:Families Page Verify Item next Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "next" button is "Passive"

  Scenario: Families Page Verify Last Page Button Unclickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "lastpage" button is "Passive"

  Scenario:Families Page Verify First Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "firstpage" button is "Active"

  Scenario:Families Page Verify Previous Page Button Clickable Condition
    When The user clicks 'lastpage' pagination button
    And  The user verifies "previous" button is "Active"

  Scenario:Families Page Verify Item next Button Clickable Condition
    And  The user verifies "next" button is "Active"

  Scenario: Families Page Verify Last Page Button Clickable Condition
    And  The user verifies "lastpage" button is "Active"
