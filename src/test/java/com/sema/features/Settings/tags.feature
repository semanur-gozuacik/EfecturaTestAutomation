@regression
Feature: Tags Page Test Cases
  Background:
    Given The User opens the browser with the given url
    Given The User inputs a valid username "validUsername"
    Given The User inputs a valid password "validPassword"
    Given The User clicks the Submit button
    When  The User waits until the System element is visible with a timeout of 120 seconds
    When  The user is on the Tags page


  Scenario: Users should reach Tags page.
    Then  The user verifies that reached the "Tags" page.

  Scenario: Refresh button should be active in Tags page
    Then The user verifies that Refresh button is active

  Scenario Outline: The User verify label filter works correctly
    When  The user enters "<entries>" in to label filter
    Then  The User verifies that label filter results contains "<entries>"

    Examples:
      | entries |
      | ika     |
      | patika  |

  Scenario: If there is no value in the filter result, it should say 'No data available in table'
    When The user enters 'quxysobekps' in to label filter
    Then The user verifies that 'No data available in table' is displayed in table

  Scenario: The filter should return IDs between 63 and 67 inclusive
    When The user enters 63 and 67 in to Id filter
    When The user clicks update button in Id filter
    Then The user verifies that ids are between 63 and 67 inclusive

  Scenario: 'IdFromMustBeLessThanIdTo' warning should displayed if idFrom is greater than idTo
    When The user enters 67 and 63 in to Id filter
    When The user clicks update button in Id filter
    Then The user verifies that 'IdFromMustBeLessThanIdTo' warning is displayed

  Scenario: The user verifies that filter reset button works correctly
    When The user enters "abcd" in to label filter
    When The user clicks reset button
    Then The user verifies that label filter has no value

  Scenario: Id values should be ascending order with no action
    Then The user verifies that id values are ascending order with no action

  Scenario: Id values should be able to be descending order
    When The user clicks Id header for descending sort
    Then The user verifies that id values are descending order

  Scenario: Label values should be able to be ascending order
    When The user clicks Label header for ascending sort
    Then The user verifies that Label values are ascending order

  Scenario: Label values should be able to be descending order
    When The user clicks Label header for descending sort
    Then The user verifies that Label values are descending order

  Scenario: ItemType values should be able to be ascending order
    When The user clicks ItemType header for ascending sort
    Then The user verifies that ItemType values are ascending order

  Scenario: ItemType values should be able to be descending order
    When The user clicks ItemType header for descending sort
    Then The user verifies that ItemType values are descending order