@regression
Feature: Tags Page Test Cases
  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds
    When  The user is on the ItemStatuses page


  Scenario: Users should reach ItemStatuses page.
    Then  The user verifies that reached the "ItemStatuses" page.

  Scenario: Refresh button should be active in ItemStatuses page
    Then The user verifies that Refresh button is active

  Scenario Outline: Label filter should filter entries for both partial and full data
    When  The user enters "<entries>" in to label filter
    Then  The User verifies that label filter results contains "<entries>"

    Examples:
      | entries |
      | pas     |
      | Passive |
      | On Hold |
      | Hold    |

  Scenario: If there is no value in the filter result, it should say 'No data available in table'
    When The user enters 'quxysobekps' in to label filter
    Then The user verifies that 'No matching records found' is displayed in table

  Scenario: The filter should return searched Id
    When The user enters 3 in to Id filter
    Then The user verifies that id column has only 3

  Scenario: If there is no value in id filter result, it should say 'No matching records found'
    When The user enters 1546 in to Id filter
    Then The user verifies that 'No matching records found' is displayed in table

  Scenario: Reset button should work correctly on Label filter
    When The user enters "abcd" in to label filter
    When The user clicks reset button
    Then The user verifies that label filter has no value

    #03/05/2024-------------------------------------------------------------------
  Scenario: Reset button should work correctly on id filter
    When The user enters 3 in to Id filter
    When The user clicks reset button
    Then The user verifies that id filter has no value in ItemStatuses page