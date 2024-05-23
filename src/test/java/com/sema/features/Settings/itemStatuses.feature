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

#11/05/2024-------------------------------------------------------------------
  Scenario: Id values should be able to be descending order
    When The user clicks Id header for descending sort
    Then The user verifies that id values are descending order

  Scenario: Id values should be able to be ascending order
    When The user clicks Id header for ascending sort
    Then The user verifies that id values are ascending order

#21/05/2024------------------------------------------------------------------------------
  Scenario: Label values should be able to be ascending order
    When The user clicks Label header for ascending sort
    Then The user verifies that Label values are ascending order

  Scenario: Label values should be able to be descending order
    When The user clicks Label header for descending sort
    Then The user verifies that Label values are descending order

  Scenario Outline: If there is enough data in the table, there must be as many rows as the number selected in the table length
    When The user select "<length>" from table length
    Then The user verifies that table contains right rows according to "<length>"
    Examples:
      | length |
      | 100    |
      | 10     |


#23/05/2024------------------------------------------------------------------------------
    #----------create-------------
  Scenario: The Cancel button in CreateItemStatus modal should be active
    When The user clicks CreateNew button in ItemStatus page
    Then The user verifies that Cancel button is active in CreateItemStatus modal

  Scenario: If at least one input box is empty in the CreateNew Modal, the Create button must be passive.
    When The user clicks CreateNew button in ItemStatus page
    When The user fills the label input in CreateNew Modal
    When The user fills locale inputs except one of them
    Then The user verifies that Create button is passive in CreateNew Modal

  Scenario: If all input boxes are filled in the CreateNew Modal, the Create button must be active.
    When The user clicks CreateNew button in ItemStatus page
    When The user fills the label input in CreateNew Modal
    When The user fills all locale inputs
    Then The user verifies that Create button is active in CreateNew Modal
