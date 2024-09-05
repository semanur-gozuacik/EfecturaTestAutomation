@regression
Feature: RoofCard Management Test Cases- Contact Home Page
  Background:
    When   The User opens the browser with the given url
    And   The User inputs a valid username "validUsername"
    And   The User inputs a valid password "validPassword"
    And   The User clicks the Submit button
    Then   The User waits until the MDM element is visible with a timeout of 15 seconds
    Given The user is on the RoofCard item home page
    And   The User gets the current URL and stores it in "itemType=RoofCard"

  Scenario:RoofCard Verify export button
    When  The user clicks on Export button
    #Then  The user verify that the export was "Success"

  Scenario:RoofCard Home Page Verify First Page Button Unclickable Condition
    And  The user verifies first page button is not clickable

  Scenario:RoofCard Home Page Verify Previous Page Button Unclickable Condition
    And  The user verifies previous page button is not clickable

  Scenario Outline: RoofCard Home Page User selects different options for show entries
    When  The user selects "<entries>" into show entries
    Then  The user should see  "<entries>" entrie in everypage
    Examples:
      | entries|
      |10 |

  Scenario: RoofCard Home Page Reset Button Control
    And The user enters "roofcard" into Code field
    And the user clicks on Reset button
    And the user verify Reset button functionality

  Scenario:RoofCard Home Page Verify Label Filter - Invalid  Label
    And The user enters "sema12345" into Label field
    And the user clicks on Search button
    And the user verify on code filter functionality  with invalid unique code "No matching records found"

  Scenario:RoofCard Organization  edit - Categories Tab
    And The user enters "roof_card_test" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Categories" tab

  Scenario:RoofCard Organization  edit - Categories Tab
    And The user enters "roof_card_test" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "History" tab

  Scenario:RoofCard Organization  edit - Categories Tab
    And The user enters "roof_card_test" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks "Attributes" tab

  Scenario: RoofCard Export Entity Button - Associations
    And The user enters "roof_card_test" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Associations
    Then The user dowloand Export Entity verifies

  Scenario: RoofCard Export Entity Button - Permission
    And The user enters "roof_card_test" into Code field
    And the user clicks on Search button
    And  The user clicks on Edit Button
    And The user clicks Export Entity Button
    And The user clicks Export Permission
    Then The user dowloand Export Entity verifies

  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses - cancel button
    And The user enters "2943740465" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |


  Scenario Outline:Account Edit item status "<ItemStatus>" Item Statuses- save button
    And The user enters "2943740465" into Code field
    And the user clicks on Search button
    And The user clicks on Edit Button
    And the user selects "<ItemStatus>"

    Examples:
      |ItemStatus |
      |Active     |
      |Passive    |
      |Approved     |